/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorising;
import java.util.Scanner;
/**
 *This Program was developed by Corjan Eugene Zee, Student Number 394986. 
 * This program is designed in such a way to be able to input non rational values in the form of a fraction and be able to determine the value in either and reduced form or as a rational value.
 * This objective is achieved together with a program which contains certain methods.
 */
public class Factorising {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Factorisor fact = new Factorisor();
        System.out.println("You will be inputing a fraction into the program. This will be done by first inputing the numerator (a value int a/b), \nthen on a seperate line you will input the Denominator(b term in a/b).");
        System.out.println("Below can you input the Numerator value(a term in a/b)");
        String numerator = keyboard.nextLine();
        int num = fact.intTest(numerator);
        System.out.println("Below can you input the Denominator value(b term in a/b)");
        String denominator = keyboard.nextLine();
        int den = fact.intTest(denominator);
        fact.Factorisor(num, den);
        System.out.println("This is your fraction in the form of a decimal "+fact.getValue());
        System.out.println("This is your value in the for of a simplified fraction "+fact.toString());
                
    }
    
}
