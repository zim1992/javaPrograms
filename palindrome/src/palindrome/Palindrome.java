/**
 * This program will determine if a word can be written in both ways such a radar.
 */

package palindrome;
import java.util.Scanner;
/**
 *
 * @author Corjan Zee
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("This program will be used to determine if a Palindrome exists in your sentence");
    System.out.println("A palindrome is a word which can be written in both forwards and backwards for example radar/n The way the program works is by writing a sentence.\n\n\nNB** When you have finished writing the sentence place a period \".\" and hitting  \"ENTER\" on your keyboard");
    String inputString = keyboard.nextLine();
    while(".".equals(inputString.substring((inputString.length()-1)))==false){
        System.err.println("YOU WERE REQUESTED PLACE A \".\" AT THE END OF THE SENTENCE YOU HAVE NOT DONE SO");
        System.out.println("Please try again... \t don't forget to add a \".\" at the end of the sentence and press enter");
        inputString = keyboard.nextLine();
    

    }
        palindromerunner evaluated= new palindromerunner(inputString);

}
}
 
    

