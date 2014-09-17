//Abby Sprinkel
//hw 03

import java.util.Scanner; //import the scanner

public class Root { //declare class
    
    public static void main (String [] args){ //declare main method
        
        System.out.print("Enter a double, and I print it's cube root: "); //prompt user for input
        Scanner myScanner = new Scanner(System.in);
        double x = myScanner.nextDouble();
        
        double guess = x/3; //first guess
        double guess1 = (guess*guess*guess+x)/(3*guess*guess); //improve guess
        double guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1);
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
  
        
        System.out.println("The cube root is " +guess5);
        System.out.println(guess5+"*" +guess5+ "*" +guess5+ "=" +(guess5*guess5*guess5));
        
        
    } //End main method
    
} //End class

