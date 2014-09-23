//Abby Sprinkel
//hw 04 part 4


import java.util.Scanner;

public class TimePadding { //class
    
    public static void main (String [] args) { //main method
        
        Scanner myScanner = new Scanner (System.in); //define scanner
        
        System.out.print("Enter the time in seconds: "); //prompt user input
        
        if (myScanner.hasNextInt()){ //check if int
            
            int input = myScanner.nextInt(); //declare scanner   
            int hours, minutes, seconds; //declare variables
            
            int k = 0;
            int m = 0;
            int s = 0;
            
            if (input>0){
                hours = (input/60)/60; //computation for hours
                minutes = (input/60)%60; //computation for minutes
                //System.out.println(+minutes);
                seconds = (input%60); //computation for seconds
                System.out.print("The time is ");
            
                if (hours == 0){ //possible outcomes for hours
                    k=0;
                }
                else if ((hours >= 1) && (hours < 10)) {
                    k=1;
                }
                else {
                    k=2;
                }
            
                if (minutes == 0){ //possible outcomes for minutes
                    m=0;
                }
                else if ((minutes >= 1) && (minutes < 10)) {
                    m=1;
                }
                else if ((minutes>=10) && (minutes<60)){
                    m=2;
                }
                else {
                    m=3;
                }
            
                if (seconds == 0){ //possible outcomes for seconds
                    s=0;
                }
                else if ((seconds >= 1) && (seconds < 10)) {
                    s=1;
                }
                else {
                    s= 2;
                }
            
                switch (k) { //switch hours
                    case 0:
                        System.out.print("00");
                        break;
                    case 1:
                        System.out.print("0"+hours);
                        break;
                    case 2:
                        System.out.print(+hours);
                        break;
                }
            
                switch (m) { //switch minutes
                    case 0:
                        System.out.print(":00");
                        break;
                    case 1:
                        System.out.print(":0"+minutes);
                        break;
                    case 3:
                        minutes=minutes-60;
                        System.out.print(":0" +minutes);
                        break;
                    case 2:    
                        System.out.print(":"+minutes);
                        break;
                }
                
                switch (s) { //switch seconds
                    case 0:
                        System.out.print(":00");
                        break;
                    case 1:
                        System.out.print(":0"+seconds);
                        break;
                    case 2:
                        System.out.print(":"+seconds);
                        break;
                }
            
                System.out.println(" "); //just a space/enter
        }
        else {
            System.out.println("You did not enter a positive int");
        } //end else for positive
        } //end check for int
        else {
            System.out.println("You did not enter an int");
        }//end not an int
    }//end main method
}//end class
  