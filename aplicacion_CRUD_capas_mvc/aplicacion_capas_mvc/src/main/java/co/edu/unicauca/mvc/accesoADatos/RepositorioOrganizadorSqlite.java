package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoOrganizadores;
import co.edu.unicauca.mvc.modelos.Organizador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioOrganizadorSqlite implements InterfaceRepositorioOrganizador{
    
    private Connection connection;

    public RepositorioOrganizadorSqlite() {
        
    }

    @Override
    public boolean almacenarOrganizador(Organizador objOrganizador) {
        try{
            if (objOrganizador == null || objOrganizador.getCedula() < 0 || objOrganizador.getNombre().isBlank()) {
                return false;
            }
            
            String sql = "";
            
            PreparedStatement pStatement = connection.prepareStatement(sql);
            
        } catch (SQLException ex){
            Logger.getLogger(ServicioAlmacenamientoOrganizadores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Organizador> listarOrganizadores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void initDataBase() {
        String sql = "CREATE TABLE IF NOT EXISTS Trabajo (\n"
                + "     id_trabajo INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "     titulo TEXT,\n"
                + "     descripcion TEXT, resumen TEXT,\n"
                + "     keyword TEXT,\n"
                + "     estado TEXT,\n"
                + "     CHECK ((estado = 'Aceptado' OR estado = 'Rechazado' OR estado = 'En revision' OR estado = 'Pendiente evaluacion'))"
                + ");";

        try {
            this.connect();
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioAlmacenamientoOrganizadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connect() {
        String url = "jdbc:sqlite:./proyectoSoftwareII.db";

        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioAlmacenamientoOrganizadores.class.getName()).log(Level.SEVERE, "Error al conectar a la base de datos", ex);
        }
    }

    private void disconnect() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
