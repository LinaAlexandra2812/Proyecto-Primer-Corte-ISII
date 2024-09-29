package co.edu.unicauca.mvc.modelos;

public class Persona {
    private int cedula;
    private String nombre;
    private String correo;
<<<<<<< HEAD
    private String password;
    private int telefono;
    private int rol;

    public Persona(int cedula, String nombre, String correo, String password, int telefono, int rol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
=======
    private int telefono;
    private String rol;

    public Persona(int cedula, String nombre, String correo, int telefono, String rol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
>>>>>>> main
        this.telefono = telefono;
        this.rol = rol;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

<<<<<<< HEAD
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

=======
>>>>>>> main
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

<<<<<<< HEAD
    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
=======
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
>>>>>>> main
}
