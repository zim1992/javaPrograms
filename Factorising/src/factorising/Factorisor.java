/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorising;

/**
 *This Program was developed by Corjan Eugene Zee, Student Number 394986. 
 * This is the background program which is used to control a program which inputs a rational values in the form of a fraction.
 */
public class Factorisor {
    private static int higherValue;
    public int numerator;
    public int denominator;
    public void Factorisor(){
        numerator = 0;
        denominator = 1;
    }
    
    public void Factorisor(int num,int den){
        numerator = num/getGCF(num,den);
        denominator = den/getGCF(num,den);
        
    }
    public void simplifier(int num,int den){
        numerator = num/getGCF(num,den);
        denominator = den/getGCF(num,den);
    }
    public void setFraction(int num,int den){
        numerator =num;
        denominator = den;
    }
    
    private static int getGCF(int num,int den){
        if(num>den){
           higherValue = num;
        }
        else{
           higherValue = den;
        }
        for(int gcf=higherValue;gcf>0;gcf--){
            if((num %gcf==0)&&(den %gcf==0)){
              return gcf;  
            }            
        }
        return 1;
    }
    public double getValue(){
        return (double)numerator/denominator;
    }
    public String toString(){
        String num = Integer.toString(numerator);
        String den = Integer.toString(denominator);
        return num+"/"+den;
    }
    public int intTest(String value){
        double valueDouble = Double.parseDouble(value);
        return (int)Math.round(valueDouble);
        
    }
}
