/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeandsocialsecuritydatainformation;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Corjan
 */
public class EmployeeAndSocialSecurityDataInformation extends Person {
      
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       ArrayList<Employee> employees = new ArrayList<Employee>();
       SSNCharacteException checkCharicters = new SSNCharacteException();
        int entryNumber = 0;
        int lengthCheck = 0;
        String employeesName = null;
        String socialSecurityNumber = null;
        System.out.println("In this program you will be able to store and modify  your and Social Security numbers");        
        do{
        try{
            System.out.println("employees Name");
            employeesName = keyboard.next();
            System.out.println("Social Security Number");
            socialSecurityNumber = keyboard.next();
            if(socialSecurityNumber.length() == 9||socialSecurityNumber.length() == 11)
            {
                lengthCheck = 1;
            }
            else
            {
                throw new SSNLengthException();
            }
            checkCharicters.checkCharicter(socialSecurityNumber);
        }catch(SSNLengthException e){
            System.out.println(e.getMessage());
                }
        }while(lengthCheck == 1||checkCharicters.characterValidation());
        entryNumber ++;
        Employee employee;
        employee = new Employee(employeesName,socialSecurityNumber);
        employees.add(employee);
        
        try{
            if (entryNumber>=100)
            {
                throw new tooManyUsersException();
            }
        }catch(tooManyUsersException e){
                System.err.println(e.getMessage());
        }
            
        while(entryNumber !=100)
        {
            try{
            if (entryNumber>=100)
            {
                throw new tooManyUsersException();
            }
            
            System.out.println("By entering 1,2 or 3 you will be able to one of the following options\n1 - \tAdd a New entry\n2 - \tModify an entry");
            int option = keyboard.nextInt();
             
            switch(option){
                case 1:do{
                            try{
                            System.out.println("employees Name");
                            employeesName = keyboard.next();
                            System.out.println("Social Security Number");
                            socialSecurityNumber = keyboard.next();
                            if(socialSecurityNumber.length() == 9||socialSecurityNumber.length() == 11)
                            {
                                lengthCheck = 1;

                            }
                            else
                            {
                                throw new SSNLengthException();
                            }
                            checkCharicters.checkCharicter(socialSecurityNumber);
                            }catch(SSNLengthException e){
                                e.getMessage();
                                }
                        }while(checkCharicters.characterValidation()|lengthCheck == 1);
                         employee = new Employee(employeesName,socialSecurityNumber);
                         employees.add(employee);
                         }
            }catch(tooManyUsersException e){
                System.err.println(e.getMessage());
        }
    }
    }
    
}
