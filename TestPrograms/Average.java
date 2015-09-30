/////////////////////////////////////////////////////////////////
//                                                             //
//  This program allows the user to input three numbers.  The  //
//  program will then find the average of the three numbers.   //
//                                                             //
/////////////////////////////////////////////////////////////////

//Imports a scanner into the java program which will later be used to ask for input from the user
import java.util.Scanner;

//Public class required for every java program
public class Average{
    
    //Main method required for every java program
    public static void main (String [] args){
        
        Scanner myScanner=new Scanner(System.in);   //Calls the scanner to allow for user input
        
        System.out.println("Enter three numbers:"); //Message to the user that they will need to input 3 numbers
        
        System.out.print("Number 1: "); //Prompts the user to input the first number
        double numberOne=myScanner.nextDouble();    //Stores the first number as a variable
        System.out.print("Number 2: "); //Prompts the user to input the second number
        double numberTwo=myScanner.nextDouble();    //Stores the second number as a variable
        System.out.print("Number 3: "); //Prompts the user to input the third number
        double numberThree=myScanner.nextDouble();  //Stores the third number as a variable
        
        double sum; //Variable for the sum of the 3 numbers
        double average; //Variable to store the average of the 3 numbers
        
        sum=numberOne+numberTwo+numberThree;    //Calculates the sum of the 3 numbers
        average=sum/3;  //Calculates the average of the 3 numbers
        
        System.out.println("The average of the three numbers is "+average); //Displays the average of the 3 numbers
    

    }   //End of main method
}   //End of class