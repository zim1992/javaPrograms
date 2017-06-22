/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation.of.interest.after.pkg10.years;
import java.util.Scanner;
/**
 *Author Corjan Eugene Zee, Student Number 394986
 * The objective of the program is to be able to calculate interest in a bank account after 10 years. Depending on the interest rate and whether the interest is annual, monthly or daily
 */
public class CalculationOfInterestAfter10Years {
    

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("In this program you will be able to determine how much you will have to give back to bank after 10 years.This program will");
        System.out.println("work by inputing three different digits. The first digit will correspond to the amount invested capital. The Second value");
        System.out.println("would be the banks interest rate. The third would be how the interest will be calculated;Annually, Monthly or Daily.");
        System.out.println("");
        System.out.println("Please write down the amount you wish to loan from the bank");
        Scanner keyboard = new Scanner(System.in);
        double loan = keyboard.nextDouble();
        System.out.println("Please state the in bank interest rate in form of a decimal. For example, 0.1 instead of 10%");
        double interest = keyboard.nextDouble()+1;
        System.out.println("Can you state whether the interest rate is taken Annually, Monthly or Daily");
        String timeRate = keyboard.next();
        if((timeRate.equals("Annually"))||(timeRate.equals("annually"))||(timeRate.equals("ANNUALLY"))){
            for(int a1 = 1;a1<=10;a1++){
              loan = loan*interest;  
            }
        }
        if((timeRate.equals("Monthly"))||(timeRate.equals("monthly"))||(timeRate.equals("MONTHLY"))){
           for(int a1 = 1;a1<=120;a1++){
              loan = loan*interest;  
            }           
        }
        if((timeRate.equals("Daily"))||(timeRate.equals("daily"))||(timeRate.equals("DAILY"))){
            for(int a1 = 1;a1<=3650;a1++){
              loan = loan*interest;  
            }
        }
        System.out.println("The amount which you owe the banks after 10 years is "+loan);
        
    }
}
