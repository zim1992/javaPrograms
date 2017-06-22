/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeandsocialsecuritydatainformation;

/**
 *
 * @author Corjan
 */
public class Person {
     
      private String name; 
      private String socialSecurityNumber;
      public Person()   
      {        
            name = "No name yet"; 
            socialSecurityNumber = "No socialSecuriy number yet";
      } 
      public Person(String initialName, String socialSecurityNumber) 
      {        
            name = initialName;
            this.socialSecurityNumber = socialSecurityNumber;
      } 
      public void setName(String newName)
      {        
            name = newName;
      } 
      public String getName()    
      {
            return name;
      } 
      public void writeOutput()    
      {        
            System.out.println("Name: " + name);    
      } 
      public boolean hasSameName(Person otherPerson) 
      { 
            return this.name.equalsIgnoreCase(otherPerson.name); 
      }
      
}
