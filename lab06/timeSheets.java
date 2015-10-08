//Scott Galdi
//lab06 - Time Sheets
//10/1/15


//Imports a scanner into the java program which will later be used to ask for input from the user
import java.util.Scanner;

//Public class required for every java program
public class timeSheets{
    
    //Main method required for every java program
    public static void main(String[] args){
        
        //creates a new scanner
        Scanner numSheets = new Scanner(System.in);
        
        System.out.print("How many time sheets do you want to read: "); //prompts the user to input how many time sheets they are inputting
        int timeSheets = numSheets.nextInt();   //stores the number of time sheets as the integer timeSheets
        
        Scanner pay = new Scanner(System.in);   //creates a new scanner
        
        Scanner hours = new Scanner(System.in); //creates a new scanner
        
        int employee = 1;   //initializes employee variable to 1
        double totalPayroll = 0;    //initializes totalPayroll to 0
        
        //begins for loop
        for (int sheets = 0; sheets < timeSheets; sheets++){
            System.out.print("How much does employee " + employee + " get paid per hour: ");    //prompts the user to input how much the employee is paid per hour
            double hourlyPay = pay.nextDouble();    //stores the users input as hourlyPay
        
            System.out.print("How many hours did employee " + employee + " work Monday: "); //prompts the user to input how many hours they worked monday
            int monday = hours.nextInt();   //stores the users input as hours worked on monday
            
            System.out.print("How many hours did employee " + employee + " work Tuesday: ");    //prompts the user to input how many hours they worked tuesday
            int tuesday = hours.nextInt();  //stores the users input as hours worked on tuesday
            
            System.out.print("How many hours did employee " + employee + " work Wednesday: ");  //prompts the user to input how many hours they worked wednesday
            int wednesday = hours.nextInt();    //stores the users input as hours worked on wednesday
            
            System.out.print("How many hours did employee " + employee + " work Thursday: ");   //prompts the user to input how many hours they worked thursday
            int thursday = hours.nextInt(); //stores the users input as hours worked on thursday
            
            System.out.print("How many hours did employee " + employee + " work Friday: "); //prompts the user to input how many hours they worked friday
            int friday = hours.nextInt();   //stores the users input as hours worked on friday
            
            int weekHours = monday + tuesday + wednesday + thursday + friday;   //total hours for the work week
            double employeePay = weekHours * hourlyPay; //calculates the employee pay
            totalPayroll += employeePay;    //keeps a total of the employee payroll
            
            System.out.println("Employee " + employee + " worked a total of " + weekHours + " hours this week.");   //prints how much the individual employee worked for the week
            System.out.println("Employee " + employee + " should be paid $" + employeePay + " this week."); //prints how much the individual empoyee should be paid for the week
            
            employee++; //increments the employee variable by 1
        }   //end of for loop
        System.out.println("The total payroll of all the employees is: $" + totalPayroll);  //prints the total payroll of all the employees
    }   //end of main method
}   //end of class