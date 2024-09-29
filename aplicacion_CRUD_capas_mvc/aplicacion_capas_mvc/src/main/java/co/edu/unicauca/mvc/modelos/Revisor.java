package co.edu.unicauca.mvc.modelos;

public class Revisor extends Persona{
    
<<<<<<< HEAD
    private String titulo_universitario;
    
    public Revisor(int cedula, String nombre, String correo, int telefono, String rol, String titulo_universitario) {
        super(cedula, nombre, correo, telefono, rol);
        this.titulo_universitario = titulo_universitario;
    }

    public String getTitulo_universitario() {
        return titulo_universitario;
    }

    public void setTitulo_universitario(String titulo_universitario) {
        this.titulo_universitario = titulo_universitario;
=======
    private String tituloUniversitario;
    
    public Revisor(int cedula, String nombre, String correo, String password, int telefono, int rol) {
        super(cedula, nombre, correo, password, telefono, rol);
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
>>>>>>> 90ad9ed66d780e10e0dac138525d3dc9ae830360
    }
    
}
