/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author corjan
 */
public class MaxMinAverage {
    private int max;
    private int min;
    private double average;
    public MaxMinAverage(String filename){
        try{
            File f = new File(filename);
            Scanner file = new Scanner(f);
            int max =0;
            int min = 100000;
            int sumTotal = 0;
            int counter=0;
            while(file.hasNextLine()){
                counter++;
                int num = Integer.parseInt(file.nextLine());
                sumTotal+=num;
                if(num>max){
                    max =num;
                }
                if(num<min){
                    min=num;
                }
                
            }
            average = sumTotal/counter;
            this.max=max;
            this.min=min;
            
        }catch(FileNotFoundException e){
            System.err.println("ERROR: opening file");
            System.exit(0);

        }
        
    }
    public int getMax(){
        return max;
    }
    public int getMin(){
        return min;
    }
    public double getAverage(){
        return average;
    }
    
}
