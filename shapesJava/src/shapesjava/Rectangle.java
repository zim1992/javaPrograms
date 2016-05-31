/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesjava;

/**
 *
 * @author Corjan
 */
public class Rectangle extends ShapeBasics implements RectangleInterface 
{ 
    
private int height;
private int width;
private int area;
private int circumfrance; 
public Rectangle(){ 
    super();
    height = 0; 
    width = 0;
}
public Rectangle(int height, int width){
    super();
    this.height = height;
    this.width = width;
    
}
private void calculateArea(){
    area = width*height;    
}
public int getArea(){
    calculateArea();
    return area;
}
private void calculateCircumfrance(){
    circumfrance = 2*height+2*width;
    
}
public int getCircumfrance(){
    calculateCircumfrance();
    return circumfrance;
}
public Rectangle(int theOffset, int theHeight, int theWidth){
    super(theOffset); 
    height = theHeight; 
    width = theWidth; 
}
public void set(int newHeight,int newWidth){        
    height = newHeight;
    width = newWidth;
} 
 public void drawHere(){
     drawHorizontalLine();
     drawSides();
     drawHorizontalLine();
 } 
 private void drawHorizontalLine(){
    skipSpaces(getOffset());
    for (int count = 0; count < width; count++)
        System.out.print('-');        
    System.out.println();    
 } 
private void drawSides(){
     for (int count = 0; count < (height - 2); count++)
         drawOneLineOfSides();
    
} 
private void drawOneLineOfSides(){
    skipSpaces(getOffset());
    System.out.print('|');
    skipSpaces(width - 2);
    System.out.println('|');
}
//Writes the indicated number of spaces. 
private static void skipSpaces(int number){ 
    for (int count = 0; count < number; count++)
    System.out.print(' ');    
} 
} 

