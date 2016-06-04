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
public class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;
    /**
     * This method is a constructor method
     * @param manufactureName - the Name of the manufacturing company
     * @param numberOfCylinders - this is the number of cylinders the engine has
     * @param owner - This is the name of the owner of the vehicle
     * @param loadCapacity - This is the max load the vehicle can load in Tons
     * @param towingCapacity - This is the amount of load the truck can tow
     */
    public Truck(String manufactureName,int numberOfCylinders,Person owner,double loadCapacity, double towingCapacity){
        super(manufactureName,numberOfCylinders,owner);
        this.loadCapacity=loadCapacity;
        this.towingCapacity = towingCapacity;
    }
    /**
     * This is a method which is used to modify the load capacity of the truck
     * @param loadCapacity - this is the load capacity in tons 
     */
    public void setLoadCapacity(double loadCapacity){
        this.loadCapacity = loadCapacity;
    }
    /**
     * This method is used to modify the towing capacity of the truck
     * @param towingCapacity 
     */
    public void setTowingCapacity(double towingCapacity){
        this.towingCapacity = towingCapacity;
    }
    public double getLoadCapacity(){
        return loadCapacity;
    }
    public double getTowingCapacity(){
        return towingCapacity;
    }
    /**
     * This method is used to write the data to the consol
     */
    public void writeOutput(){
        super.writeOutput();
        System.out.println("Load Capacity: "+loadCapacity+
                           "\nTowing Capacity: "+towingCapacity);
    }
}
