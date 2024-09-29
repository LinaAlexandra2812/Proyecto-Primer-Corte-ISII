package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoAutores;
import co.edu.unicauca.mvc.modelos.Autor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioAutorSqlite implements InterfaceRepositorioAutor {

    private Connection connection;

    public RepositorioAutorSqlite() {
        initDataBase();
    }

    @Override
    public boolean almacenarAutor(Autor objAutor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Autor> listarArticulos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarAutor(int idAutor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Autor consultarAutor(int idAutor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizarAutor(Autor objAutor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void initDataBase() {
        String sqlPersona = "CREATE TABLE IF NOT EXISTS Persona (\n"
                + "    cedula_persona INTEGER PRIMARY KEY, \n"
                + "    nombre TEXT, \n"
                + "    correo TEXT, \n"
                + "    contraseña TEXT, \n"
                + "    telefono INTEGER, \n"
                + "    rol TEXT\n"
                + ");";

        String sqlAutor = "CREATE TABLE IF NOT EXISTS Autor (\n"
                + "    lista_publicaciones TEXT, \n"
                + "    cedula_persona INTEGER PRIMARY KEY REFERENCES Persona (cedula_persona)  -- Se añade PRIMARY KEY\n"
                + ");";

        try {
            this.connect();
            Statement statement = connection.createStatement();
            statement.execute(sqlPersona);
            statement.execute(sqlAutor);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioAlmacenamientoAutores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connect() {
        String url = "jdbc:sqlite:./proyectoSoftwareII.db";

        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioAlmacenamientoAutores.class.getName()).log(Level.SEVERE, "Error al conectar a la base de datos", ex);
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
