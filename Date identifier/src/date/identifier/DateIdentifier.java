/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package date.identifier;
import java.util.Scanner;
/**
 *
 * This Program was made by Corjan Eugene Zee 
 * Student Number 389925
 * Chapter 3 Programming project 9
 * This program can be used to validate a date if the date is put in the from yyyy/mm/dd
 */
public class DateIdentifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("In this program you find out if your date is a valid date. You can do this by adding a date in the following mannar yyyy/mm/dd. where yyyy stands for the year");
       System.out.println("where yyyy stands for the year, mm stands for the month and dd stands for the day");
       Scanner keyboard = new java.util.Scanner(System.in);
       String date = keyboard.next();
       int day = Integer.parseInt(date.substring(5,7)) ;
       int month = Integer.parseInt(date.substring(8)) ;
       int year = Integer.parseInt(date.substring(0,4)) ;
       if((year%4==0)&&((year%100!=0)||(year%400==0))){//for a leap year 
           if((month==2)&&(day<=29)){
               System.out.println("your Date is correct");
           }
           if((month==02)&&(day>29)){
               System.out.println("there is only 29 days in the Month of February");
           }
           if((day<=30)&&((month==02)||(month==4)||(month==6)||(month==9)||(month==11))){
               System.out.println("your Date is correct");  
           }
           if((day>30)&&((month==02)||(month==4)||(month==6)||(month==9)||(month==11))){
               System.out.println("There are only 30 days in the month "+month);
           }
            if((day<=31)&&((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))){
                
            }
            if((day>31)&&((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))){
                System.out.println("There are only 31 days in the month "+month);
            }
            else{
                System.out.println("you have entered an invalid day");
            }
       }
       else{
           if((month==2)&&(day<=28)){
               System.out.println("your Date is correct");
           }
           if((month==02)&&(day>29)){
               System.out.println("there is only 28 days in the Month of February");
           }
           if((day<=30)&&((month==02)||(month==4)||(month==6)||(month==9)||(month==11))){
               System.out.println("your Date is correct");  
           }
           if((day>30)&&((month==02)||(month==4)||(month==6)||(month==9)||(month==11))){
               System.out.println("There are only 30 days in the month "+month);
           }
            if((day<=31)&&((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))){
                
            }
            if((day>31)&&((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))){
                System.out.println("There are only 31 days in the month "+month);
            }
            else{
                System.out.println("you have entered an invalid day");
            }
       }
    }
}
