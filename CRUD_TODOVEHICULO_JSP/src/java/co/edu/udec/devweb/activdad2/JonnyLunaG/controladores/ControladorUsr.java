package co.edu.udec.devweb.activdad2.JonnyLunaG.controladores;

import co.edu.udec.devweb.activdad2.JonnyLunaG.modelo.Usuario;
import co.edu.udec.devweb.activdad2.JonnyLunaG.modelo.dao.Usuario_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ControladorUsr extends HttpServlet {

    String registrar="/views/usuarios/registar.jsp";
    String listar="/views/usuarios/listar.jsp";
    String dashboard="/views/sistema.jsp";
    String login="/views/usuarios/login.jsp";
    String rutas="";
    Usuario usr=new Usuario();
    Usuario_DAO Usr_dao=new Usuario_DAO();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorUsr</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorUsr at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion=request.getParameter("accion");
        if(accion.equalsIgnoreCase("listar")){
            rutas=listar;
        }else if(accion.equalsIgnoreCase("logout")){
            HttpSession session = request.getSession(false);
            if (session != null) {
                session.invalidate(); // borra y pone null la sesión actual, si existe
            }
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
        RequestDispatcher vista=request.getRequestDispatcher(rutas);
        vista.forward(request, response); 
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion=request.getParameter("accion");
        HttpSession sesion=request.getSession();
        Usuario_DAO Usr_dao=new Usuario_DAO();   
        
        if (accion.equalsIgnoreCase("login")) {
            String cedula = request.getParameter("cedula");
            String clave = request.getParameter("clave");
            
            if (cedula.isEmpty() || clave.isEmpty()) {
                request.setAttribute("message", "<div class=\"alert alert-danger\" role=\"alert\">\n" +
"        Error al iniciar Sesion<a class=\"alert-link\">la cedula y la clave son obligatorios</a>.\n" +
"    </div>");
                request.setAttribute("usr_error","Usuario no Existe");
                rutas=login;
            } else {
                Usuario loguedat=Usr_dao.login(Integer.parseInt(cedula), clave);
                sesion.setAttribute("email", loguedat.getEmail());
                rutas=dashboard;
            }
        }
       RequestDispatcher vista=request.getRequestDispatcher(rutas);
       vista.forward(request, response);  
    }

    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
