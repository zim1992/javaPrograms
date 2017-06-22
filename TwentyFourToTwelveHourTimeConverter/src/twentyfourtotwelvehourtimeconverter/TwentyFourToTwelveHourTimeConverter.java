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
public class TwentyFourToTwelveHourTimeConverter {
    private int hourInTwentyFourHour;
    private int hourInTwelveHour;
    private int minutes;
    public String hourExtensition;
    public int testNumber = 1;
    public int checkValidHour =1;
    public int checkValidMinute = 1;
    public int checkValidSymbol = 1;
    
    /**
     * @return hour in twenty four hour formate 
     */
    public int getHourInTwelveHour()
    {
        return hourInTwelveHour;
    }
    /**
     * @return the hour in twelve hour formate 
     */
    public int getHourInTwentyFour()
    {
        return hourInTwentyFourHour;
    }
    /**
     * @return amount of minutes are in in the time
     */
    public int getMinutes()
    {
        return minutes;
    }
    public String getHourExtensition()
    {
        return hourExtensition;
    }
    /**
     * Take the existing hour in twenty four hour formate and sets it as the hour in twenty four hour formate 
     * @param hourInTwentyFourHour 
     */
    public void setHourInTwentyFourHour(int hourInTwentyFourHour)
    {
        this.hourInTwentyFourHour = hourInTwentyFourHour;
    }
    /**
     * take the current in put and sets it a variable
     * @param minutes 
     */
    public void setMinute(int minutes)
    {
        this.minutes = minutes;
    }
    /**
     * this takes the time in twenty for hours and converts it to twelve hour formate
     */
    public void setHourInTwelveHour()
    {
        if(hourInTwentyFourHour<=12)
        {
            hourInTwelveHour = hourInTwentyFourHour;
        }
        if((hourInTwentyFourHour>12)&&(hourInTwentyFourHour<24))
        {
            hourInTwelveHour = hourInTwentyFourHour - 12;
        }
        if(hourInTwentyFourHour ==24||hourInTwentyFourHour==0)
        {
            hourInTwelveHour = 12;
        }
    }
    /**
     * This method determines whether the extension of the twelve hour formate shuold be "AM" or "PM"
     */
    public void setHourExtension()
    {
        if(hourInTwentyFourHour<12)
        {
            hourExtensition = "AM";
        }
        if((hourInTwentyFourHour>=12)&&(hourInTwentyFourHour<24))
        {
            hourExtensition = "PM";
        }
        if(hourInTwentyFourHour ==24)
        {
            hourExtensition = "AM";
        }
        
    }

    
   public void checkHours(String timeInTwentyFourHours)
   {
       int numberLength = timeInTwentyFourHours.length();
       checkValidHour = 1;
       if(numberLength <= 3)
       {
           try{
               throw new TimeFormatException("ERROR: Invalid time \nYou have placed too few charicters for a time ");
           }catch(TimeFormatException e){
               System.err.println(e.getMessage());
           }
        }
       if(numberLength == 4)
       {      
            String hour = timeInTwentyFourHours.substring(0, 1);
            int singleHour = Integer.parseInt(hour); 
            setHourInTwentyFourHour(singleHour);
            setHourInTwelveHour();
            setHourExtension();
            checkValidHour = 2;
           
       }
       if(numberLength == 5)
       {
           try
           {               
               String hour = timeInTwentyFourHours.substring(0, 2);
               int doubleHour = Integer.parseInt(hour);
               try{
                    if(doubleHour<=24)
                    {
                        setHourInTwentyFourHour(doubleHour);
                        setHourInTwelveHour();
                        setHourExtension();
                        checkValidHour =2;
                    }
                    else
                    {
                        throw new TimeFormatException("ERROR: Invalide Hour: hour values only exist below 24 \n");
                    }
               }catch(TimeFormatException ex){
                   System.err.println(ex.getMessage());
               }
           }catch(Exception e){
               System.err.println("ERROR: Invalide time \nYou have placed in am hour value which does not contain a number like 1 or 2. \nyou cannot add charicters lik &, R,q or *.");
           }
           
       }
       if(numberLength>=6)
       {
           System.err.print("ERROR Invalid Time \nYou have placed to many Charicters into the time");
       }
       
   }
   /**
    * takes the full time inputted by the user 
    * @param timeInTwentyFourHours 
    * and validates where the user has placed the validates where the user has inputted the write value for minutes 
    */
   public void checkMinute(String timeInTwentyFourHours)
   {
       int numberLength = timeInTwentyFourHours.length();
       checkValidMinute = 1;
       if(numberLength <= 3)
       {
           try {
               throw new TimeFormatException("ERROR: Invalid time \nYou have placed too few charicters for a time ");
           } catch (TimeFormatException e) {
               System.err.println(e.getMessage());
           }
       }
       if(numberLength == 4)
       {
           try
           {               
               String minutes = timeInTwentyFourHours.substring(2);
               int minute = Integer.parseInt(minutes);
              try{
               if(minute<=60)
               {
                   setMinute(minute);
                   checkValidMinute =2;
               }
               else
               {
                   throw new TimeFormatException("ERROR: Invalide Minute: hour values only exist below 60 \n");
               }
              }catch(Exception ex){
                  System.err.println(ex.getMessage());
              }
           }catch(Exception e){
               System.err.println("ERROR: Invalide time \nYou have placed in am hour value which does not contain a number like 1 or 2. \nyou cannot add charicters lik &, R,q or *.");
           }
       }
       if(numberLength == 5)
       {
           try
           {               
               String minutes = timeInTwentyFourHours.substring(3);
               int minute = Integer.parseInt(minutes);
              
               if(minute<=60)
               {
                   setMinute(minute);
                   checkValidMinute =2;
               }
               else
               {
                   System.err.println("ERROR: Invalide Minute: hour values only exist below 60 \n");
               }
           }catch(Exception e){
               System.err.println("ERROR: Invalide time \nYou have placed in am hour value which does not contain a number like 1 or 2. \nyou cannot add charicters lik &, R,q or *.");
           }
           
       }
       if(numberLength>=6)
       {
           System.out.print("ERROR Invalid Time \nYou have placed to many Charicters into the time");
       }
       
   }
   /**
    * This take the full number and checks where a ":"is present
    * @param timeInTwentyFourHours 
    */
   public void checkTimeSymble(String timeInTwentyFourHours)
   {
       int numberLength = timeInTwentyFourHours.length();
       checkValidSymbol= 1;
       if(numberLength <= 3)
       {
            System.out.println("ERROR: Invalid time \nYou have placed too few charicters for a time ");
       }
       if(numberLength == 4)
       {
           String middleString = timeInTwentyFourHours.substring(1,2);
           if(":".equals(middleString))
           {
               checkValidSymbol=2;
           }
           else
           {
               try {
                    throw new TimeFormatException("ERROR: Wrong or No symbol placed.\nyou have not inserted a \":\" into your time");
               } catch (TimeFormatException e) {
                    System.err.println(e.getMessage());
               }
           }

       }
       if(numberLength == 5)
       {
           String middleString = timeInTwentyFourHours.substring(2,3);
           if(":".equals(middleString))
           {
               checkValidSymbol=2;
           }
           else
           {
               try {
                    throw new TimeFormatException("ERROR: Wrong or No symbol placed.\nyou have not insirted a \":\" into your time");
               } catch (TimeFormatException e) {
                    System.err.println(e.getMessage());
               }
           }

       }
       if(numberLength>=6)
       {
           System.out.println("ERROR Invalid Time \nYou have placed to many Charicters into the time");
       }
       
   }
   /**
    * Checks whether the time is a valid time
    * @return false if the time is a valid time 
    * @return true if the time is invalid
    */
   public boolean validTime()
   {
       return (checkValidHour != 2) || (checkValidMinute != 2) || (checkValidSymbol != 2);
   }
    
    
}
