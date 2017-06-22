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
public class tooManyUsersException extends Exception {
      @Override
      public String getMessage()
      {
          return "There are too many employees been added to the file";
      }
      
    
}
