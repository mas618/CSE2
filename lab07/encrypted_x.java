/*Mark Shterk
Lab07
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java encrypted_x
Program utilizes loops in order to print various numbers and symbols*/

import java.util.Scanner; // calls scanner functions

public class encrypted_x{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean check = true; //sets up boolean to make a check for proper variables
        int size = 0; //initializes the size variable
        while (check){ 
            System.out.println("Please enter the size of the box: "); 
            if (myScanner.hasNextInt()){ 
                 size = myScanner.nextInt(); 
                 if(size > 0 && size <= 100){ //if the value is correct, break the loop by switching the boolean value
                    check = false; // breaks the loop
                 }
                 else{ //makes the user re-enter the values, loop continues until something proper is created
                     System.out.println("Sorry, you did not enter a positive value: ");
                 }
            }
            else{ 
                System.out.println("Sorry, you did not enter a positive value. Try again: "); 
                myScanner.next(); //takes next int
            }
        }
        String marker = "*"; //creates the * character as a string
        int counter = 0;
        int counter1 = 0;
        for (counter = 0; counter <= size; counter++){ as counter increases, it prints across the rows
            //System.out.println(marker);
            for (counter1 = 0; counter1 <=size; counter1++){ //this loop is used to integrate the spaces in an x pattern for the program
                if (counter1 == counter){ //left to right, top down spaces. if the counters are the same, prints a space instead of a star
                    System.out.print(" ");
                }
                else if (counter1 == size - counter){ //this prints the spaces from the bottom up. if it is one less than the difference, then it prints the space
                    System.out.print(" ");
                }
                else { //for all other spaces, print the star
                System.out.print(marker);
                }
        }
        System.out.println(""); //new line for continued printing
        }
    }
}