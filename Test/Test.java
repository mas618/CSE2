import java.util.Scanner; // calls scanner functions

public class Test{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean check = true; //sets up boolean to make a check for proper variables
        int length = 0;
        int width = 0;
        while (check){ 
            System.out.println("Please enter the length of the box: "); 
            if (myScanner.hasNextInt()){ 
                  length = myScanner.nextInt(); 
                 if(length > 0 && length < 80){ //if the value is correct, break the loop by switching the boolean value
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
        check = true;
        while (check){ 
            System.out.println("Please enter the width of the box: "); 
            if (myScanner.hasNextInt()){ 
                 width = myScanner.nextInt(); 
                 if(width > 0 && width <= length){ //if the value is correct, break the loop by switching the boolean value
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
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        for (counter = 0; counter <= length, counter++){
            
        }