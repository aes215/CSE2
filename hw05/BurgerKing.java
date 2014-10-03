//Abby Sprinkel
//hw 05
//9/30/14

//The purpose of this program is to take user input for an order
//at a fast food restaurant for burger toppings, soda type, and fries
//size.

import java.util.Scanner;

public class BurgerKing {
    
    public static void main (String [] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        //prompt first order choice
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("    Burger (B or b) ");
        System.out.println("    Soda (S or s) ");
        System.out.println("    Fries (F or f) ");
        String orderChoice = myScanner.next();
        
        switch (orderChoice) {
            case "B": case "b": //if they choose a burger
                System.out.println("Enter A for 'all the fixins' ");
                System.out.println("C or c for cheese ");
                System.out.println("N or n for none ");
                String toppings = myScanner.next();
                switch (toppings) {
                    case "A":
                        System.out.println("You ordered a burger with all the fixins.");
                        break;
                    case "C": case "c":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "N": case "n":
                        System.out.println("You ordered a burger");
                        break;
                    default:
                        System.out.println("You did not enter a correct option");
                }//end switch toppings
                break;
                
            case "S": case "s": //if they choose a soda
                System.out.println("Do you want Pepsi (P or p), Coke (C or c), Sprite (S or s), or Mountain Dew (M or m)?  ");
                String soda = myScanner.next();
                switch (soda) {
                    case "P": case "p":
                        System.out.println("You entered a Pepsi");
                        break;
                    case "C": case "c":
                        System.out.println("You ordered a Coke");
                        break;
                    case "S": case "s":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "M" : case "m":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    default:
                       System.out.println("You did not enter a correct option"); 
                }//end switch soda type
                break;
                
            case "F": case "f": //if they choose fries
                System.out.println("Do you want a large or small order of fries? (L,l,S,s)");
                String fries = myScanner.next();
                switch (fries){
                    case "L": case "l":
                        System.out.println("You ordered large fries");
                        break;
                    case "S": case "s":
                        System.out.println("You ordered small fries");
                        break;
                    default:
                        System.out.println("You did not enter a correct option");
                        break;
                }//end switch fries
            
            
        }//end switch order choice
    
        
    }//end method

    
}//end class