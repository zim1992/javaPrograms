/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package timebook;

/**
 *
 * @author Corjan Zee
 */
public class TimeBook {
private int numberOfEmployees;
private int[][] hours; //hours[i][j] has the hours for
//employee j on day i.
private int[] weekHours; //weekHours[i] has the week's
//hours worked for employee i + 1.
private int[] dayHours; //dayHours[i] has the total hours
//worked by all employees on day i.
private static final int NUMBER_OF_WORKDAYS = 5;
private static final int MON = 0;
private static final int TUE = 1;
private static final int WED = 2;
private static final int THU = 3;
private static final int FRI = 4;
private static final int NUMBER_OF_EMPLOYEES = 3;

    /**
     * @param args the command line arguments
     */
    

    
public TimeBook(int theNumberOfEmployees)
 {
 numberOfEmployees = theNumberOfEmployees;
 hours = new int[NUMBER_OF_WORKDAYS][numberOfEmployees];
 weekHours = new int[numberOfEmployees];
 dayHours = new int[NUMBER_OF_WORKDAYS];
 }
public void setHours() //This is a stub.
 {
 hours[0][0] = 8; hours[0][1] = 0; hours[0][2] = 9;
 hours[1][0] = 8; hours[1][1] = 0; hours[1][2] = 9;
 hours[2][0] = 8; hours[2][1] = 8; hours[2][2] = 8;
 hours[3][0] = 8; hours[3][1] = 8; hours[3][2] = 4;
 hours[4][0] = 8; hours[4][1] = 8; hours[4][2] = 8;
 }
public void update()
 {
 computeWeekHours();
 computeDayHours();
 }
private void computeWeekHours()
 {
for (int employeeNumber = 1; employeeNumber <=numberOfEmployees; employeeNumber++)
{//Process one employee:
int sum = 0;
for (int day = MON; day <= FRI; day++)
 sum = sum + hours[day][employeeNumber - 1];
 //sum contains the sum of all the hours worked in 
//one
 //week by the employee with number employeeNumber.
 weekHours[employeeNumber - 1] = sum;
 }
 }
private void computeDayHours()
 {
for (int day = MON; day <= FRI; day++)
 {//Process one day (for all employees):
int sum = 0;
for (int employeeNumber = 1;
employeeNumber <= numberOfEmployees;
employeeNumber++)
 sum = sum + hours[day][employeeNumber - 1];
 //sum contains the sum of all hours worked by all
 //employees on one day.
 dayHours[day] = sum;
 }
 }
public void showTable()
 {
// heading
 System.out.print(" Employee ");
for (int employeeNumber = 1;
employeeNumber <= numberOfEmployees;
employeeNumber++)
 System.out.print(addSpaces(employeeNumber,6) + " ");
 System.out.println("Totals");
 System.out.println( );
// row entries
for (int day = MON; day <= FRI; day++)
 {
 System.out.print(getDayName(day) + " ");
for (int column = 0; column < hours[day].length;
column++)
 System.out.print(addSpaces(hours[day][column],6) + " ");
 System.out.println(dayHours[day]);
 }
System.out.println( );
 System.out.print("    Total:");
for (int column = 0; column < numberOfEmployees; column++)
 System.out.print(addSpaces(weekHours[column],6) + " ");
 System.out.println( );
 }
//Converts 0 to "Monday", 1 to "Tuesday", etc.
//Blanks are inserted to make all strings the same length.
private String getDayName(int day)
 {
 String dayName = null;
switch(day){
case MON:
 dayName = "   Monday";
 break;
case TUE:
 dayName = "  Tuesday";
 break;
case WED:
 dayName = "Wednesday";
 break;
case THU:
 dayName = " Thursday";
 break;
case FRI:
 dayName = "   Friday";
 break;
default:
 System.out.println("Fatal Error.");
 System.exit(0);
 break;
 }
return dayName;
 }
public String addSpaces(int hours, int length){
    String hoursString = Integer.toString(hours);
    int amountOfSpaces = length - hoursString.length();
    String spacesToAdd = hoursString;
    for(int i=0;i<amountOfSpaces;i++){
        spacesToAdd+=" ";
    }
    return spacesToAdd;
}
public int[][] getTable(){
  return hours;  
}
public int getHoursWorkedPerWeek(int employeeNumber){
  return weekHours[(employeeNumber - 1)];  
}
public int getHoursWorkedPerDay(int employee,int day){
    return hours[(employee-1)][day];
}
public void changeHoursWorkedPerEmployeePerDay(int day,int employee,int newValueHour){
    this.hours[(employee-1)][day]=newValueHour;
}
public void setHoursWorkedPerDay(int hoursWorked,int day, int employee){
    hours[(employee-1)][day]=hoursWorked;
}
}