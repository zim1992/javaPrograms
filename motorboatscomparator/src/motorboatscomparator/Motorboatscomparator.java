/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package motorboatscomparator;

/**
 *This program was written by Corjan Eugene Zee
 * Student Number 394986
 * This designed to compare to motor boats 
 */
public class Motorboatscomparator {

    /**
     * @param args the command line arguments
     */
   private int fuelTankCapacity2 = 50;
   private int maxSpeed2 = 12;
   private double currentSpeed2 = 12;
   public int fuelTankCapacity1;
   public int maxSpeed1;
   public double currentSpeed1;
   double changeInSpeed;
   Motorboatscomparator(int fuelTankCapacity1,int maxSpeed1,double currentSpeed1){
    this.currentSpeed1= currentSpeed1;
    this.fuelTankCapacity1 = fuelTankCapacity1;
    this.maxSpeed1 = maxSpeed1;
   }
   public void setTankCapacity(int fuelTankCapacity2){
       if(fuelTankCapacity2>0){

           this.fuelTankCapacity2 = fuelTankCapacity2;
       }
   }
   /**
    * setCurrentSpeed - This will insure that the max speed 2 is a positive number 
    */
  
   public void setCurrentSpeed(double currentSpeed2){
       if((currentSpeed2<maxSpeed2)&&(currentSpeed2>0)){
           this.currentSpeed2=currentSpeed2;
       }
       if(currentSpeed2<0){
           this.currentSpeed2=0;
       }
       if(currentSpeed2>maxSpeed2){
           this.currentSpeed2=maxSpeed2;
       }
   }
   /** 
    * 
    * @param SetMaxSpeed
    *Ensures that the max speed is possitive 
    */
   public void setMaxSpeed(int maxSpeed2){
       if(maxSpeed2>0){
           this.maxSpeed2=maxSpeed2;
       }
   }
   /**
    * 
    * @param TestBoats will test to see if the two boats are identical 
    */
   public void TestBoats(){
       if((fuelTankCapacity1==fuelTankCapacity2)&&(maxSpeed1==maxSpeed2)&&(currentSpeed1==currentSpeed2)){
           System.out.println("The two motor boats are Identical: fuelTankCapacity1 = "+fuelTankCapacity1+" fuelTankCapacity2 = "+fuelTankCapacity2+" maxSpeed1 = "+maxSpeed1+" maxSpeed2 = "+maxSpeed2+" currentSpeed1 = "+currentSpeed1+" currentSpeed2 = "+currentSpeed2);
       }
       else{
           System.out.println("The following two motor boats are not Identical: fuelTankCapacity1 = "+fuelTankCapacity1+" fuelTankCapacity2 = "+fuelTankCapacity2+" maxSpeed1 = "+maxSpeed1+" maxSpeed2 = "+maxSpeed2+" currentSpeed1 = "+currentSpeed1+" currentSpeed2 = "+currentSpeed2);
       }
   }
   /**
    * 
    * @param TestMaxSpeed will test to see which boat is going faster
    */
   public void TestMaxSpeed(){
       if(maxSpeed2==maxSpeed1){
        System.out.println("The Max speed of the two motor boats are Identical: maxspeed1 = "+maxSpeed1+" maxspeed2 = "+maxSpeed2);
       }
       if(maxSpeed2>maxSpeed1){
        System.out.println("Unfortunatly your motor boat has a lower max speed: maxspeed1 = "+maxSpeed1+" maxspeed2 = "+maxSpeed2);
       }
       else{
           System.out.println("The Two motor boats don't have the same max speed but your motor boat has a higher max Speed.: maxspeed1 = "+maxSpeed1+" maxspeed2 = "+maxSpeed2);
       }
   }
   /**
    * 
    * @param TestTankCapacity This will test to see who has the larger tank 
    */
   public void TestTankCapacity(){
       if(fuelTankCapacity1==fuelTankCapacity2){
           System.out.println("The two tanks have the same Fuel Capacity: fuelTankCapacity1 = "+fuelTankCapacity1+" fuelTankCapacity2 = "+fuelTankCapacity1);
       }
       if(fuelTankCapacity1>fuelTankCapacity2){
           System.out.println("Your fuel tank can handle more fuel: fuelTankCapacity1 = "+fuelTankCapacity1+" fuelTankCapacity2 = "+fuelTankCapacity1);
       }
       else{
           System.out.println("the Other motor Boat can handle more fuel: fuelTankCapacity1 = "+fuelTankCapacity1+" fuelTankCapacity2 = "+fuelTankCapacity1);
       }
   }
   /**
    * 
    * @param WhoDrivingFaster will determine who boat is driving faster
    */
   public void WhoDrivingFaster(){
       if(currentSpeed1>currentSpeed2){
           changeInSpeed = currentSpeed1-currentSpeed2;
           System.out.println( "You are going faster by"+changeInSpeed+" km/h:currentSpeed1 = "+currentSpeed1+" currentSpeed2 = "+currentSpeed2);
       }
       if(currentSpeed1<currentSpeed2){
           changeInSpeed = -currentSpeed1+currentSpeed2;
           System.out.println("The other motor boat is going faster by"+changeInSpeed+" km/h:currentSpeed1 = "+currentSpeed1+" currentSpeed2 = "+currentSpeed2);
       }
       else{
          System.out.println("You are both going at the same speed:currentSpeed1 = "+currentSpeed1+" currentSpeed2 = "+currentSpeed2);
       }
   }
   /**
    * 
    * @param WhoCanDriveTheFastest see who has the highest maximum speed
    */
   public void WhoCanDriveTheFastest(){
       if(maxSpeed1>maxSpeed2){
           System.out.println("You can go faster than the other Motor boat.: maxspeed1 = "+maxSpeed1+" maxspeed2 = "+maxSpeed2);
       }
       if(maxSpeed1<maxSpeed2){
           System.out.println("The other Motor boat can go faster than you.: maxspeed1 = "+maxSpeed1+" maxspeed2 = "+maxSpeed2);
       }
       else{
           System.out.println("You are both can go at the same speed: maxspeed1 = "+maxSpeed1+" maxspeed2 = "+maxSpeed2);
       }
   }
    }

