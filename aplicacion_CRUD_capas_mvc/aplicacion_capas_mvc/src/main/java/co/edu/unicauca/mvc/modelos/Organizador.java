package co.edu.unicauca.mvc.modelos;

public class Organizador extends Persona{
    
    private String area_especializada;

    public Organizador(int cedula, String nombre, String correo, int telefono, String rol, String area_especializada) {
        super(cedula, nombre, correo, telefono, rol);
        this.area_especializada = area_especializada;
    }

    public String getArea_especializada() {
        return area_especializada;
    }

    public void setArea_especializada(String area_especializada) {
        this.area_especializada = area_especializada;
    }
    
}
