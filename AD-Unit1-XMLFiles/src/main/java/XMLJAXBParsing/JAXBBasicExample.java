/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XMLJAXBParsing;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import model.Address;
import model.Employee;
import model.Employees;


/**
 *
 * @author Lucia
 */
public class JAXBBasicExample {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws Exception {
       
        JAXBContext context = JAXBContext.newInstance(Employees.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Path xmlFile= Paths.get("xmlFiles/employee.xml");
        // Reads the XML document from the file
        Employees empList = (Employees) unmarshaller.unmarshal(Files.newInputStream(xmlFile));

        System.out.println("********* Result of reading XML document from the file***************");
        marshaller.marshal(empList, System.out);

        // Add a new employee to the XML file
        Address address=new Address("Gran via", 5);
        Employee emp= new Employee("Mary","Johnson", address, LocalDate.parse("2016-08-16"));
        empList.addEmployee(emp);

        //Load the result to the file
        marshaller.marshal(empList, Files.newOutputStream(xmlFile));

        // Show the resulting Java object on screen
        marshaller.marshal(empList, System.out);
                	}
  
}
  
