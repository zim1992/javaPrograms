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
public class SSNCharacteException extends Exception {
    public boolean characterValidation()
    {
        return true;
    }
    public void checkCharicter(String socialSecurityNumber)
    {
        int lengthOfString = socialSecurityNumber.length();
        if(lengthOfString == 9)
        {
            try
            {
                int socialSecurityNumberInt = Integer.parseInt(socialSecurityNumber);
            }catch(Exception e){
                System.out.println("ERROR: Invalid Social Security Number \nThe Social Security Number can only contain numbers and not Charicters");
                
            }
        }
        if(lengthOfString == 11)
        {
            try
            {
                int checkFirstFourNumbers = Integer.parseInt(socialSecurityNumber.substring(1, 4));
                try
                {
                    int checkSecondTwoNumbers = Integer.parseInt(socialSecurityNumber.substring(5, 6));
                    try
                    {
                        int checkLastFourDigits = Integer.parseInt(socialSecurityNumber.substring(8));
                    }catch(Exception e){
                        System.out.println("ERROR: Invalid Social Security Number \nThe Social Security Number can only contain numbers and not Charicters");
                    }
                    
                }catch(Exception e){
                    System.out.println("ERROR: Invalid Social Security Number \nThe Social Security Number can only contain numbers and not Charicters");
                    
                }
            }catch(Exception e){
                System.out.println("ERROR: Invalid Social Security Number \nThe Social Security Number can only contain numbers and not Charicters");
                
            }
        }
        else
        {
            System.out.println("ERROR: Invalide Social Security Number \nYou have entered to few or too many numbers into the social security number");
        }
        
    }
    
}
