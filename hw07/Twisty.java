/*Mark Shterk
Lab07
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java Twisty
Program utilizes loops in order to print various numbers and symbols*/

import java.util.Scanner; // calls scanner functions

public class Twisty{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean check = true; //sets up check for loops to make sure its the correct number
        int length = 0;
        int width = 0;
        while (check){ 
            System.out.println("Please enter the length of the box: "); //prompts user for the length
            if (myScanner.hasNextInt()){ //if it is not an integer
                  length = myScanner.nextInt(); //look to see if it is an integer
                 if(length > 0 && length < 80){ //if the integer is within the proper bounds
                    check = false; //breaks the loop, moves on
                 }
                 else{ 
                     System.out.println("Sorry, you did not enter a proper value: "); //if it isnt, then move on
                 }
            }
            else{ 
                System.out.println("Sorry, you did not enter a proper value. Try again: "); //if it isn't an integer at all, prompts for another entry
                myScanner.next(); 
            }
        }
        check = true;
        while (check){ 
            System.out.println("Please enter the width of the box: "); //repeat the previous steps for the width of the box
            if (myScanner.hasNextInt()){ 
                 width = myScanner.nextInt(); 
                 if(width > 0 && width <= length){ 
                    check = false; 
                 }
                 else{ 
                     System.out.println("Sorry, you did not enter a proper value: ");
                 }
            }
            else{ 
                System.out.println("Sorry, you did not enter a proper value. Try again: "); 
                myScanner.next(); 
            }
        }

        int counter1 = 0;
        int counter2 = 0;

            for (counter2 = 0; counter2 < width; counter2++){ //while a counter increases
             
             int i = 0;
             int counter = 0;
                while (counter < length){ //a new counter needs to be less than the length of the box
                    for (counter1 = 0; counter1 < width; counter1++){ //increase a third counter up to the width in order to print the individual x's
                        if (i == 0){ //serves as a check to determine the order in which to print the x's
                            if (counter1 == counter2 && counter <= length){ //if the third counter is less than the first, print the #
                                System.out.print("#");
                                counter++;
                            }
                            else if (counter2 == width - 1 - counter1 && counter <= length){ //to print the other direction, needs to use this function. prints line by line
                                System.out.print("/");
                                counter++;
                            }
                            else { 
                                System.out.print(" "); //places a space in between the characters
                                counter++;
                            }
                        }
                        if (i == 1){ //switches the order of the printing, prints the \ first then the #
                            if (counter1 == counter2 && counter <= length){ //repeat the previous steps for the alternate direction of the symbols
                                System.out.print("\\");
                                counter++;
                            }
                            else if (counter2 == width - 1 - counter1 && counter <= length){
                                System.out.print("#");
                                counter++;
                            }
                            else { 
                                System.out.print(" ");
                                counter++;
                            }
                        }
                    }
                    if (i == 0){ //changes the i check to keep the loops going
                        i = 1;
                    }
                    else {
                        i = 0;
                    }   
                } System.out.println();//breaks the loop
            }
    }
}
