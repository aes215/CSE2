//Abby Sprinkel
//Hw 03- Bicycle

import java.util.Scanner; //import the scanner for user input

public class Bicycle{ //declare public class
    
    public static void main (String [] args){ //declare main method
        
   
        Scanner myScanner = new Scanner(System.in); //define the scanner
        
        System.out.print("Enter the number of seconds:"); //call for user input
        double secsTrip = myScanner.nextDouble();
      
        System.out.print("Enter the number of counts:");
        int countsTrip = myScanner.nextInt();
    
        
        //create constant variables and store values
        
        double wheelDiameter=27.0; //value of bike wheel diameter
        double PI=3.14159; //value of PI
        int feetPerMile=5280; //value of feet per mile for conversion
        int inchesPerFoot=12; //value of inches per feet for conversion
        int secondsPerMinute = 60; //value of seconds per minute for conversion
        double distanceTrip; //introducing variables
        
       
        //Compute values for the distances
        
        distanceTrip=countsTrip*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)

        distanceTrip/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip = Math.round(distanceTrip*100); //round to 2 decimal places
        distanceTrip = distanceTrip/100.0;
        
        //print the distance/output data.
        System.out.println("The distance was "+distanceTrip+" miles and took " +(secsTrip/secondsPerMinute)+" minutes.");
        double mph = distanceTrip/((secsTrip/secondsPerMinute)/60); //calculate avg mph
        mph = Math.round(mph*100); //round to 2 decimal places
        
        mph = mph/100.0;
        System.out.println("The average MPH was " +mph);
        
        
    }
}
