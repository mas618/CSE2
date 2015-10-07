/*Mark Shterk
HW06
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java CheckDigit
Program utilizes loops in order to print various numbers and symbols*/
import java.util.Scanner;

public class CheckDigit{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); 
        int isbn = 0;
        String ISBN = "";
        boolean check = true; //starts a check for the next statement
        while (check){ //while statement runs the check to make sure the proper number entered is a positive number value
            System.out.println("Enter a 10 digit ISBN number "); //asks user for their input
            if (myScanner.hasNext()){ //takes the input
                 ISBN = myScanner.next(); //takes the input
                 if(ISBN.length() == 10){ //if it is 10 characters long, continue on in the code
                    check = false; //it breaks the loop, moves on
                 }
                 else{ //if not, prints the next statement
                     System.out.println("Sorry, you did not enter a valid number. Try again: ");
                 }
            }
            else{ //if its not an int, print the next statement
                System.out.println("Sorry, you did not enter a valid number. Try again: "); 
                myScanner.next();
            }
        }
        int one = 0; //declarations for integers used in the next for and switch statements
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        char a = '+';
        int val = 10;
        int sum = 0;
        for (int i = 0; i <= 9; i++){ //sets up a counter for the next switch statement
            switch (i){
                case 0:
                    a = (ISBN.charAt(i)); //finds the character at certain point in the ISBN string, in this case it is at character 0
                    one = Character.getNumericValue(a); //takes the numeric value of the character. since they are all numbers, it's an easy conversion
                    sum  += (val*one); //does the multiplication out
                    val--; //subtracts one from the value, in this case val was 10 and it becomes 9
                    break; //breaks from the switch statement
                case 1: //this is repeated for the next 9 digit placeholders in the string, with the counter changing at each point
                    a = (ISBN.charAt(i));
                    two = Character.getNumericValue(a);
                    sum +=(val*two);
                    val--;
                    break;
                case 2:
                    a = (ISBN.charAt(i));
                    three = Character.getNumericValue(a);
                    sum +=(val*three);
                    val--;
                    break;
                case 3:
                    a = (ISBN.charAt(i));
                    three = Character.getNumericValue(a);
                    sum +=(val*three);
                    val--;
                    break;
                case 4:
                    a = (ISBN.charAt(i));
                    four = Character.getNumericValue(a);
                    sum +=(val*four);
                    val--;
                    break;
                case 5:
                    a = (ISBN.charAt(i));
                    five = Character.getNumericValue(a);
                    sum +=(val*five);
                    val--;
                    break;
                case 6:
                    a = (ISBN.charAt(i));
                    six = Character.getNumericValue(a);
                    sum +=(val*six);
                    val--;
                    break;
                case 7:
                    a = (ISBN.charAt(i));
                    seven = Character.getNumericValue(a);
                    sum +=(val*seven);
                    val--;
                    break;
                case 8:
                    a = (ISBN.charAt(i));
                    eight = Character.getNumericValue(a);
                    sum +=(val*eight);
                    val--;
                    break;
                case 9:
                    a = (ISBN.charAt(i)); //no sum for this digit since it is the check. Check for this digit
                    if (a == 'X'){
                        nine = 10;
                    }
                    else {
                        nine = Character.getNumericValue(a);
                    }
                    break;
            }
        }
        
        int check1 = sum % 11; //takes the sum from the loops and mods it by 11
        if (check1 == nine){ //compares it to the last value of the string
            System.out.println("This is a valid ISBN!"); //hooray!
        }
        else {
            if (check1 == 10){ //if it is 10, you have to make it print X, hense the differentiation
            System.out.println("This is WRONG. The valid ISBN is: X");
            }
            else{
            System.out.println("This is WRONG. The valid ISBN is: " + check1);
            }
        }
        
        
        //This was my old process. Included for good measure. 
        /*isbn = Integer.parseInt(ISBN);
        int one = isbn % 10;
        int two = (isbn/10) % 10;
        int three = (isbn/100) % 10;
        int four = (isbn/1000) % 10;
        int five = (isbn/10000) % 10;
        int six = (isbn/100000) % 10;
        int seven = (isbn/1000000) % 10;
        int eight = (isbn/10000000) % 10;
        int nine = (isbn/100000000) % 10;
        int ten = (isbn/1000000000) % 10;
        
        int check1 = 10*ten + 9*nine + 8*eight + 7*seven + 6*six + 5*five + 4*four + 3*three + 2*two;
        int checkdig = check1 % 11;
        if (checkdig == one){
            System.out.println("This is a valid ISBN");
        }
        else if (checkdig != one){
            if (checkdig == 10){
                System.out.println("The correct digit should be X");
            }
            else {
                System.out.println("The correct digit should be " + checkdig);
            }
        }*/
    }
}