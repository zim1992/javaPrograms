
package excersice.pkg2.pkg11.binary.to.decimal.conversion;
import java.util.Scanner;

/**
 *This Program was made by Corjan Eugene Zee 
 * Student Number 389925
 * Chapter 2 Programming project 11
 * You will be able to add a 4 bit number in binary and the equivalent value in decimal will be outputted
 */
public class Excersice211BinaryToDecimalConversion {

    public static void main(String[] args) {
     System.out.println("Please write insert the 4 bit binary number below");
     Scanner keyboard = new java.util.Scanner(System.in);
     String binString = keyboard.nextLine();
     int binNum = Integer.parseInt(binString);
     int n8 = binNum/1000;
     int n4 =((binNum-1000*n8)/100);
     int n2 =(binNum-(1000*n8+100*n4))/10;
     int n0 =(binNum-(1000*n8+100*n4+10*n2));
     int decNum = 8*n8+4*n4+2*n2+n0;
     System.out.println("The Binary numer "+binNum+" in decemal is "+decNum);
             
     
     }
     
     
             }       
    

