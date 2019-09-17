
package model;

import XMLJAXBParsing.LocalDateAdapter;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee{
    
    private String firstName;
    private String lastName;
    private Address address;
    
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate startDate;

    
    public Employee() {
    }

    public Employee(String firstName, String lastName, Address address, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.startDate = startDate;
    }

    
    public String getFirstName() {
        return firstName;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    
    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", startDate=" + startDate + '}';
    }
    
    
}