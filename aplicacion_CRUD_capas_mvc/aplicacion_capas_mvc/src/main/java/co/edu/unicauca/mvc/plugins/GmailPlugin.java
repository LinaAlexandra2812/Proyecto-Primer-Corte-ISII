/**
 *
 * @author linit
 */
package co.edu.unicauca.mvc.plugins;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class GmailPlugin {
    
    public static void sendEmail() {
        final String username = "pruebalina25@hotmail.com"; // Tu cuenta de Hotmail
        final String password = "redire25"; // Tu contraseña de Hotmail
        
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp-mail.outlook.com"); // Servidor SMTP de Hotmail
        prop.put("mail.smtp.port", "587"); // Puerto para TLS
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); // Habilitar TLS

        // Crear sesión con autenticación
        Session session = Session.getInstance(prop,
            new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
              try {
            // Crear el mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse("anaquira@unicauca.edu.co") // Destinatario
            );
            message.setSubject("Plugin");
            message.setText("Ya envía correos Anita :3");

            // Enviar el mensaje
            Transport.send(message);

            System.out.println("Correo enviado correctamente");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
