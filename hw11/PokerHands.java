//Abby Sprinkel
//12/04/2014
//HW 11

//The purpose of this assignment is to gives you practice 
//in manipulating arrays and multidimensional arrays, in writing
//methods that have array parameters, and in searching and sorting arrays

import java.util.Scanner;

public class PokerHands {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int deck[] = makeDeck();

        String hand[][] = makeHand();

        int newHand[] = new int[5];

        for (int i = 0; i < hand.length; i++) {
            switch (hand[i][0]) {
                case "c":
                    newHand[i] = 0 + Integer.parseInt(hand[i][1]);
                    break;
                case "d":
                    newHand[i] = 13 + Integer.parseInt(hand[i][1]);
                    break;
                case "h":
                    newHand[i] = 26 + Integer.parseInt(hand[i][1]);
                    break;
                case "s":
                    newHand[i] = 39 + Integer.parseInt(hand[i][1]);
            }
            System.out.println(newHand[i]);
        }
        
        showOneHand(newHand);

    }

    public static void check(String input2, Scanner scan) {
        boolean checkInput = false;
        if ((input2.equals("c")) || (input2.equals("d")) || (input2.equals("h")) || (input2.equals("s"))) {
            checkInput = true;
        }

        if (checkInput == false) {
            System.out.println("You did not enter a valid response");
            System.out.println("Enter the suit 'c', 'd', 'h', or 's'- ");
            String input3 = scan.next();
            input2 = input3;
        }
    }

    public static int checkRank(String input2, Scanner scan) {
        boolean checkInput = false;
        int input4 = 0;
        switch (input2) {
            case "a":
                input4 = 0;
                checkInput=true;
                break;
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                input4 = Integer.parseInt(input2) - 1;
            case "j":
                input4 = 10;
            case "q":
                input4 = 11;
            case "k":
                input4 = 12;
                checkInput = true;
            default:
                break;
        } //end switch

        if (checkInput == false) {
            System.out.println("You did not enter a valid response");
            System.out.println("Enter one of a, 1, 2, etc- ");
            String input3 = scan.next();
            input2 = input3;
        }
        
        return input4;
    }


    public static void showOneHand(int hand[]) {
        String suit[] = {
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ", "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }

    public static String[] promptCard(Scanner scan) {

        System.out.print("Enter the suit 'c', 'd', 'h', or 's'- ");
        String input = scan.next();
        check(input, scan);
        System.out.print("Enter one of a, 1, 2, etc- ");
        String input2 = scan.next();
        String rank = checkRank(input2, scan) + "";
        String card[] = {
            input, rank
        };
        return card;

    }

    public static String[][] makeHand() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'Y' or 'y' to enter a(nother) hand: ");
        String input = scan.next();
        String card1[] = new String[2];
        String card2[] = new String[2];
        String card3[] = new String[2];
        String card4[] = new String[2];
        String card5[] = new String[2];
        if (input.equals("y") || input.equals("Y")) {
            card1 = promptCard(scan);
            card2 = promptCard(scan);
            card3 = promptCard(scan);
            card4 = promptCard(scan);
            card5 = promptCard(scan);
        }
        String hand[][] = {card1, card2, card3, card4, card5};
        return hand;
    }

    public static int[] makeDeck() {
        int deck[] = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        return deck;
    }



}