package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.modelos.Articulo;
import java.util.List;
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
        nuevoArticulo.setResumen("Resumen de prueba");
        nuevoArticulo.setKeyword("Palabras, clave, de, prueba");
        nuevoArticulo.setEstado("Aceptado");
        
        boolean resultado = servicio.almacenarArticulo(nuevoArticulo);
        
        assertTrue(resultado, "El artículo debería almacenarse correctamente");
    }
    
    @Test
    public void listarArticulosTest(){
        List<Articulo> articulos = servicio.listarArticulos();
        
        assertNotNull(articulos, "La lista de articulos no deberia ser nula");
        assertFalse(articulos.isEmpty(), "Deberia haber al menos un articulo almacenado");
    }
    
    @Test
    public void actualizarArticuloTest(){
        Articulo articulo = new Articulo();
        articulo.setTitulo("Articulo de prueba");
        articulo.setResumen("Resumen de prueba");
        articulo.setKeyword("Palabras, clave, de, prueba");
        articulo.setEstado("Aceptado");
        servicio.almacenarArticulo(articulo);
        

        articulo.setResumen("Resumen de prueba actualizado");
        articulo.setKeyword("Palabras, clave, de, prueba, actualizadas");
        
        boolean resultado = servicio.actualizarArticulo(articulo);
        
        assertTrue(resultado, "El articulo deberia actualizarse correctamente");
    }
    
    @Test
    public void consultarArticuloTest(){
        Articulo nuevoArticulo = new Articulo();
        nuevoArticulo.setTitulo("Articulo de prueba");
        servicio.almacenarArticulo(nuevoArticulo);
        
        int idArticulo = nuevoArticulo.getIdArticulo();
        
        Articulo articulo = servicio.consultarArticulo(idArticulo);
        
        assertNotNull(articulo, "El articulo consultado no deberia ser nulo");
        assertEquals(idArticulo, articulo.getIdArticulo(), "El ID del articulo deberia coincidir");
    }
    
    @Test
    public void eliminarArticuloTest(){
        
        Articulo nuevoArticulo = new Articulo();
        nuevoArticulo.setTitulo("Articulo de prueba para eliminar");
        servicio.almacenarArticulo(nuevoArticulo);
        
        int idArticulo = nuevoArticulo.getIdArticulo();
        
        boolean resultado = servicio.eliminarArticulo(idArticulo);
        
        assertTrue(resultado, "El articulo deberia eliminarse correctamente");
    }
}
