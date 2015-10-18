/*Mark Shterk
Lab08
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java Stats
Program utilizes loops in order to print various numbers and symbols*/
import java.util.Scanner; // calls scanner functions

public class Stats{
    public static double mean(double A, double B, double C, double D, double E){ //creates the first method
        double average = ((A + B + C + D + E)/5); //performs the math operator
        return average; //returns back the math
        }
    public static double median(double A, double B, double C, double D, double E){ //creates the median method used to calculate the median of the function
        double median1 = C; //because this is a 5 input group, the median is just the third number
        return median1; //return the median
    }
    public static void main(String[] args) {  //main method
        
        Scanner myScanner = new Scanner(System.in);
       
        boolean check = true;
        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        double number4 = 0;
        double number5 = 0;
        while (check){ 
            System.out.println("Please enter the first number: "); //prompts user for the fist number
            if (myScanner.hasNextDouble()){ //if it is not a double
                  number1 = myScanner.nextDouble(); //look to see if it is a double
                 if(number1 > 0){ //if the double is within the proper bounds
                    check = false; //breaks the loop, moves on
                 }
                 else{ 
                     System.out.println("Sorry, you did not enter a proper value: "); //if it isnt, then move on
                 }
            }
            else{ 
                System.out.println("Sorry, you did not enter a proper value. Try again: "); //if it isn't a double at all, prompts for another entry
                myScanner.next(); 
            }
        }
        check = true; //repeat previous process for all numbers entered
        while (check){ 
            System.out.println("Please enter the second number: "); 
            if (myScanner.hasNextDouble()){ 
                  number2 = myScanner.nextDouble(); 
                 if(number2 > 0 && number2 > number1){ 
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
        check = true;
        while (check){ 
            System.out.println("Please enter the third number: "); 
            if (myScanner.hasNextDouble()){ 
                  number3 = myScanner.nextDouble(); 
                 if(number3 > 0 && number3 > number2){ 
                    check = false; 
                 }
                 else{ 
                     System.out.println("Sorry, you did not enter a proper value: ");                }
            }
            else{ 
                System.out.println("Sorry, you did not enter a proper value. Try again: "); 
                myScanner.next(); 
            }
        }
        check = true;
        while (check){ 
            System.out.println("Please enter the fourth number: "); 
            if (myScanner.hasNextDouble()){ 
                  number4 = myScanner.nextDouble(); 
                 if(number4 > 0 && number4 > number3){ 
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
        check = true;
        while (check){ 
            System.out.println("Please enter the fifth number: "); 
            if (myScanner.hasNextDouble()){ 
                  number5 = myScanner.nextDouble(); 
                 if(number5 > 0 && number5 > number4){ 
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
        double average1 = mean(number1, number2, number3, number4, number5); //calls the mean method, utilizes the previous numbers in order to do the math
        System.out.println("The mean is: " + average1);//prints the result
        double median2 = median(number1, number2, number3, number4, number5); //calls the median method, utilizes the inputs to find median
        System.out.println("The median is " + median2); //prints result
    }
}
