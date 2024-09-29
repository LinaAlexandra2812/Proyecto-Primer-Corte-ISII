package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioOrganizador;
import co.edu.unicauca.mvc.modelos.Organizador;
import java.util.List;

public class ServicioAlmacenamientoOrganizadores {
    private InterfaceRepositorioOrganizador referenciaRepositorioOrganizador;

    public ServicioAlmacenamientoOrganizadores(InterfaceRepositorioOrganizador referenciaRepositorioOrganizador) {
        this.referenciaRepositorioOrganizador = referenciaRepositorioOrganizador;
    }
    
    public boolean almacenarOrganizador(Organizador objOrganizador) {
        return this.referenciaRepositorioOrganizador.almacenarOrganizador(objOrganizador);
    }
    
    public List<Organizador> listarOrganizadores() {
        return this.referenciaRepositorioOrganizador.listarOrganizadores();
    }
}
