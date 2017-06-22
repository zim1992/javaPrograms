/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package summation.array;
import java.util.Scanner;
/**
 *This program was written by Corjan Eugene Zee
 * Student Number 394986
 * The objective of this program is to build an array and sum those values together with the multiple of there row
 */
public class SummationArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int[] anArray;
          Scanner keyboard = new Scanner(System.in);
          System.out.println("In this Program you can add a whole bunch of numebrs in an array and each number is multiplied by the point in the array");
          System.out.println("Please state how many numbers you wish to place into the array");
          int i = keyboard.nextInt();
          anArray = new int[i];
          System.out.println("Place your "+i+" numbers below one per line");
          for(int j=0;j<anArray.length;j++){
                anArray[j]= keyboard.nextInt()*(j+1);
          }
         int sum=0;
          for(int j=0;j<anArray.length;j++){
              sum=sum+anArray[j];
          }

System.out.println("The sum is " + sum);
          
    }
}
