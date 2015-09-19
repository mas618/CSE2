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
public class Timer{
    public static void main(String[] args) {
        //declare and call Scanner object/constructor
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the current time (HHMM) : "); //user input for time
        int time = myScanner.nextInt (); //takes the input as a variable
        System.out.print("Enter the time you plan to have dinner (HHMM) : "); //user input for dinner time
        int dinnertime = myScanner.nextInt (); //saves as variable
        int timetillfood = (dinnertime - time); //takes difference between 
        int hours = timetillfood / 100;
        int minutes = timetillfood-(hours * 100);
        System.out.print("Dinner will be in " + hours + " hours and " + minutes + " minutes");
    }
}
        