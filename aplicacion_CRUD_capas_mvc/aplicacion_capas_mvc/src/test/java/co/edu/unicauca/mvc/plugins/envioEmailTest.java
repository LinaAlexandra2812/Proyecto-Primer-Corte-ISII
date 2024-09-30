
package co.edu.unicauca.mvc.plugins;

import java.util.Properties;
import static org.apache.maven.wagon.PathUtils.host;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author thali
 */
public class envioEmailTest {
    private EmailPlugin emailPlugin;
    
    @BeforeEach
    void setUp() {
        
        String username = "thaliaepe@hotmail.com"; // Tu cuenta de Hotmail
        String password = "carolt12345"; // Tu contraseña de Hotmail
        
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp-mail.outlook.com"); // Servidor SMTP de Hotmail
        properties.put("mail.smtp.port", "587"); // Puerto para TLS
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // Habilitar TLS


        emailPlugin = new EmailPlugin(username, password, properties);
    }

    @Test
    void testSendEmail() {
        String to = "proyectosoftwareii@hotmail.com"; // Cambia a la dirección de correo de destino
        String subject = "CONFIRMACION Y NOTIFICACION RECEPCION TRABAJO";
        String body = "El trabajo ha sido recibido de manera exitosa";
        
        // Envía el correo real
        emailPlugin.sendEmail(to, subject, body);
        
        
        System.out.println("Correo enviado correctamente a " + to);
    }
}
   

