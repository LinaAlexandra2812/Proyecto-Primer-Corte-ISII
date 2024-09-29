
package co.edu.unicauca.mk.common.entities;

/**
 *
 * @author linit
 */

public class Email {
    final private String username = "pruebalina25@hotmail.com";
    final private String password = "redire25";
    
    private String destinatario;
    private String asunto;
    private String contenido;
    private String emailCode;

    public Email(String destinatario, String asunto, String contenido, String emailCode) {
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.contenido = contenido;
        this.emailCode = emailCode;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode;
    }
}

