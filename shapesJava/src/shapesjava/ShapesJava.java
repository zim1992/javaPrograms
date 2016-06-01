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
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4,4);
        boolean programExiter = false;
        while(!programExiter){
            System.out.println("Please state which shape you would like to interact with first\n"
                            + "1) Right Triangle\n"
                            + "2) Rectangle\n"//done
                            + "3) Square\n"
                            + "4) To exit the program\n");
            System.out.print("Please place the the menu option here:");
            shapeInteration = keyboard.nextInt();
            switch(shapeInteration){
                case 1:
                        break;
                case 2: System.out.println("Please state what you want to do with the rectangle\n"
                                        + "1) Get the dimentions \n"
                                        + "2) Adust the rectangl's Dimetions\n"
                                        + "3) Draw rectangle\n"
                                        + "4) Calculate the Area\n"
                                        + "5) Calculate the Circumferance\n");
                        System.out.print("Please type out your option:");
                        int rectangleSelection = keyboard.nextInt();
                        switch(rectangleSelection){
                            case 1: System.out.println("Height: "+rectangle.getHeight()+"\n"
                                                    + "Width: "+rectangle.getWidth());
                                    break;
                            case 2: System.out.println("Which dimention do you want to adjust\n"
                                                    + "1) Height\n"
                                                    + "2) Width\n"
                                                    + "3) Both \n");
                                    System.out.print("Please type select an option:");
                                    int dimentionSelection = keyboard.nextInt();
                                    int height,width;
                                    switch(dimentionSelection){
                                        case 1: System.out.println("You are editing the height. Please type the new height of the Rectangle");
                                                height = keyboard.nextInt();
                                                rectangle.set(height, rectangle.getWidth());
                                                break;
                                        case 2: System.out.println("You are editing the Width. Please type the new Width of the Rectangle");
                                                width = keyboard.nextInt();
                                                rectangle.set(rectangle.getHeight(), width);
                                                break;
                                        case 3: System.out.println("You will be editing both the height and width\n\n"
                                                                + "You are editing the height. Please type the new height of the Rectangle");
                                                height = keyboard.nextInt();
                                                System.out.println("\nYou are editing the Width. Please type the new Width of the Rectangle");
                                                width = keyboard.nextInt();
                                                rectangle.set(height, width);
                                                break;
                                        default: System.err.println("ERROR: Exited to the main menu the following option does not exist");
                                                break;
                                    }
                                    break;
                            case 3: rectangle.drawHere();
                                    break;
                            case 4: System.out.println("The Area of the rectangle is: "+rectangle.getArea());
                                    break;
                            case 5: System.out.println("The Circumferance of the rectangle is: "+rectangle.getCircumfrance());
                                    break;
                            default:System.err.println("ERROR: The following option doesn't exist. Exiting to main menu ...");
                                    break;
                        }
                        break;
                case 3: System.out.println("Please state what you want to do with the Square\n"
                                        + "1) Get the dimentions \n"
                                        + "2) Adust the Square's Dimetions\n"
                                        + "3) Draw rectangle\n"
                                        + "4) Calculate the Area\n"
                                        + "5) Calculate the Circumferance\n");
                        System.out.print("Please type out your option:");
                        int squareSelection = keyboard.nextInt();
                        switch(squareSelection){
                            case 1:
                                    break;
                            case 2:
                                    break;
                            case 3:
                                    break;
                        }
                        break;
                case 4: programExiter = true;
                        break;
                default:System.err.println("ERROR: The following option you have selected "+shapeInteration+" is not in the list\nPlease retry.");
                        break;
                
            }
        }
    }
    
}
