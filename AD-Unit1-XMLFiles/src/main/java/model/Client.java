
package model;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
public class Client{
    
    String firstName;
    String lastName;

    
    public Client() {
    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName  + '}';
    }
    
    
}