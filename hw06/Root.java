//Abby Sprinkel
//hw 6
//10/13/2014

//The purpose of this program is to compute the square root of a user input value

import java.util.Scanner;

public class Root {
    
    public static void main (String [] args) {
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.print("Enter an integer and I calculate its square root: ");
    double x = myScanner.nextDouble();
    
   
        double high, low;
        low = 0;
        high = (x + 1);
        double difference = high - low;
        
        while (difference >= 0.0000001){
            double middle = (high+low)/2;
            
            if ((middle*middle) > x) {
                System.out.println("square root" +middle);
                high = middle;
            }//end if statement
            
            else {
                System.out.println("square root" +middle);
                low = middle;
            }//end else statement
        
        return;    
        } //end while
    }//end main method
}//end class