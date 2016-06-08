/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author corjan
 */
public class RemovalNumber {
    private String fileOutPut = "outPutFile.txt";
    List<Integer> arrayList = new ArrayList<>();
    /**
     * Takes the data from the file name. Then goes through the entire file and only stores each number once,
     * skipping the numbers in the file if they already exist. 
     * @param fileName - Then name of the file which double numbers exist. 
     */
    public RemovalNumber(String fileName){
        try{
            File f = new File(fileName);
            Scanner file = new Scanner(f);
            boolean numberPresent = false;
            // Searches through the file for numbers skipping over numbers which already exist. 
            while(file.hasNextLine()){
                int num = Integer.parseInt(file.nextLine());
                for(int count=0;count<arrayList.size();count++)
                    if(num==arrayList.get(count))
                        numberPresent = true;            
                if(!numberPresent){
                    arrayList.add(num);                    
                }else{
                    numberPresent = false;
                }    
            }
            saveFile();    
        }catch(FileNotFoundException e){
            System.err.println("ERROR: opening file");
            System.exit(0);
        }
    
    }
    /**
     * Saves the data to the file using the listArry. The list array contains all the values form the file. 
     */
    private void saveFile(){
        try{
            PrintWriter outPutFile = new PrintWriter(fileOutPut);
            for(int count=0;count<arrayList.size();count++)
                outPutFile.println(arrayList.get(count));
            outPutFile.close();
        }catch(FileNotFoundException e){
            
        }
        
        
    }
}
