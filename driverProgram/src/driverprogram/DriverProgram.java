/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverprogram;

import java.util.Scanner;

/**
 *
 * @author Corjan
 */
public class DriverProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program is your driver program.Please type out infromation regarding your truck");
        System.out.println("Please write down the name of the manufacture");
        String manufatureName = keyboard.nextLine();
        System.out.println("Please type out how many cylindars your truck has");
        int numberOfCylinders = keyboard.nextInt();
        System.out.println("Please type out the name of owner of the Truck");
        keyboard.nextLine();
        String stringOwner = keyboard.nextLine();
        Person owner = new Person(stringOwner);
        System.out.println("Please state the load Capacity of the follwoing truck");
        double loadCapacity = keyboard.nextDouble();
        System.out.println("Please state the towing Capacity of the Truck");
        double towingCapacity = keyboard.nextDouble();
        Truck truck = new Truck(manufatureName, numberOfCylinders,owner, loadCapacity, towingCapacity);
        boolean exiter=true;
        System.out.println("You have setup the data for the following Truck. You will have the abitlity to manipulate, view and output the data with regards to following Truck");
        int menuOption;
        while(exiter){
            System.out.println("Please select from the following menu which\n"+
                                "1) writes all the data at one time\n" +
                                "2) Get owners Name\n" +
                                "3) Gets Manufacture name\n" +
                                "4) Gets Number of Cylinders\n" +
                                "5) Gets Load Capacity\n" +
                                "6) Gets Towing Capacity\n" +
                                "7) Change the Owner Name\n" +
                                "8) Change the Manufacture Name\n" +
                                "9) Change the number of Cylinders\n" +
                                "10) Change the load capacity\n" +
                                "11) Change the towing Capacity\n" +
                                "12) Exit the program\n");
           
            menuOption = keyboard.nextInt();
            keyboard.nextLine();
            switch(menuOption){
                /**
                 * This writes all the data to the consol
                 */
                case 1: truck.writeOutput();
                        break;
                /**
                 * Gets the name of the owner of the truck
                 */
                case 2: System.out.println(truck.getOwner().getName());
                        break;
                /**
                 * Gets the name of Manufacture name of the Truck
                 */
                case 3: System.out.println(truck.getManufactureName());
                        break;
                /**
                 * Gets the number of cylinders the truck has
                 */
                case 4: System.out.println(truck.getNumberOfCylinders());
                        break;
                /**
                 * Gets the load capacity of the Truck
                 */
                case 5: System.out.println(truck.getLoadCapacity());
                        break;
                /**
                 * Gets the towing capacity of the truck
                 */
                case 6: System.out.println(truck.getTowingCapacity());
                        break;
                /**
                 * Change the name of the owner
                 */
                case 7: System.out.println("You have selected to change the owner of the truck\n"+
                                           "Please type out the new name you would like to give ");
                        owner.setName(keyboard.nextLine());
                        break;
                /**
                 * changes the Manufacturer of the truck
                 */
                case 8: System.out.println("Please type out the New name of the manufacture of the truck");
                        truck.setManufactureName(keyboard.nextLine());
                        break;
                case 9: System.out.println("Please type out the new number of Cylinders the truck has");
                        truck.setNumOfCylinders(keyboard.nextInt());
                        break;
                /**
                 * Change the number the load capacity of the truck
                 */
                case 10: System.out.println("Please type out the new load capacity of the truck");
                         truck.setLoadCapacity(keyboard.nextDouble());
                        break;
                /**
                 * Changing the towing capacity of the truck.
                 */
               case 11: System.out.println("Please type out the new towing capacity of the truck");
                        truck.setTowingCapacity(keyboard.nextDouble());
                        break;
                case 12: exiter=false;
                        break;
                default:System.err.println("The following option menu does not exist please try again"); 
                        break;
                
            }           
        }
    }
    
}
