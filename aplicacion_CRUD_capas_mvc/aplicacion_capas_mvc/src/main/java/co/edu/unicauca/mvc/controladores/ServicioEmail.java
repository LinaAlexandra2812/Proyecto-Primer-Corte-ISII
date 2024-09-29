
package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mk.common.entities.Email;
import co.edu.unicauca.mk.common.interfaces.ISendEmail;
import co.edu.unicauca.mvc.plugins.EmailSenderPluginManager;

public class ServicioEmail {

    public ServicioEmail() {
    }
    
    public void serviceSendEmail(Email emailData) throws Exception {
        
        String emailCode = emailData.getEmailCode();
        EmailSenderPluginManager manager = EmailSenderPluginManager.getInstance();
        ISendEmail plugin = manager.getEmailPlugin(emailCode);
        
        if(plugin == null){
            throw new Exception();
        }
        plugin.sendEmail(emailData);
    }
}
