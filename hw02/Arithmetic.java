/////////////////////////////////////////////////////////////
//Mark Shterk
//hw02
//Arithmetic Java Program
//
//  first compile the program
//      javac compile the program
//  run the program
//      java Arithmetic//

//define a class
public class Arithmetic{
    
//  add main method
    public static void main(String[] args) {
        // number of socks
        int nSocks = 3;
        //cost of socks
        double sockCost = 2.58;
        
        // number of glasses
        int nGlasses = 6;
        // cost of glasses
        double glassesCost = 2.29;
        
        // number of envelope boxes
        int nBox = 1;
        //cost per box
        double boxCost = 3.25;
        double taxrate = .06;
        double taxmultiplier = 1.06;
        
        //to calculate total cost of socks with tax, multiply following:
        double totalsockcost = nSocks * sockCost * taxmultiplier;
        //to calculate tax paid on socks, multiply following:
        double taxsockcost = nSocks * sockCost * taxrate;
        //Use .printf for formatting purposes. %.2f gives the number of decimal spaces
        System.out.printf(" The total cost for socks is $ %.2f", totalsockcost);
        //%n indicates a new line within the formatting code
        System.out.printf("%n The tax on socks is $ %.2f", taxsockcost);
        //System.out.println("The total cost for socks is $ " + totalsockcost
        //+ "and the tax on socks is $" + taxsockcost );
        //^above code is commented out because it did not return the proper result
        //that was desired. Didn't delete to show process
        
        //repeat for all other items
        double totalglassescost = nGlasses * glassesCost * taxmultiplier;
        double taxglassescost = nGlasses * glassesCost * taxrate;
        System.out.printf("%n The total glasses cost is $ %.2f", totalglassescost);
        System.out.printf("%n The tax on glasses is $ %.2f", taxglassescost);
        //System.out.println("The total cost for glassware is $" + totalglassescost
        //+ "and the tax on glassware is $" + taxglassescost );
        
        double totalboxcost = nBox * boxCost * taxmultiplier;
        double taxboxcost = nBox * boxCost * taxrate;
        System.out.printf("%n The total cost on the boxes is $ %.2f", totalboxcost);
        System.out.printf("%n The tax on boxes is $ %.2f ", taxboxcost);
        //System.out.println("The total cost for envelope boxes is $" + totalboxcost
        //+ "and the tax on boxes are $" + taxboxcost);
        
        //to find out the total cost of items with/without tax
        //you have to use the raw values before applying taxes
        double totalcostnotax = nSocks * sockCost + nBox * boxCost + nGlasses * glassesCost;
        double totalcosttax = totalcostnotax * taxmultiplier;
        double totaltax = taxboxcost + taxglassescost + taxsockcost;
        System.out.printf("%n The total cost without tax is $ %.2f", totalcostnotax);
        System.out.printf("%n The total cost with tax is $ %.2f", totalcosttax);
        System.out.printf("%n The tax paid is $ %.2f", totaltax);
        //System.out.println("The total cost without tax is $" + totalcostnotax
        //+ ". The total cost with tax is $" + totalcosttax + ". The tax paid was $"
        //+ totaltax );
        
        //overall the code is fairly repetitive, similar functions and print statements
    }
}
        
        
        
        
        
        
        
        
        
        
         