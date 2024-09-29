package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioAutor;
import co.edu.unicauca.mvc.modelos.Autor;
import java.util.List;

public class ServicioAlmacenamientoAutores {
    
    private InterfaceRepositorioAutor referenciaRepositorioAutor;

    public ServicioAlmacenamientoAutores(InterfaceRepositorioAutor referenciaRepositorioAutor) {
        this.referenciaRepositorioAutor = referenciaRepositorioAutor;
    }
    
    public boolean almacenarAutor(Autor objAutor)
    {
        return this.referenciaRepositorioAutor.almacenarAutor(objAutor);
    }
      
    //Error al listar artículos
    public List<Autor> listarAutores()
    {
        return this.referenciaRepositorioAutor.listarArticulos();
    }
    
    public boolean eliminarAutor(int idAutor)
    {
        return this.referenciaRepositorioAutor.eliminarAutor(idAutor);
    }
    
    public Autor consultarAutor(int idAutor)
    {
        return this.referenciaRepositorioAutor.consultarAutor(idAutor);
    }
    
    public boolean actualizarAutor(Autor objAutor)
    {
        return this.referenciaRepositorioAutor.actualizarAutor(objAutor);
    }
}
