
package co.edu.unicauca.mvc.plugins;

import java.util.Properties;

/**
 *
 * @author linit
 */
public class EmailSenderPluginManager {
        public static final String FILE_NAME = "plugin.properties";
        private static EmailSenderPluginManager instance;
        
        private Properties pluginProperties;
        
        private EmailSenderPluginManager(){
            pluginProperties = new Properties();
        }
        
        public static EmailSenderPluginManager getInstance(){
            return instance;
        }
        
        public static void init(String basePath) throws Exception{
            instance = new EmailSenderPluginManager();
            instance.loadProperties(basePath);
            if(instance.pluginProperties.isEmpty()){
                throw new Exception("No ha sido posible inicializar los plugins.");
            }
        }
        
}
