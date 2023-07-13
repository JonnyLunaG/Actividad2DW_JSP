package co.edu.udec.devweb.activdad2.JonnyLunaG.modelo.dao;

import Config.Conexion;
import co.edu.udec.devweb.activdad2.JonnyLunaG.interfaces.CRUD_Usr;
import co.edu.udec.devweb.activdad2.JonnyLunaG.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Usuario_DAO implements CRUD_Usr {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuario usr=new Usuario();

    
    public Usuario login(int cedula, String clave) {
        String sql= "SELECT * FROM usuarios WHERE cedula=? AND clave =? ";
        try{
             con=cn.getConnection();
             ps=con.prepareStatement(sql);
             ps.setInt(1, cedula);
             ps.setString(2, clave);
             rs=ps.executeQuery();      
             
            while(rs.next()){
                usr.setId(rs.getInt(1));
                usr.setCedula(rs.getInt(2));
                usr.setNombre(rs.getString(4));
                usr.setApellido(rs.getString(5));
                usr.setGenero(rs.getString(6));
                usr.setEmail(rs.getString(7));

            } 
        }catch (SQLException e) {
            return null;
        }
        
        return usr;
    }   
    
    @Override
    public List listar() {
        String sql="select * from usuarios";
        ArrayList<Usuario>list=new ArrayList<>();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario usr=new Usuario();
                usr.setId(rs.getInt("Id"));
                usr.setCedula(rs.getInt("cedula"));
                usr.setNombre(rs.getString("nombre"));
                usr.setApellido(rs.getString("apellido"));                
                usr.setGenero(rs.getString("genero"));
                usr.setEmail(rs.getString("email"));
                list.add(usr);
            }
        } catch (Exception e) {
        }
        return list;
    }    
       

    @Override
    public boolean registro(Usuario usr) {
          return false;
    }

    @Override
    public boolean create(Usuario usr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario readbyid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Usuario usr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
