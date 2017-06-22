/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twentyfourtotwelvehourtimeconverter;

/**
 *
 * @author Corjan Zee
 */
public class TimeFormatException extends Exception 
{
  private String message;
   
   public TimeFormatException(String message)
   {
       this.message = message;  
   }

    @Override
    public String getMessage() {
        return message; //To change body of generated methods, choose Tools | Templates.
    }
}
