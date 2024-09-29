package co.edu.unicauca.mvc.modelos;

public class Organizador extends Persona{
    
<<<<<<< HEAD
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
=======
    private String areaEspecializada;

    public Organizador(int cedula, String nombre, String correo, String password, int telefono, int rol) {
        super(cedula, nombre, correo, password, telefono, rol);
    }

    public String getAreaEspecializada() {
        return areaEspecializada;
    }

    public void setAreaEspecializada(String areaEspecializada) {
        this.areaEspecializada = areaEspecializada;
>>>>>>> 90ad9ed66d780e10e0dac138525d3dc9ae830360
    }
    
}
