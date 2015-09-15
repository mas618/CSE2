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
        
        System.out.print("Enter the current time (HHMM) : ");
        int time = myScanner.nextInt ();
        System.out.print("Enter the time you plan to have dinner (HHMM) : ");
        int dinnertime = myScanner.nextInt ();
        int timetillfood = (dinnertime - time);
        int hours = timetillfood / 100;
        int minutes = timetillfood-(hours * 100); 
        //timetillfood1 = timetillfood/100;
        //timetillfood2 = int(timetillfood1);
        //System.out.printf(" %n Dinner will be in %100f", timetillfood, "hours" );
        
        System.out.print("Dinner will be in " + hours + " hours and " + minutes + " minutes");
    }
}
        