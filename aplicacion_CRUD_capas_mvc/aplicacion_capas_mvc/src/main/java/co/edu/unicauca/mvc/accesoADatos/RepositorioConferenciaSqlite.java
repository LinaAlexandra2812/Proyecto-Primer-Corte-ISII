package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoConferencias;
import co.edu.unicauca.mvc.modelos.Conferencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioConferenciaSqlite implements InterfaceRepositorioConferencia {

    private Connection connection;

    public RepositorioConferenciaSqlite() {
        initDataBase();
    }

    @Override
    public boolean almacenarConferencia(Conferencia objConferencia) {
        try {
            if (objConferencia == null || objConferencia.getIdConferencia() < 0 || objConferencia.getNombre().isBlank()) {
                return false;
            }

            String sql = "INSERT INTO CONFERENCIA (nombre, lugar, tema, descripcion, contacto, fecha) "
                    + "VALUES (?, ?, ?, ?, ?, ?)\n";

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicioFormateada = dateFormat.format(objConferencia.getFechaInicio());

            PreparedStatement pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, objConferencia.getNombre());
            pStatement.setString(2, objConferencia.getLugar());
            pStatement.setString(3, objConferencia.getTema());
            pStatement.setString(4, objConferencia.getDescripcion());
            pStatement.setString(5, objConferencia.getContacto());
            pStatement.setString(6, fechaInicioFormateada);
            pStatement.executeUpdate();
            System.out.println("Se agrego una conferencia exitosamente.");
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(ServicioAlmacenamientoConferencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Conferencia> listarConferencias() {
        List<Conferencia> conferencias = new ArrayList<>();
        try {
            String sql = "SELECT id, nombre, lugar, tema, descripcion, contacto, fecha, cedula_organizador FROM CONFERENCIA;";

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Conferencia nuevaConferencia = new Conferencia();

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                nuevaConferencia.setIdConferencia(rs.getInt("id"));
                nuevaConferencia.setNombre(rs.getString("nombre"));
                nuevaConferencia.setLugar(rs.getString("lugar"));
                nuevaConferencia.setTema(rs.getString("tema"));
                nuevaConferencia.setDescripcion(rs.getString("descripcion"));
                nuevaConferencia.setContacto(rs.getString("contacto"));

                String fechaString = rs.getString("fecha");
                Date fechaInicio = dateFormat.parse(fechaString);
                nuevaConferencia.setFechaInicio(fechaInicio);

                conferencias.add(nuevaConferencia);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ServicioAlmacenamientoConferencias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(RepositorioConferenciaSqlite.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conferencias;
    }

    private void initDataBase() {
        String sql = "CREATE TABLE IF NOT EXISTS CONFERENCIA (\n"
                + "     id INTEGER PRIMARY KEY AUTOINCREMENT,\n "
                + "     nombre TEXT,\n"
                + "     lugar TEXT,\n"
                + "     tema TEXT,\n"
                + "     descripcion TEXT,\n"
                + "     contacto TEXT,\n"
                + "     fecha TEXT\n" //+ " cedula_organizador INTEGER REFERENCES Organizador (area_especializada)\n"
                + ");";

        try {
            this.connect();
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioAlmacenamientoConferencias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connect() {
        String url = "jdbc:sqlite:./proyectoSoftwareII.db";

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioAlmacenamientoConferencias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RepositorioConferenciaSqlite.class.getName()).log(Level.SEVERE, null, ex);
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
