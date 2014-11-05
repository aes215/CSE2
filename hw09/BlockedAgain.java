//Abby Sprinkel
//11/4/2014

//The purpose of this code is to call on methods to return the 
//proper stack of blocks (as seen below for imput of 4):
/* 1
   -
  222
  222
  ---
 33333
 33333
 33333
 -----
4444444
4444444
4444444
4444444
-------
*/

import java.util.Scanner;

public class BlockedAgain {
    public static void main(String[] s) {
        
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }

    public static int getInt() {
        System.out.print("Enter an int [1,9]: ");
        boolean checkInt = false;
        int user;

       if (checkInt == false) {
            Scanner myScanner = new Scanner(System.in);
            user = myScanner.nextInt();
            checkInt = checkInt(user);
        }

       boolean inRange = false;

       /* if (inRange == false) {
          int value = checkRange(user);

            if (value == 0) {
                System.out.print("Not in range. Try again");
                return 0;
            }
            else {
                return value;
            }
        }
*/        return user;
    }


    public static boolean checkInt(int j) {
        Scanner Scanner = new Scanner(System.in);
        j = Scanner.nextInt();
        if (Scanner.hasNextInt()) {
            
            return true;
        }
        else {
            return false;
        }
    }

    public static int checkRange(int i) {
        if (i >= 1 && i <= 9) {
            return i;
        }
        else {
            return 0;
        }
    }

    public static void allBlocks(int c) {
            int across = 1; //assign across to 1
            for (int a = 1; a <= c; a++) { //for loop to print numbers up until user input
                for (int d = 1; d <= a; d++) { //for loop to print number of lines for each number
                    for (int b = c - a; b > 0; b--) { //for loop to print spaces to center numbers
                        System.out.print(" ");
                    }
                    for (int e = across; e > 0; e--) { //for loop to print numbers across
                        System.out.print(a);
                    }
                    System.out.println(" ");
                }
                for (int b = c - a; b > 0; b--) {
                    System.out.print(" ");
                }
                for (int e = across; e > 0; e--) {
                    System.out.print("-");
                }
                System.out.println(" ");
                across += 2;
            }
        } //closes allBlocks
}