/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package motorboatscomparator;
import java.util.Scanner;
/**
 **This program was written by Corjan Eugene Zee
 * Student Number 394986
 * This designed to test two motor boats 
 */
public class motorboat {
    public static void main(String[] args) {
        System.out.println("This program will be used to compare two motorboats");
        System.out.println("You will be able to input information regarding the Size of the fuel tank, maxumum speed of the boat and the current speed of the boat");
        System.out.println("Below you will input the capacity of the fuel tank in Litters.");
        Scanner keyboard = new Scanner(System.in);
        int fuelTankCapacity1 = keyboard.nextInt();
        System.out.println("Below you will now input the maximum speed of the motorboat");
        int maxSpeed1 = keyboard.nextInt();
        System.out.println("Below input the current speed of the motor boat");
        double currentSpeed1 = keyboard.nextInt();
        System.out.println("You will be able to test whether the specifications which have imputted into for your motor boat compare to another motor boat.");
        Motorboatscomparator mbc = new Motorboatscomparator(fuelTankCapacity1,maxSpeed1,currentSpeed1);
        int testNumber;
        System.out.println("By inputting certain numbers certain test will be performed");
        System.out.println("1 - Will test to see if you have the your boat is identical to another boat");
        System.out.println("2 - Will test who has a higher maximum Speed");
        System.out.println("3 - Will test who can carry more fuel");
        System.out.println("4 - Will test to see who driving faster");
        System.out.println("5 - Will test who has the possibility of going faster");
        System.out.println("6 - Will end the test");
        do{
            testNumber = keyboard.nextInt();
            switch(testNumber){
                case 1: mbc.TestBoats();
                    break;
                case 2: mbc.TestMaxSpeed();
                    break;
                case 3:mbc.TestTankCapacity();
                    break;
                case 4:mbc.WhoDrivingFaster();
                    break;
                case 5:mbc.WhoCanDriveTheFastest();
                    break;
                 
            }          
        }while(testNumber != 6);
    }
}
