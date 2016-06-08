/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasorter;

import java.util.Scanner;

/**
 *
 * @author corjan
 */
public class DataSorter {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fileName="numberfile.txt";
        MaxMinAverage numbersorter = new MaxMinAverage (fileName);
        RemovalNumber removeNum = new RemovalNumber(fileName);
        System.out.println("We have sorted the text file and you have the ability to get stats of the file\n");
        boolean exiter = false;
        while(!exiter){
            System.out.println("Please use the following menu to find out the stats of the file\n\n"
                        + "1) Minimum Value\n"
                        + "2) Maximum Value\n"
                        + "3) Average Value\n"
                        + "4) Exit");
            int optionSelector = keyboard.nextInt();
            switch(optionSelector){
                case 1: System.out.println("Minimum Value: "+numbersorter.getMin());
                        break;
                case 2: System.out.println("Maximum Value: "+numbersorter.getMax());
                        break;
                case 3: System.out.println("Average Value: "+numbersorter.getAverage());
                        break;
                case 4: exiter = true;
                        break;
                default: System.err.println("ERROR: you have selected an option which is not in the menu please try again");
                        break;
            }
        }
        
        
    }
    
}
