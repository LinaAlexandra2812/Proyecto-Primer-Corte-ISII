package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Organizador;
import java.util.List;

public interface InterfaceRepositorioOrganizador {
    public boolean almacenarOrganizador (Organizador objOrganizador);
    public List<Organizador> listarOrganizadores();
}
