package co.edu.udec.devweb.activdad2.JonnyLunaG.interfaces;
import co.edu.udec.devweb.activdad2.JonnyLunaG.modelo.Usuario;
import java.util.List;


public interface CRUD_Usr {
        public List listar();
        public boolean registro(Usuario usr);
        public boolean create(Usuario usr);
        public Usuario readbyid(int id);
        public boolean update(Usuario usr);
        public boolean delete(int id);
    
}
