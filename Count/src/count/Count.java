/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package count;

/**
 *This program was made by Corjan Eugene Zee 
 * this program is designed to have opperators which are to be used in the class NewClass
 * The opperators include ones which are able to reset, increase by one and 10, decrease by 1 and decrease by one and display a value 
 */
public class Count {

   private int i;
   
    public void count1(){
      i++;
    }
    public void reset(){
      i=0;
    }
    public void count10(){
     i=i+10;
    }
    public void decrease1(){
       if(i>1){
        i--;
    }
    else{
        reset();
    }
    }   
    public void decrease10(){
    if(i>9){
        i=i-10;
    }
    else{
        reset();
    }
    }
   public int currentdigits(){
    return i; 
    }
   public void display(){
       System.out.println("Your current value is "+i);
   }
}
