//Abby Sprinkel
//hw 10


import java.util.Random; //import random
import java.util.Scanner; //import scanner

public class PokerOdds {
    public static void main(String[] arg) {
            showHands();
            //simulateOdds();
        } //end main method


    public static String showHands() {
        do {


            /*String [] cards = new String [13]; //declare array length
        cards[0]="A"; //initialize array values
        cards[1]="2";
        cards[2]="3";
        cards[3]="4";
        cards[4]="5";
        cards[5]="6";
        cards[6]="7";
        cards[7]="8";
        cards[8]="9";
        cards[9]="10";
        cards[10]="J";
        cards[11]="Q";
        cards[12]="K";
       
        String [] suit = new String [4]; //declare array length
        suit[1]="Diamonds";
        suit[2]="Spades";
        suit[3]="Clubs";
        suit[3]="Hearts";
        
        String [] deck = new String [52];
 */         Scanner scan = new Scanner(System.in);
            answer = scan.next();
            for (int n = 0; n <= 10000; n++) {


                String[] suit = {
                    "Hearts", "Diamonds", "Clubs", "Spades"
                };
                String[] rank = {
                    "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
                };

                int RANKS = rank.length;
                int SUITS = suit.length;
                int CARDS = SUITS * RANKS;


                // initialize deck
                String[] deck = new String[CARDS];
                for (int k = 0; k < RANKS; k++) {
                    for (int j = 0; j < SUITS; j++) {
                        deck[SUITS * k + j] = rank[k] + " of " + suit[j];
                    }
                }

                for (int i = 0; i < CARDS; i++) {
                    int r = i + (int)(Math.random() * (CARDS - i));
                    String t = deck[r];
                    deck[r] = deck[i];
                    deck[i] = t;
                }

                // print 
                for (int l = 0; l < 5; l++) {
                    System.out.println(deck[l]);

                }

            }
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            
        } while (answer.equals("Y") || answer.equals("y"));
    }


 //end show hands

public static String simulateOdds() {
        String[] Deck = new String[deck];
        int duplicates=0; //initialize as false
        for (int i = 0; i < Deck.length; i++) {
            for (int k = i + 1; k < Deck.length; k++) {
                if (k != i && Deck[k] == Deck[i]) { //if value matches
                    duplicates++; //true duplicate
                }
            }

        } System.out.println("Total not exactly one pair: "+duplicates);
        return null;
    } //end simulateOdds

}