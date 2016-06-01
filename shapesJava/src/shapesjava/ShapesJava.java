/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesjava;

import java.util.Scanner;

/**
 *
 * @author Corjan
 */
public class ShapesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This is a drawing program which will be used to draw and interact with the dimentions three shapes:\n\n-> Right Triangle\n-> Rectangle\n-> Square\n");
        int shapeInteration = 0;
        boolean programExiter = false;
        while(!programExiter){
            System.out.println("Please state which shape you would like to interact with first");
            shapeInteration = keyboard.nextInt();
            switch(shapeInteration){
                case 1:
                        break;
                case 2:
                        break;
                case 3: 
                        break;
                case 4: programExiter = true;
                        break;
                default:
                
            }
        }
    }
    
}
