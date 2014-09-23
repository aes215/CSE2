//Abby Sprinkel
//hw 04

import java.util.Scanner;

public class IncomeTax { // public class
    
    public static void main (String [] args) { //main method
    
        Scanner myScanner = new Scanner(System.in);
    
        System.out.print("Enter an int giving the number of thousands: ");
    
        if (myScanner.hasNextInt()){
            int i = myScanner.nextInt(); //take user input next int
            int k = 0; //define k
                
            if (i > 0) {
                int j = i*1000; //define j
            
                if (i<20) { //input less than 20
                    k = 1;
                }
                else if ((i>=20) && (i<40)) { //input between 20 and 40
                    k = 2;
                }
                else if ((i>=40) && (i<78)) { //input between 40 and 78
                    k = 3;
                }
                else {//input greater than 78
                    k = 4;
                }
                
                switch (k) { //switch statement using assigned values of k from above
                    case 1:
                        double tax5 = (j*0.05);
                        tax5 = Math.round (tax5*100);
                        tax5 = tax5/100.0;
                        System.out.println("The tax rate on " +j+ " is 5.0%, and the tax is $" +tax5);
                        return;
                    case 2:
                        double tax7 = (j*0.07);
                        tax7 = Math.round (tax7*100);
                        tax7 = tax7/100.0;
                        System.out.println("The tax rate on " +j+ " is 7.0%, and the tax is $" +tax7);
                        return;
                    case 3:
                        double tax12 = (j*0.12);
                        tax12 = Math.round (tax12*100);
                        tax12 = tax12/100.0;
                        System.out.println("The tax rate on " +j+ " is 12.0%, and the tax is $" +tax12);
                        return;
                    case 4: 
                        double tax14 = (j*0.14);
                        tax14 = Math.round (tax14*100);
                        tax14 = tax14/100.0;
                        System.out.println("The tax rate on " +j+ " is 14.0%, and the tax is $" +tax14);
                        return;
                
                    } //end switch case
                    
            
                }//end if i >0
            
            else {
                System.out.println("You did not enter a positive int");
                return;
            } //end else not a positive int
        
        } //end if an int
    
        else {
            System.out.println("You did not enter an int");
            return;
        } //end else not an int
    
    
     
        
    } //end method
} //end class
