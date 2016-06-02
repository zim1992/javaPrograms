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
public class RightTriangle extends ShapeBasics implements TriangleInterface{
    private int height;
    private int base;
    public RightTriangle(int height, int base){
        this.height = height;
        this.base = base;
    }

    @Override
    public void set(int newBase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
    
    
}
