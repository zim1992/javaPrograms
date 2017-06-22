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
public class SSNLengthException extends Exception{
     public int validationNumer = 1;

   
    @Override
    public String getMessage() {
        return "you have either added to many or to few charicters" ; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
     
    
}
