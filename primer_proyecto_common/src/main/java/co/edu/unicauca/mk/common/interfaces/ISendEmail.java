
package co.edu.unicauca.mk.common.interfaces;

import co.edu.unicauca.mk.common.entities.Email;

/**
 *
 * @author linit
 */
public interface ISendEmail {
    
    /**
     * Establece el envío de corres
     * 
     * @param email 
     */
    void sendEmail(Email email);
    
}
