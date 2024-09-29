package co.edu.unicauca.mvc.accesoADatos;

import java.util.HashMap;
import java.util.Map;

/**
 * Fabrica que se encarga de instanciar ProductRepository o cualquier otro que
 * se cree en el futuro.
 *
 * @author Libardo, Julio
 */
public class Factory {

    private Map<String, InterfaceRepositorioArticulo> repositorioArticulo;
    private Map<String, InterfaceRepositorioConferencia> repositorioConferencia;

    /**
     * Singleton
     */
    private static Factory instance;

    private Factory() {
        repositorioArticulo = new HashMap<>();
        repositorioArticulo.put("default", new RepositorioArticuloSqlite());
        repositorioArticulo.put("mongo", new RepositorioArticuloSqlite());
        
        repositorioConferencia = new HashMap<>();
        repositorioConferencia.put("default", new RepositorioConferenciaSqlite());
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IProductRepository
     *
     * @param type cadena que indica qué tipo de clase hija debe instanciar
     * @return una clase hija de la abstracción IProductRepository
     */
    public InterfaceRepositorioArticulo getRepository(String type) {

        InterfaceRepositorioArticulo result = null;

        if (repositorioArticulo.containsKey(type)) {
            result = repositorioArticulo.get(type);
        }

        return result;
    }
    
    public InterfaceRepositorioConferencia getRepositorioConfencia (String type){
        
        InterfaceRepositorioConferencia result = null;
        
        if(repositorioConferencia.containsKey(type)){
            result = repositorioConferencia.get(type);
        }
        
        return result;
    }
}
