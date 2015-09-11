/////////////////////////////////////////////////////////////
//Mark Shterk
//Lab02
//Check Java Program
//
//  first compile the program
//      javac compile the program
//  run the program
//      java Check//

// must import Scanner class
import java.util.Scanner;
//define a class
public class Check{
    public static void main(String[] args) {
        //declare and call Scanner object/constructor
        Scanner myScanner = new Scanner(System.in);
        
        //start program
        //ask user for check input
        System.out.print("Enter the original cost of the check in xx.xx form: ");
        //the next line accepts a user-input in double form, stores it as a variable
        double checkCost = myScanner.nextDouble ();
        //asks user for tip amount
        System.out.print("Enter the tip percentage as a whole number in xx form: ");
        //accepts user input as a tip %
        double tipPercent = myScanner.nextDouble ();
        tipPercent /=100;  // converts tip into decimal value to calculate the actual tip
        //asks user for number of people eating dinner
        System.out.print("Enter the number of people eating: ");
        int numPeople = myScanner.nextInt();
        double totalCost; //creates a total cost variable
        double costPerPerson; //creates a cost per person variable
        int dollars,
            dimes, pennies; //converts the various values to integers
        totalCost = checkCost * (1 + tipPercent); //calculates total cost from user input
        costPerPerson = totalCost / numPeople; //calculates the cost per person
        dollars = (int)costPerPerson; //converts to the integer value of the price
        dimes = (int)(costPerPerson * 10) % 10; // fairly unellegant way of calculating dimes and pennies to make a 2 decimal number
        //it does this by multiplying the costPerPerson variable by ten, then taking the 10th place number
        //and it puts it in the 10th place in the print statement
        pennies = (int)(costPerPerson * 100) %10; //same method as dimes
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies); //prints out what the user inputed as the answer to their code
        
    }
}