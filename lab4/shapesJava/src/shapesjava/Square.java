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
public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(int height){
        super(height,height);
    }
    
    public void set(int length){
        super.set(length, length);
    }
    
}
