//Scott Galdi
//hw02
//Arithmetic Java Program
//

//Class
public class Arithmetic{
    
    //Main method required for every java program
    public static void main(String[] args){
        
        int nSocks=3;   //Number of pairs of socks
        double sockCost$=2.58;  //Cost per pair of socks
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        int nEnvelopes=1;   //Number of boxes of envelopes
        double envelopeCost$=3.25;  //Cost per box of envelopes
        double taxPercent=0.06; //PA state tax
        double sockTax$, glassesTax$, envelopeTax$;  //Individual taxes for socks, glasses, and envelopes
        double totalSockCost$, totalGlassesCost$, totalEnvelopeCost$;   //Individual totals for socks, glasses, and envelopes with tax
        double totalBeforeTax$; //Total cost of socks, glasses, and envelopes before tax
        double totalWithTax$;  //Total cost of socks, glasses, and envelopes with tax
        double totalTax$;   //Total sales tax
        double totalSockCost2$, totalGlassesCost2$, totalEnvelopeCost2$, totalBeforeTax2$, totalWithTax2$, totalTax2$;  //Variables are used to limit answers to 2 decimal places
        
        sockTax$=(nSocks*sockCost$)*taxPercent;  //Calculates the tax for socks
        totalSockCost$=(nSocks*sockCost$)+sockTax$;  //Calculates the price for socks with tax
        glassesTax$=(nGlasses*glassCost$)*taxPercent;    //Calculates the tax for glasses
        totalGlassesCost$=(nGlasses*glassCost$)+glassesTax$; //Calculates the price for glasses with tax
        envelopeTax$=(nEnvelopes*envelopeCost$)*taxPercent;  //Calculates the tax for envelopes
        totalEnvelopeCost$=(nEnvelopes*envelopeCost$)+envelopeTax$;  //Calculates the price for envelopes with tax
        
        totalSockCost2$=(int)Math.round(totalSockCost$*100)/(double)100;    //Converts total sock cost to only two decimal places
        totalGlassesCost2$=(int)Math.round(totalGlassesCost$*100)/(double)100;  //Converts total glasses cost to only two decimal places
        totalEnvelopeCost2$=(int)Math.round(totalEnvelopeCost$*100)/(double)100;    //Converts total envelopes cost to only two decimal places
        
        //Below displays output for the number, cost, and total cost of socks, glasses, and envelopes
        System.out.println(nSocks+" socks were bought at $"+sockCost$+" for a total cost (with tax) of $"+totalSockCost2$);
        System.out.println(nGlasses+" glasses were bought at $"+glassCost$+" for a total cost (with tax) of $"+totalGlassesCost2$);
        System.out.println(nEnvelopes+" envelope was bought at $"+envelopeCost$+" for a total cost (with tax) of $"+totalEnvelopeCost2$);
        
        
        totalBeforeTax$=(nSocks*sockCost$)+(nGlasses*glassCost$)+(nEnvelopes*envelopeCost$);    //Calculates total cost before tax
        totalTax$=totalBeforeTax$*taxPercent;   //Calculates total sales tax
        totalWithTax$=totalBeforeTax$+totalTax$;    //Calculates total with sales tax
        
        totalBeforeTax2$=(int)Math.round(totalBeforeTax$*100)/(double)100;  //Converts total before tax to only two decimal places
        totalTax2$=(int)Math.round(totalTax$*100)/(double)100;  //Converts total tax to only two decimal places
        totalWithTax2$=(int)Math.round(totalWithTax$*100)/(double)100;  //Converts total with tax to only two decimal places
        
        //Below displays the out for the total before tax, total sales tax, and total with tax
        System.out.println("The cost of purchases before taxes is $"+totalBeforeTax2$);
        System.out.println("The total sales tax is $"+totalTax2$);
        System.out.println("The cost of purchases with taxes is $"+totalWithTax2$);
        
        
        
    }   //End of main method
}   //End of class