/*
 * This program is supposed to manupulate how an employee worked throughout a week
 This program was made by Corjan Eugene Zee Student Number 394986
 */

package timebook;
import java.util.Scanner;
/**
 *
 * @author Corjan Zee
 */
public class TimeBookrunner {
 public static void main(String[] args) {
 int NUMBER_OF_EMPLOYEES = 3;
 Scanner keyboard = new Scanner(System.in);
 TimeBook book = new TimeBook(NUMBER_OF_EMPLOYEES);
 book.setHours();
 book.update();
 book.showTable();
 /**
  * This is the test program
  */
 System.out.println("We will now be executing a test program which will test the new methodes which have been added \n We will be now choosing to change some data");
 System.out.println("We will start be changing the amount of hours an employee worked this number will range from 1 - 3");
 int employee;
 
 do{
 employee = keyboard.nextInt();
 if((employee<=0)||(employee>=3)){
   System.out.println("That employee does not exist in the data base");  
 }
 }while((employee==3)||(employee==1)||(employee==2));
 System.out.println("Now state one which day you wish to change");
 System.out.println("1 -/tMonday/n2 -/tTuesday/n3 -/tWednesday/n4 -/tThursday/n5 -/tFriday");
    }   
    
}
