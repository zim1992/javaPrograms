/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesjava;

import static java.lang.Math.sqrt;

/**
 *
 * @author Corjan
 */
public class RightTriangle extends ShapeBasics implements TriangleInterface{
    private int height;
    private int base;
    private double triangleArea;
    private double triangleCircumferance;
    public RightTriangle(int height, int base){
        this.height = height;
        this.base = base;
    }
    public int getHeight(){
        return height;
    }
    public int getBase(){
        return base;
    }

    @Override
    public void set(int newBase, int newHeight) {
        base = newBase;
        height = newHeight;
    }
    /**
     * This Method is used to draw the Triangle. 
     */
    public void drawHere(){
        drawSides();
        drawbaseline();
    }
    /**
     * This method draws the base line of the triangle.
     */
    private void drawbaseline(){
        for(int count=0; count<base;count++)
            System.out.print("*");
        System.out.println();
    }
    
    /**
     * This method is used to draw both the vertical side and the slanted side of the right triangle. 
     */
    private void drawSides(){       
        float distruption = (float) base/height;
        System.out.println("*");
        for(int count=1;count<(height-3);count++){
            System.out.print("*");
            skipSpaces((int)Math.ceil(count*distruption));
            if(Math.ceil(count*distruption)==Math.ceil((count-1)*distruption)){
                System.out.println();
            }else{
                System.out.println("*");
            }
        }
    }
    /**
     * This method is used to skip spaces when drawing the sides of the triangle.
     * @param skipSpaces - The Number of spaces which need to be skipped. 
     */
    private void skipSpaces(int skipSpaces){
        for(int count=0;count<skipSpaces;count++)
            System.out.print(" ");
    }
    /**
     * Calculates Area of Right triangle
     */
    private void calculateArea(){
        triangleArea = 0.5*base*height;        
    }
    private void calculateCircumference(){
        triangleCircumferance = base+height+sqrt(base*base+height*height);
    }
    /**
     * Uses the calculate area method first then returns the triangle's Area
     * @return - Area of the triangle.
     */
    public double getArea(){
        calculateArea();
        return triangleArea;
    }
    /**
     * Uses the calculate circumference method to calculate the circumference and returns the circumference.
     * @return - The circumference of the triangle.
     */
    public double getCircumference(){
        calculateCircumference();
        return triangleCircumferance;
    }
    
        
    
    
}
