// Abby Sprinkel
//hw 04 part 2


import java.util.Scanner; //import the scanner

public class Month {
    
    public static void main (String [] args) {
        
        Scanner myScanner = new Scanner (System.in); //declare scanner variable
        
        System.out.print("Enter an int giving the number of the month (1-12): ");
        
        if (myScanner.hasNextInt()){ //check if the user input is an int
            
            int i = myScanner.nextInt(); //assign variable i
            
            if ((i>0) && (i<=12)){ //check if i between 1 and 12
                int month = 0; //declare variable month
            
                if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 12)) {
                    month = 31;  //months January, March, May, July, August and December
                } 
                else if ((i == 4) || (i == 6) || (i == 9) || (i == 11)){
                    month = 30; //months April, June, September, November
                }
                else {
                    month = 28; //February
                }
        
                switch (month) {
                
                    case 30:
                        System.out.println("The month has 30 days ");
                        break;
                    case 31:
                        System.out.println("The month has 31 days ");
                        break;
                    case 28: //Now we need to account for leap year
                        System.out.print("Enter an int giving the year ");
                        int year = myScanner.nextInt();
                        if (((year%4)==0) && ((year%400)==0) && ((year%100)==0)) { //if no remainder
                            System.out.println("The month has 29 days"); // = leap year
                            return;
                        }
                        else {
                            System.out.println("The month has 28 days");
                        }
                
                }
        
            }//end check if between 1 and 12
            else {
                System.out.println("You did not enter an int between 1 and 12.");
                return;
            }
    
        } //end check if positive
        else {
            System.out.println("You did not enter an int");
            return;
        }
    } //end main method
} //end class