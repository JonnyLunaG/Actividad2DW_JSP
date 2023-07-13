package co.edu.udec.devweb.activdad2.JonnyLunaG.modelo;

import java.util.logging.Logger;


public class Usuario {
    int id;
    int cedula;
    String clave;
    String nombre;
    String apellido;
    String genero;
    String email;

    public Usuario(int id, int cedula, String clave, String nombre, String apellido, String genero, String email) {
        this.id = id;
        this.cedula = cedula;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.email = email;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public int getCedula() {
        return cedula;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
