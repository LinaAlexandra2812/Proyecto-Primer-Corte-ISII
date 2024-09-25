package co.edu.unicauca.mvc.modelos;

public class Revisor extends Persona{
    
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
    }
    
}
