package co.edu.unicauca.mvc.modelos;

<<<<<<< HEAD
import java.util.ArrayList;

public class Autor extends Persona{
    
    private ArrayList<Articulo> lista_publicaciones;
    
    public Autor(int cedula, String nombre, String correo, int telefono, String rol) {
        super(cedula, nombre, correo, telefono, rol);
        this.lista_publicaciones = new ArrayList<>();
=======
import java.util.List;

public class Autor extends Persona{
    
    private List<Articulo> listaArticulos;

    public Autor(int cedula, String nombre, String correo, String password, int telefono, int rol) {
        super(cedula, nombre, correo, password, telefono, rol);
    }

    public List<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(List<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
>>>>>>> 90ad9ed66d780e10e0dac138525d3dc9ae830360
    }
    
}
