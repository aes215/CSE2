//Abby Sprinkel
//11/18/14
//The purpose of this program is to find duplicates in an array of length 10
//and declare the difference between exactly one duplicate and multiple

import java.util.Scanner; //import the scanner

public class FindDuplicates { //class
    public static void main(String[] arg) { //main method
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        String answer = "";
        do { //do while loop
            System.out.print("Enter 10 ints- "); //prompt the user for input
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt(); //accept 10 ints
            }
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) { //hasdup method print
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) { //exactlyOneDup method print
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) { //listarray method prints array
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }

    public static boolean hasDups(int num[]) { //hasdups method
        boolean duplicates = false; //initialize as false
        for (int i = 0; i < num.length; i++) {
            for (int k = i + 1; k < num.length; k++) {
                if (k != i && num[k] == num[i]) { //if value matches
                    duplicates = true; //true duplicate
                }
            }

        }
        return duplicates; //return true or false for duplicate
    }//end hasdups method

    public static boolean exactlyOneDup(int num[]) { //exactlyOneDup method
        boolean oneDup = false; //initialize as false
        int add = 0; //define a counter variable
        for (int i = 0; i < num.length; i++) {
            for (int k = i + 1; k < num.length; k++) {

                if (k != i && num[k] == num[i]) {
                    add += 1; //add one for every duplicate
                }

            }
            if (add == 1) { //if there is only one duplicate
                oneDup = true;
            } 
            else { //otherwise
                oneDup = false;
            }
        }
        return oneDup; //return oneDup 

    } //end exactlyonedup method
} //end class
