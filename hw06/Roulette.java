//Abby Sprinkel
//HW 06
//10/14/2014

//The purpose of this program is to simulate a game of roulette

//Lab 6



import java.util.Random;//generate random numbers
import java.util.Scanner;//scan input numbers


public class Roulette {
  	public static void main(String[] args) {
    
    Random rand=new Random(System.currentTimeMillis());
    Scanner input = new Scanner(System.in);
    
	System.out.println("Input a number between 1 and 38.");//prompt user to enter #
    
	int num = input.nextInt();//the user's input number to bet
    
    int win, p, round, sum, i, j, x, c, y, s;//initialize variables
    String z;
    
	win = 0;//win bet
    sum=0;//total gain
    i=0;
    j=0; 
    x=0;
    c=0;
    y=0;
    s=0;
    
    
	
	if(num <1 || num >38) { //test range
      	System.out.println("You did not enter between number 1 and 38.");
      	return;
    }	
    else{
    	for (round = 0; round < 100; round++) {
            p=0;//plays
            while (p<100) {
                win = (int)(38*rand.nextDouble()) +1;
                if (num == win) {
                sum = sum+36;
                i++;
                }
                else {
                    sum = sum-1;
	            }
                p++;
                s=sum+s;
                //sum=0;
            } //end of while loop -- 100 plays per visit
            
            j=36*i; //j is $36 times i number of wins
            
      	    if (s>=0) {
                if (s>=100) {
                    x++;
                }
                z = "win";
                //c++;
            }
        
	        else {
                z = "l";
                y++;         
            }
        
            if (round%11 == 0) {
                System.out.println();
            }
        

	        else {
	            System.out.print(s+" ");
	        }
        
    System.out.println("In total, the player won $0 for "+y+" times, and more than $108 for "+x+" times.");
	sum=0;
    }//end of for loop 

  
    System.out.println("In 100,000 plays, player won "+i+" times, total win revenue is $"+j);
    
    if (s<0) {
        s=-s;
        System.out.print("and player's net loss is $"+s+".");
        return;
    }
    
	if  (s>=0) {
        System.out.print("and player's net gain is $"+s+".");
        return;
    
	}

  }

}
}
