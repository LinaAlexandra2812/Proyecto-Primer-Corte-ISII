package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Revisor;
import java.sql.Connection;
import java.util.List;

public class RepositorioRevisorSqlite implements InterfaceRepositorioRevisor{

    private Connection connection;
    
    public RepositorioRevisorSqlite() {
        
    }
    
    @Override
    public boolean almacenarRevisor(Revisor objRevisor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Revisor> listarRevisores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
