//Scott Galdi
//hw05 - Average Grade
//9/29/15


//Imports a scanner into the java program which will later be used to ask for input from the user
import java.util.Scanner;

//Public class required for every java program
public class AverageGrade{
    
    //Main method required for every java program
    public static void main(String[] args){
        
        Scanner grade = new Scanner(System.in);
        
        double g = 0;   //Initializes the grade variable
        double avg = 0; //Initializes the average of the grades variable
        int counter = 0;    //Initializes the counter variable
        double total = 0;   //Initializes the total of the grades variable
        
        //Loop will run while input is not 999
        while (g != 999){
            System.out.print("Enter a grade or type 999 to exit: ");    //prompts the user to input a grade
            g=grade.nextDouble();   //stores the grade as variable g
            
            if ((g >= 0) && (g <= 100)){    //If the grade is between 0 and 100 it will add it to the total of the grades and increment the counter by 1
                total = total + g;
                counter++;
            }
            else if ((g >= 0) || (g <= 100)){   //If the grade is greater than 100 or less than 0 the program will tell the user it is an invalid input
                System.out.println("Invalid grade in (must be between 0 and 100).");
            }   //end of if statement
        }   //end of while loop
        avg = total/counter;    //calculates the average of the grades
        System.out.println("Average grade: " + avg);    //displays the average of the grades
    }   //end of main method
}   //end of class