package co.edu.udec.devweb.activdad2.JonnyLunaG.interfaces;

import co.edu.udec.devweb.activdad2.JonnyLunaG.modelo.Vehiculo;
import java.util.List;


public interface CRUD_Vehi {
         public List listar();
        public boolean registro(Vehiculo usr);
        public boolean create(Vehiculo usr);
        public Vehiculo readbyid(int id);
        public boolean update(Vehiculo usr);
        public boolean delete(int id);
    
}
