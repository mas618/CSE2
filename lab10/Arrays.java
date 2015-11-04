/*Mark Shterk
lab10
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java Arrays
Program utilizes loops in order to print various numbers and symbols*/
// must import Scanner class
import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); 
        int size = (int)(Math.random() * 6) + 5;
        String[] students = new String[size];
        int [] midterm = new int[size];
        System.out.print("Enter " + size + " student names: ");
        for (int i = 0; i <=size-1; i++){
            students[i] = myScanner.next();
            
        }
        System.out.println("Here are the grades for the students: ");
        for (int j = 0; j <=size-1; j++){
            midterm[j] = (int)(Math.random() * 101) + 0;;
        System.out.println(students[j] + ":" + midterm[j]);
        }

        

    }
}
        