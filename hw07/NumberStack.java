//Abby Sprinkel
//hw 7
//10/20/2014

/*The purpose of this program is to  Write a program that forces the user to 
  enter an integer between 1 and 9, inclusive, and then prints out displays 
that depend on the value entered
*/

import java.util.Scanner;

public class NumberStack { //class

    public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);

            System.out.print("Enter a number between 1 and 9: ");

            int input = myScanner.nextInt();
            String line;

            if (input > 0 && input < 10) {

                int i, j, num;
                int dashes = 1;
                System.out.println("For Loop");
                for (i = 1; i <= input; i++) {

                    System.out.println(i);
                    for (j = 0; j < input - i - 1; j++) { //centers dashes
                        System.out.print(" ");
                    }
                    for (j = dashes; j > 0; j--) {
                        System.out.print('-');
                    }
                    System.out.println(" ");
                    dashes += 2;
                } //end for loop

                System.out.println("While Loop"); //Start of while section
                i = 1; //reset variable values
                j = 0;
                dashes = 1;
                while (i <= input) { //outer while statement
                    System.out.println(i);
                    i++;
                    while (j < input - i - 1) { //nested while
                        System.out.print(" ");
                        j++;
                    }
                    while (dashes > 0) { //nested while
                        System.out.print('-');
                        dashes--;
                    }
                    System.out.println(" ");
                    dashes += 2;
                } //end set of whiles

                System.out.println("Do-While Loop"); //Start of do while section
                i = 1; //reset variable values
                j = 0;
                dashes = 1;
                do { //outer do while
                    System.out.println(i);
                    i++;
                    
                    do { //inner do while
                        System.out.print(" ");
                        j++;
                    } while (j < input - i - 1);
                    
                    do { //inner do while
                        System.out.print('-');
                        dashes--;
                    } while (dashes > 0);
                    
                    System.out.println(" ");
                    dashes += 2;
                } while (i <= input);
            } //end if to check range

        } //end main method

} //end class