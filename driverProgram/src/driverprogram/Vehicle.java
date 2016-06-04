/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverprogram;

/**
 *
 * @author Corjan
 */
public class Vehicle extends Person{
    private String manufactureName;
    private int numOfCylinders;
    private Person owner;
    public Vehicle(String manufactureName,int numOfCylinders,Person owner){
        this.manufactureName = manufactureName;
        this.numOfCylinders = numOfCylinders;
        this.owner = owner;
    }
    public void setManufactureName(String manufactureName){
        this.manufactureName = manufactureName;
    }
    public void setNumOfCylinders(int numOfCylinders){
        this.numOfCylinders = numOfCylinders;
    }
    public void setOwner(Person owner){
        this.owner = owner;
    }
    public String getManufactureName(){
        return manufactureName;
    }
    public int getNumberOfCylinders(){
        return numOfCylinders;
    }
    public Person getOwner(){
        return owner;
    }
    public void writeOutput(){
        owner.writeOutput();
        System.out.println("Manufacture Name: "+manufactureName+
                           "\nNumber of Cylinders: "+numOfCylinders);
    }
    
}
