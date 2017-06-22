/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twentyfourtotwelvehourtimeconverter;
import java.util.Scanner;
/**
 *
 * @author Corjan Zee
 */
public class Runner 
{
char timeInTwentyFourHour[] = new char[5];
public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        TwentyFourToTwelveHourTimeConverter converter = new TwentyFourToTwelveHourTimeConverter();
        System.out.println("In this program you will be able to convert the time from the 24 hour formate \nto 12 hour formate. For example 13:40 will be converted to 1:40 PM.\nPlease write down the time you wish to convert in the 24 hour formate ");
        do{
        String timeInTwentyForHourString = keyboard.next();
        converter.checkTimeSymble(timeInTwentyForHourString);
        converter.checkHours(timeInTwentyForHourString);
        converter.checkMinute(timeInTwentyForHourString);
        if(converter.validTime()){
            System.err.println("You made an error Please try correcting it and retry enering the time you are wanting to be convered");
        }
        }while(converter.validTime());
        converter.setHourInTwelveHour();
        converter.setHourExtension();
        System.out.println("The current time in twelve hour formate is "+converter.getHourInTwelveHour()+":"+converter.getMinutes()+" "+converter.getHourExtensition()); 
//        System.out.println("Was this the desired time you wished to see\n1\tYes\n2\tNo");
    }
}
