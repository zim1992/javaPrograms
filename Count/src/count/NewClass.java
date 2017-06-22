/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package count;
import java.util.Scanner;
/**
 *This program was made by Corjan Eugene Zee 
 * This program is use to keep a count on a value...for example counting apples
 */
public class NewClass {
    public static void main(String[] args) {
    Count counter = new Count();
    Scanner keyboard = new Scanner(System.in);
    System.out.println("In this program you will be able to count items. By typing certain values you can do certain opperations.");
    System.out.println("1 = counts by one value");
    System.out.println("2 = counts by 10");
    System.out.println("3 = decreases by one value");
    System.out.println("4 = decreases by 10");
    System.out.println("5 = this will set the value to 0");
    System.out.println("6 = will set your value to the current value");
    System.out.println("7 = Displays your current count");
    System.out.println("8 = close the program");
    int value, current; 
    do{
         value = keyboard.nextInt();
     switch(value){
        case 1: counter.count1();
            break;
        case 2: counter.count10();
            break;
        case 3:counter.decrease1();
           break;
        case 4:counter.decrease10();
            break;
        case 5:counter.reset();
            break;
        case 6:current = counter.currentdigits();
            System.out.println("your current value is "+current); 
            break;
        case 7:counter.display();
            break;
        
            
            
        
    }
    }while(value != 9);
    }
}
//