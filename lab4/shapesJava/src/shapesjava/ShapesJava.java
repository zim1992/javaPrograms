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
        RightTriangle rightTriangle = new RightTriangle(4,4);
        Rectangle rectangle = new Rectangle(4,4);
        Square square = new Square(4);
        boolean programExiter = false;
        while(!programExiter){
            System.out.println("Please state which shape you would like to interact with first\n"
                            + "1) Right Triangle\n"//done
                            + "2) Rectangle\n"//done
                            + "3) Square\n"//done
                            + "4) To exit the program\n");
            System.out.print("Please place the the menu option here:");
            shapeInteration = keyboard.nextInt();
            switch(shapeInteration){
                case 1: System.out.println("Please state what you want to do with the Right Triangle\n"
                                        + "1) Get the dimentions \n"
                                        + "2) Adust the right triangle's Dimetions\n"
                                        + "3) Draw Right Triangle\n"
                                        + "4) Calculate the Area\n"
                                        + "5) Calculate the Circumferance\n");
                        System.out.print("Please type out your option:");
                        int rightTriangleSelector=keyboard.nextInt();
                        switch(rightTriangleSelector){
                            case 1: System.out.println("Height: "+rightTriangle.getHeight()+"\n"
                                                    + "Base: "+rightTriangle.getBase());
                                    break;
                            case 2: System.out.println("Which dimention do you want to adjust\n"
                                                    + "1) Height\n"
                                                    + "2) Base\n"
                                                    + "3) Both \n");
                                    System.out.print("Please type select an option:");
                                    int rightTriangleDimentionSelection = keyboard.nextInt();
                                    int height,base;
                                    switch(rightTriangleDimentionSelection){
                                        case 1: System.out.println("You are editing the height. Please type the new height of the Right Triangle");
                                                height = keyboard.nextInt();
                                                rightTriangle.set(rightTriangle.getBase(),height);
                                                break;
                                        case 2: System.out.println("You are editing the Base. Please type the new height of the Right Triangle");
                                                base = keyboard.nextInt();
                                                rightTriangle.set(base,rightTriangle.getHeight());
                                                break;
                                        case 3: System.out.println("You are editing the height. Please type the new height of the Right Triangle");
                                                height = keyboard.nextInt();
                                                System.out.println("You are editing the Base. Please type the new height of the Right Triangle");
                                                base = keyboard.nextInt();
                                                rightTriangle.set(base,height);
                                                break;
                                        default: System.err.println("ERROR: The following option doesn't exist. Exiting to main menu ...");
                                    }
                                    break;
                            case 3: rightTriangle.drawHere();
                                    break;
                            case 4: System.out.println("The Area of the Right Triangle is: "+rightTriangle.getArea());
                                    break;
                            case 5: System.out.println("The Circumferance of the Right Triangle is: "+rightTriangle.getCircumference());
                                    break;
                            default: System.err.println("ERROR: The following option doesn't exist. Exiting to main menu ...");
                                    break;
                        }
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
                                    int rectangleDimentionSelection = keyboard.nextInt();
                                    int height,width;
                                    switch(rectangleDimentionSelection){
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
                            case 5: System.out.println("The Circumferance of the rectangle is: "+rectangle.getCircumference());
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
                            case 1: System.out.println("length of square is: "+square.getHeight());
                                    break;
                            case 2: System.out.println("You will be editing length of the of the square. Please type out the new length");
                                    int length = keyboard.nextInt();
                                    square.set(length);
                                    break;
                            case 3: square.drawHere();
                                    break;
                            case 4: System.out.println("The area of the square is: "+square.getArea());
                                    break;
                            case 5: System.out.println("The curcumferance of the square is: "+square.getCircumference());
                                    break;
                            default:System.err.println("ERROR: The following option doesn't exist. Exiting to main menu ...");
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
