//Scott Galdi
//hw06 - Pyramid
//10/5/15



//Imports a scanner into the java program which will later be used to ask for input from the user
import java.util.Scanner;

//Public class required for every java program
public class Pyramid{
    
    //Main method required for every java program
    public static void main(String[] args){
        
        //create a new scanner
        Scanner pyramid=new Scanner(System.in);
        
        System.out.print("What size pyramid? ");    //prompts user to input a pyramid size
        int p = pyramid.nextInt();  //stores the user input as the integer p
        int stars = 1;  //initializes the stars integer
        int counter = 1;    //intitializes the counter
        while (p >= counter){   //The following code will run as long as the number input by the user is >= the counter
        
            for (int spaces = counter; spaces < p; spaces++){   //Prints a space everytime the counter is incremented so long as the spaces are less than the number input by the user
                System.out.print(" ");
            }
            for (int pSize = stars; pSize > 0; pSize--){    //Prints a specific number of stars in each layer of the pyramid
                System.out.print("*");
            }
            counter++;  //increments counter by 1
            stars = stars + 2;  //increments the stars by 2 (makes sure there is always an odd number of stars in each layer of the pyramid)
            System.out.println();   //Puts the stars on separate lines
        }   //end of while loop
    }   //end of main method
}//end of class