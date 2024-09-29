package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.List;

public interface InterfaceRepositorioRevisor {
    public boolean almacenarRevisores(Revisor objRevisor);
    public List<Revisor> listarRevisores();
}
