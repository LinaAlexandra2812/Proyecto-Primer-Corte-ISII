package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.modelos.Articulo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ServicioAlmacenamientoArticulosTest {
    
    private ServicioAlmacenamientoArticulos servicio;
    
    @BeforeEach
    public void setUp(){
        RepositorioArticuloSqlite repositorio = new RepositorioArticuloSqlite();
        servicio = new ServicioAlmacenamientoArticulos(repositorio);
    }
    
    
    @Test
    public void almacenarArticuloTest(){
        Articulo nuevoArticulo = new Articulo();
        nuevoArticulo.setTitulo("Articulo de prueba");
        nuevoArticulo.setDescripcion("Descripcion de prueba");
        nuevoArticulo.setResumen("Resumen de prueba");
        nuevoArticulo.setKeyword("Palabras, clave, de, prueba");
        nuevoArticulo.setEstado("Aceptado");
        
        boolean resultado = servicio.almacenarArticulo(nuevoArticulo);
        
        assertTrue(resultado, "El artículo debería almacenarse correctamente");
    }
}
