//Abby Sprinkel
//lab 03-BigMac

import java.util.Scanner;

public class BigMac { //define class
    
    public static void main (String [] args){ //define main method
        
        Scanner myScanner; //declare instance of scanner object
        myScanner = new Scanner(System.in);
        
        //Print statement to request input from user
        System.out.print("Enter the number of Big Macs (as an integer >0): ");
        int nBigMacs = myScanner.nextInt(); //declare variable nBigMacs
        
        System.out.print("Enter the cost per BigMac as " + "a double in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble(); //assign next double to variable bigMac$
        
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble(); //assign next double to variable taxRate
        
        taxRate /= 100; //user enters a % 
        
        //Generating output
        
        double cost$; //declare variable cost$
        int dollars, dimes, pennies; //used for whole values and storing digits
        
        cost$ = nBigMacs*bigMac$*(1+taxRate); //calculate cost
        dollars = (int) cost$; //casts to int 
        dimes=(int)(cost$*10)%10; //use module operator to return the remainder
        pennies=(int)(cost$*100)%10;
       
        //final print statement
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per bigMac, with a" + " sales tax of " +(int)(taxRate*100)+ "%, is $" +dollars+'.'+dimes+pennies);

        
        } // end main method
    
} //end class