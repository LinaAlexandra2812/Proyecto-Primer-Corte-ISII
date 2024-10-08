package co.edu.unicauca.mvc.accesoADatos;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoConferencias;
import co.edu.unicauca.mvc.modelos.Conferencia;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicioAlmacenamientoConferenciasTest {
        private ServicioAlmacenamientoConferencias servicio;
    
    @BeforeEach
    public void setUp(){
        RepositorioConferenciaSqlite repositorio = new RepositorioConferenciaSqlite();
        servicio = new ServicioAlmacenamientoConferencias(repositorio);
    }
    
    
    @Test
    public void almacenarConferenciaTest(){
        Conferencia nuevaConferencia = new Conferencia();
        Date fechaInicio = new Date(2024-1900, 9, 21);
        
        nuevaConferencia.setNombre("Nombre de conferencia de prueba");
        nuevaConferencia.setLugar("Popayan");
        nuevaConferencia.setTema("Tema de prueba");
        nuevaConferencia.setDescripcion("Descripcion de prueba");
        nuevaConferencia.setContacto("1234567890");
        nuevaConferencia.setFechaInicio(fechaInicio);
        
        boolean resultado = servicio.almacenarConferencia(nuevaConferencia);
        
        assertTrue(resultado, "La conferencia debería almacenarse correctamente");
    }
    
    @Test
    public void listarConferenciasTest(){
        List<Conferencia> articulos = servicio.listarConferencias();
        
        assertNotNull(articulos, "La lista de Conferencias no deberia ser nula");
        assertFalse(articulos.isEmpty(), "Deberia haber al menos una conferencia almacenado");
    }
}
