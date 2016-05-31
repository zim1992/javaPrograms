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
public interface ShapeInterface {
    /** 
     * Sets the offset for the shape. 
     */ 
    public void setOffset(int newOffset);
    /** 
     * Returns the offset for the shape.
     */ 
    public int getOffset(); 
    /** 
     * Draws the shape at lineNumber lines down from the current line. 
     */ 
    public void drawAt(int lineNumber); 
    /**
     * Draws the shape at the current line. 
     */ 
    public void drawHere();

    
}
