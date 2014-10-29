import java.util.Scanner;
public class HW8 {
    public static void main(String[] arg) {
        char input;
        
        Scanner myScanner = new Scanner(System.in); //declare scanner variable
        
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //print statement
        
        input = getInput(myScanner, "Cc"); //call getInput method
        
        System.out.println("You entered '" + input + "'"); //print statement of what was entered
        
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //prompt for user response //scanner string int
        
        input = getInput(myScanner, "yYnN", 5); //give up after 5 attempts
        
        if (input != ' ') { //if input is not a char
            System.out.println("You entered '" + input + "'");
        }
        
        input = getInput(myScanner, "Choose a digit.", "0123456789"); //call getInput method //scanner string string
        
        System.out.println("You entered '" + input + "'"); //print what was entered
    } //main method end


    public static char getInput (Scanner myScanner, String c){ //method getInput
        
        if (myScanner.hasNext()){
            String user = myScanner.next();
            
            for (int i=0; i < c.length(); i++){
                if (user.equals (c.charAt(i))){
                    char single = c.charAt(i);
                    return single;
                }//end if
                else {
                    System.out.println ("You did not enter a character from the list 'Cc' try again- ");
                } //end else
            } //end for loop
        }//end if statement
       return ' ';
    } //end getInput char method
    
    public static char getInput (Scanner myScanner, String YN, int counter){
        counter = 0;
        
        while (counter<6){
            
            for (int j=0; j < YN.length(); j++){
                String user2 = myScanner.next();
                if (user2.equals (YN.charAt(j))){
                    char let = YN.charAt(j);
                    return let;
                } //end if
                else {
                    if (counter==5) {
                        System.out.println("You failed after 5 tries.");
                    } //if counter too high
                    else {
                        System.out.println("You did not enter a character from the list 'yYnN'; try again-");
                    } //end nested else
                } //end bigger else statement
            }//end for loop
            counter++;
        }//end while loop
        return ' ';
    } //end char getInput Scanner String and Int method
    //System.out.println ("You should enter exactly one character- ");  
    
    public static char getInput (Scanner myScanner, String show, String num){
        if (myScanner.hasNext()){
            
            
            for (int k=0; k < num.length(); k++){
                String user2 = myScanner.next();
                if (user2.equals (num.charAt(k))){
                    char singles = num.charAt(k);
                    return singles;
                }//end if
                else {
                    System.out.println ("You did not enter an acceptable character");
                    System.out.println ("Choose a digit");
                } //end else
                System.out.println(show);
            } //end for loop
        }//end if statement
        return ' ';   
    }//end scanner string string method
} //end public class

