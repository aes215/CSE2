//Abby Sprinkel
//hw 4 part 3

import java.util.Scanner;

public class CourseNumber {
    
    public static void main (String [] args){
        
        System.out.print("Enter a six digit number giving the course semester- ");
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        
        int k = num%100;
        //System.out.println(+k);
        int j = (num/100);
        //System.out.print(+j);
        
        if ((num >= 186510) && (num <= 201440)) {
            switch (k) {
                case 10:
                    System.out.println("The course was offered in the Spring semester of "+j);
                    break;    
                case 20:
                    System.out.println("The course was offered in the Summer 1 semester of "+j);
                    break; 
                case 30:
                    System.out.println("The course was offered in the Summer 2 semester of "+j);
                    break; 
                case 40:
                    System.out.println("The course was offered in the Fall semester of "+j);
                    break; 
                default:
                    System.out.println(+k+" is not a legitimate semester");
                    break;
            
            } //end switch
        }//end if
        
        else {
            System.out.println("The number was outside the range [186510, 201440]");
        } //end check if inside the correct range of years
        
    } //end main method
    
} //end public class