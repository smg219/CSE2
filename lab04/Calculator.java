//Scott Galdi
//lab04 - Calculator
//9/17/15

//////////////////////////////////////////////////////////////////////////////////////
//                                                                                  //
//  The purpose of this program is to demonstrate how the switch statement works.   //
//  This is done by prompting the user to input to random integers and then asking  //
//  them to input an operator (+,-,*,/). The program will then use the switch       //
//  statement on the operators to see which operator was input by the user. If      //
//  the input operator is valid the program will run, otherwise the program will    //
//  tell the user "Illegal operator".                                               //
//                                                                                  //
//////////////////////////////////////////////////////////////////////////////////////

//Imports a scanner into the java program which will later be used to ask for input from the user
import java.util.Scanner;

//Public class required for every java program
public class Calculator{
    
    //Main method required for every java program
    public static void main(String[] args){
        
        Scanner myScanner=new Scanner(System.in);   //Calls the scanner to allow for user input
        
        System.out.print("Enter the first integer: ");  //Prompts the user to input the first variable a
        int a=myScanner.nextInt();  //Stores the first variable a as an int
        
        System.out.print("Enter the second integer: "); //Prompts the user to input the second variable b
        int b=myScanner.nextInt();  //Stores the second variable as an int
        
        System.out.print("Enter the operator: ");   //Prompts the user to input an operator
        String operator=myScanner.next();   //Stores the operator as a string
        
        switch(operator){
            case "+":   //The first case is the "+" operator. The two variables that were input by the user will be added together.
                System.out.println(a+b);    //Displays result
                break;
            case "-":   //The second case is the "-" operator. The two variables that were input by the user will be subtracted from one another.
                System.out.println(a-b);    //Displays result
                break;
            case "/":   //The third case is the "/" operator. The two variables that were input by the user will be divided by one another.
                System.out.println(a/b);    //Displays result
                break;
            case "*":   //The fourth case is the "*" operator. The two variables that were input by the user will be multiplied together.
                System.out.println(a*b);    //Displays result
                break;
            default:    //If the user does not input +,-,/,* for the operator the program will tell the user they have entered an illegal operator.
                System.out.println("Illegal operator.");    //Displays result
                break;
            
            
        }   //End of switch
        
    }   //End of main method
}   //End of class