//Scott Galdi
//hw03 - Timer
//9/12/15

/////////////////////////////////////////////////////////////////////
//                                                                 //
//  This program allows the user to input the current time of day  //
//  and the time at which they plan to have dinner.  The program   //
//  will then calculate how much time they have until dinner.      //
//                                                                 //
/////////////////////////////////////////////////////////////////////

//Imports a scanner into the java program which will later be used to ask for input from the user
import java.util.Scanner;

//Public class required for every java program
public class Timer{
    
    //Main method required for every java program
    public static void main(String[] args){
        
        Scanner myScanner=new Scanner(System.in);   //Calls the scanner to allow for user input
        
        System.out.print("Enter the current time: ");   //Prompts the user to input the current time
        double currentTime=myScanner.nextDouble();  //Stores the current time as a variable
        
        System.out.print("Enter the time that you will be eating dinner: ");    //Prompts the user to input the time of dinner
        double dinnerTime=myScanner.nextDouble();   //Stores the time of dinner as a variable
        
        double time;    //The time until dinner
        int hours;  //The number of hours until dinner
        int minutes;    //The number of minutes until dinner
        
        time=dinnerTime-currentTime;    //Calculates the time until dinner
        hours=(int)time/100;    //Calculates the number of hours until dinner
        minutes=(int)time%100;  //Calculates the number of minutes until dinner
        
        //Displays the number of hours and minutes until dinner
        System.out.println("You have "+hours+" hours and "+minutes+" minutes until dinner.");
        
        
    }   //End of main method
}   //End of class