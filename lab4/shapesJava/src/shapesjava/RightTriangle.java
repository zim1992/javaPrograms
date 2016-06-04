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
    public void drawHere(){
        drawSides();
        drawbaseline();
    }
    private void drawbaseline(){
        for(int count=0; count<base;count++)
            System.out.print("*");
        System.out.println();
    }
    private void skipSpaces(int skipSpaces){
        for(int count=0;count<skipSpaces;count++)
            System.out.print(" ");
    }
    private void drawSides(){       
        float distruption = (float) base/height;
        System.out.println("Base");
        System.out.println("d:"+distruption+" h:"+height+" b:"+base);
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
    private void calulateArea(){
        triangleArea = 0.5*base*height;        
    }
    private void calcuateCircumference(){
        triangleCircumferance = base+height+sqrt(base*base+height*height);
    }
    public double getArea(){
        calulateArea();
        return triangleArea;
    }
    public double getCircumference(){
        calcuateCircumference();
        return triangleCircumferance;
    }
    
        
    
    
}
