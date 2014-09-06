//Abby Sprinkel
//Hw 02
//Arithmetic

/*The purpose of this homework is to compute the cost
of items purchased while including the PA sales tax
*/

public class Arithmetic { //class "Arithmetic"
    
    public static void main (String [] args){ //define main method
        
        //define input variables
        int nSocks = 3; //number of socks
        double sockCost$ = 2.58; //sock cost with $ in the variable name
        int nGlasses = 6; //number of glasses
        double glassCost$ = 2.29; //glasses cost with $ in the variable name
        int nEnvelopes = 1; //number of boxes of envelopes
        double envelopeCost$ = 3.25; //price per box of envelopes
        double taxPercent = 0.06; //sales tax per cost
        
        //calculations
        double totalSockCost$ = (nSocks)*(sockCost$);
        System.out.println("The total cost of socks is $" +totalSockCost$);
        double sockTax$ = (taxPercent)*(totalSockCost$);
        sockTax$ = Math.round(sockTax$*100);
        sockTax$ = sockTax$/100.0;
        System.out.println("Tax for socks $" +(sockTax$));
        //Prints the total cost of socks and sock tax
        
        double totalGlassCost$ = (nGlasses)*(glassCost$);
        System.out.println("The total cost of glasses is $" +totalGlassCost$);
        double glassTax$ = (taxPercent)*(totalGlassCost$);
        glassTax$ = Math.round(glassTax$*100);
        glassTax$ = glassTax$/100.0;
        System.out.println("Tax for glasses $" +glassTax$);
        //Prints the total cost of glasses and glass tax
        
        double totalEnvelopeCost$ = (nEnvelopes)*(envelopeCost$);
        System.out.println("The total cost of envelopes is $" +totalEnvelopeCost$);
        double envelopeTax$ = (taxPercent)*(totalEnvelopeCost$);
        envelopeTax$ = Math.round(envelopeTax$*100);
        envelopeTax$ = envelopeTax$/100.0;
        System.out.println("Tax for envelopes $" +envelopeTax$);
        //Prints the total cost of envelopes and envelope tax
        
        double costBeforeTax$ = (totalSockCost$)+(totalGlassCost$)+(totalEnvelopeCost$);
        System.out.println("The total cost of goods before tax is $" +costBeforeTax$);
        //Prints the total cost of goods before tax
        
        double costWithTax$ = (costBeforeTax$)*(1+taxPercent);
        costWithTax$ = Math.round(costWithTax$*100);
        costWithTax$ = costWithTax$/100.0;
        System.out.println("The total tax on all the items is $" +(sockTax$+glassTax$+envelopeTax$));
        System.out.println("The total cost of goods with tax is $" +costWithTax$);
        //Prints the total cost of goods with tax
        
        
        
    } //End main method
} //End Class