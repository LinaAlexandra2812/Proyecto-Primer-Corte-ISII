package co.edu.unicauca.mvc.modelos;

import java.util.ArrayList;

public class Autor extends Persona{
    
    private ArrayList<Articulo> lista_publicaciones;
    
    public Autor(int cedula, String nombre, String correo, int telefono, String rol) {
        super(cedula, nombre, correo, telefono, rol);
        this.lista_publicaciones = new ArrayList<>();
    }
    
}
