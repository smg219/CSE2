//Scott Galdi
//lab03 - Check
//9/10/15
//

/////////////////////////////////////////////////////
//                                                 //
//  This program utilizes the scanner in java      //
//  by asking the user to input the original       //
//  cost of the check, the tip percentage,         //
//  and the number of people who went to dinner.   //
//  The program then tells the user how much each  //
//  in the group owes if they were to split        //
//  the total cost evenly.                         //
//                                                 //
/////////////////////////////////////////////////////

//imports a scanner into the java program which will later be used to ask for input from the user
import java.util.Scanner;

//public class required for every java program
public class Check{
    
    //main method required for every java program
    public static void main(String[] args){
        
        Scanner myScanner=new Scanner(System.in);   //calls the scanner to allow for user input
        
        System.out.print("Enter the original cost of the check in the form xx.xx: ");   //Prompts the user to input the cost of the original check
        double checkCost=myScanner.nextDouble();    //Stores the check cost that the user inputs as a variable
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); //Prompts the user to input the tip percentage
        double tipPercent=myScanner.nextDouble();   //Stores the tip percentage that the user inputs as a variable
        tipPercent /=100;    //Converts the tip percentage into a decimal value
        
        System.out.print("Enter the number of people who went out to dinner: ");    //Prompts the user to enter the number of people who attended dinner
        int numPeople=myScanner.nextInt();  //Stores the number of people that the user inputs as a variable
        
        double totalCost;   //Declares the variable for the total cost of the meal
        double costPerPerson;   //Declares the variable for the costPerPerson
        int dollars;    //Declares the variable which will display the number of dollars
        int dimes;  //Declares the variable which will display the tens place in the total cost
        int pennies;    //Declares the variable which will display the hundreds place in the total cost
        
        totalCost=checkCost*(1+tipPercent); //The total cost is the check cost * the tip percentage +1 (the +1 makes it so that the tip will be added to the original cost without tip)
        costPerPerson=totalCost/numPeople;  //The total cost is divided by the number of people at the meal to calculate the cost per person
        dollars=(int)costPerPerson; //The dollars is the number value to the left of the decimal point
        dimes=(int)(costPerPerson*10)%10;   //Calculates the tens decimal place
        pennies=(int)(costPerPerson*100)%10;    //Calculates the hundreds decimal place
        
        System.out.println("Each person in the group owes $"+dollars+'.'+dimes+pennies);    //Displays the output for how much each person owes for the meal
        
        
    }   //end of main class
}   //end of class