/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasorter;

/**
 *
 * @author corjan
 */
public class DataSorter {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String fileName="numberfile.txt";
        MaxMinAverage numbersorter = new MaxMinAverage (fileName);
        System.out.println("");
        
    }
    
}
