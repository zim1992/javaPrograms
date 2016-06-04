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
public class Person {
    private String name;
    public Person(){
        name = "No name yet";
    }
    public Person(String initialName){
        name = initialName;
    } public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    } public void writeOutput(){
        System.out.println("Name: " + name);
    } 
    public boolean hasSameName(Person otherPerson){ 
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}
