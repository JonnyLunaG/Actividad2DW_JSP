package co.edu.udec.devweb.activdad2.JonnyLunaG.modelo;


public class Vehiculo {
 int id;
 String placa;
 String marca;
 String modelo;
 String version;
 String color;
 int numPuestos;
 int numPuertas;
 String combustible;
 int kilometros;
 int cilindraje;
 int categoria;

    public Vehiculo(String placa, String marca, String modelo, String version, String color, int numPuestos, int numPuertas, String combustible, int kilometros, int cilindraje, int categoria) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.version = version;
        this.color = color;
        this.numPuestos = numPuestos;
        this.numPuertas = numPuertas;
        this.combustible = combustible;
        this.kilometros = kilometros;
        this.cilindraje = cilindraje;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getVersion() {
        return version;
    }

    public String getColor() {
        return color;
    }

    public int getNumPuestos() {
        return numPuestos;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getCombustible() {
        return combustible;
    }

    public int getKilometros() {
        return kilometros;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumPuestos(int numPuestos) {
        this.numPuestos = numPuestos;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
 
    
    
}
