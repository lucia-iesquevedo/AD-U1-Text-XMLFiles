
package XMLPropertyFiles.main;

import XMLPropertyFiles.config.ConfigurationProp;


/**
 *
 * @author Lucia
 */
public class PropertiesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("one="+ConfigurationProp.getInstance().getProperty("one"));        

    }
    
    
}
