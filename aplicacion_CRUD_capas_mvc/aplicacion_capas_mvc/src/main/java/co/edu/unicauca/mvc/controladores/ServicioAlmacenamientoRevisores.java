package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioRevisor;
import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.List;

public class ServicioAlmacenamientoRevisores {

    private InterfaceRepositorioRevisor referenciaRepositorioRevisor;

    public ServicioAlmacenamientoRevisores(InterfaceRepositorioRevisor referenciaRepositorioRevisor) {
        this.referenciaRepositorioRevisor = referenciaRepositorioRevisor;
    }

    public boolean almacenarRevisor(Revisor objRevisor) {
        return this.referenciaRepositorioRevisor.almacenarRevisores(objRevisor);
    }

    public List<Revisor> listarArticulos() {
        return this.referenciaRepositorioRevisor.listarRevisores();
    }
}
