//Scott Galdi
//hw08 - areas

//Imports a scanner into the java program which will later be used to ask for input from the user
import java.util.Scanner;

//Public class required for every java program
public class areas{
    
    //Method for circle area
    public static double area(double r){
        
        double A = (3.14*(r*r));    //calculates the area of a circle
        return A;   //returns the area
        
    }   //end of method
    
    //method for rectangle area
    public static double area(double h, double w){
        
        double A = h * w;   //calculates the area of rectangle
        return A;   //returns the area
        
    }   //end of method
    
    //method for trapezoid area
    public static double area(double h, double b1, double b2){
        
        double A = ((b1 + b2) * h) / 2; //calculates the area of a trapezoid
        return A;   //returns the area
        
    }   //end of method
    
    //Main method required for every java program
    public static void main(String[] args){
        
        //creates a new scanner
        Scanner shape = new Scanner(System.in);
        
        while(true){    //program will continue to run until 100 is entered
            System.out.println("Choose your shape. Enter 1 for Circle, 2 for Rectangle, and 3 for Trapezoid."); //prompts the user to choose what shape they want to find the area of
            int shapeChosen = shape.nextInt();  //stores the user input
            
            //checks to see if the user has entered a valid input and not entered 100
            while((shapeChosen > 3 || shapeChosen < 1) && shapeChosen != 100){
                System.out.println("Enter a valid input."); //if input is invalid the program will tell the user to input a valid number
                shapeChosen = shape.nextInt();  //stores the user input
            }   //end of while loop
            
            if (shapeChosen == 100){    //if 100 is entered the program will quit
                break;
            }   //end of if statement
            
            //checks if input is 1, 2, or 3
            if (shapeChosen == 1 || shapeChosen == 2 || shapeChosen == 3){
                
                if (shapeChosen == 1){  //if input is 1 the program will calculate the area of a circle
                    System.out.println("Enter the radius of the circle.");  //prompts the user to enter the radius
                    double r = shape.nextDouble();  //stores the user input as the radius
                    System.out.println("Cirlce area = " + area(r)); //displays the circle area
                }   //end of if statement
                
                if (shapeChosen == 2){  //if input is 1 the program will calculate the area of a rectangle
                    System.out.println("Enter the height and width of the rectangle."); //prompts the user to enter the height and width
                    double h = shape.nextDouble();  //stores the user input as the height
                    double w = shape.nextDouble();  //stores the user input as the width
                    System.out.println("Rectangle area = " + area(h, w));   //displays the rectangle area
                }   //end of if statement
                
                if (shapeChosen == 3){  //if input is 1 the program will calculate the area of a trapezoid
                    System.out.println("Enter the height, base 1, and base 2 of the trapezoid.");   //prompts the user to enter the height, base 1, and base 2
                    double h = shape.nextDouble();  //stores the user input as the height
                    double b1 = shape.nextDouble(); //stores the user input as base 1
                    double b2 = shape.nextDouble(); //stores the user input as base 2
                    System.out.println("Trapezoid area = " + area(h, b1, b2));  //displays the trapezoid area
                }   //end of if statement
            }   //end of if statement
            
        }   //end of while loop
    }   //end of main method
}   //end of class