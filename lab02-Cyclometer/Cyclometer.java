//Abby Sprinkel
//Lab 02 Cyclometer

/* This lab is designed to:
a. print the number of minutes for each trip
b. print the number of counts for each tirp
c. print the distance of each trip in miles
d. print the distance for the two trips combined
*/

public class Cyclometer {
    // main method required for every Java program
    
    public static void main(String[] args) {

        //defining input data
    
        double secsTrip1 = 480; //seconds per trip 1
        double secsTrip2 = 3220; //seconds per trip 2
        int countsTrip1 = 1561; //number of counts for trip 1
        int countsTrip2 = 9037; //number of counts for trip 2
        
        //create constant variables and store values
        
        double wheelDiameter=27.0; //value of bike wheel diameter
        double PI=3.14159; //value of PI
        int feetPerMile=5280; //value of feet per mile for conversion
        int inchesPerFoot=12; //value of inches per feet for conversion
        int secondsPerMinute = 60; //value of seconds per minute for conversion
        double distanceTrip1, distanceTrip2, totalDistance; //introducing variables
        
        //print the stored values
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");

        //Compute values for the distances
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)

        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //print the distances/output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    } //end of main method
} //end of class