//Abby Sprinkel
//Homework 3: Four Digits

import java.util.Scanner;


public class FourDigits{
    
    public static void main (String [] args){
        
        Scanner myScanner = new Scanner(System.in); //define scanner variable
        
        System.out.println ("Enter a double and I display the four digits to the right of the decimal point:");
        double i = myScanner.nextDouble();
        int j,k,l,m;
        j=(int)(i*10)%10; //use module operator to return the remainder tens place
        k=(int)(i*100)%10; //hundredths place
        l=(int)(i*1000)%10; //thousandths place
        m=(int)(i*10000)%10; //tenthousandths place
        
        System.out.println ("The four digits are: " +(j)+(k)+(l)+(m));
       
        
        
    
        
    } //end main method
} //end class