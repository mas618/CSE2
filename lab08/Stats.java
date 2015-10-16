import java.util.Scanner; // calls scanner functions

public class Stats{
    public static double mean(double A, double B, double C, double D, double E){
        double average = ((A + B + C + D + E)/5);
        return average;
        }
    public static double median(double A, double B, double C, double D, double E){
        double median1 = C;
        return median1;
    }
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
       
        boolean check = true;
        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        double number4 = 0;
        double number5 = 0;
        while (check){ 
            System.out.println("Please enter the first number: "); //prompts user for the length
            if (myScanner.hasNextDouble()){ //if it is not an integer
                  number1 = myScanner.nextDouble(); //look to see if it is an integer
                 if(number1 > 0){ //if the integer is within the proper bounds
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
            System.out.println("Please enter the second number: "); //prompts user for the length
            if (myScanner.hasNextDouble()){ //if it is not an integer
                  number2 = myScanner.nextDouble(); //look to see if it is an integer
                 if(number2 > 0 && number2 > number1){ //if the integer is within the proper bounds
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
            System.out.println("Please enter the third number: "); //prompts user for the length
            if (myScanner.hasNextDouble()){ //if it is not an integer
                  number3 = myScanner.nextDouble(); //look to see if it is an integer
                 if(number3 > 0 && number3 > number2){ //if the integer is within the proper bounds
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
            System.out.println("Please enter the fourth number: "); //prompts user for the length
            if (myScanner.hasNextDouble()){ //if it is not an integer
                  number4 = myScanner.nextDouble(); //look to see if it is an integer
                 if(number4 > 0 && number4 > number3){ //if the integer is within the proper bounds
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
            System.out.println("Please enter the fifth number: "); //prompts user for the length
            if (myScanner.hasNextDouble()){ //if it is not an integer
                  number5 = myScanner.nextDouble(); //look to see if it is an integer
                 if(number5 > 0 && number5 > number4){ //if the integer is within the proper bounds
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
        double average1 = mean(number1, number2, number3, number4, number5);
        System.out.println("The mean is: " + average1);
        double median2 = median(number1, number2, number3, number4, number5);
        System.out.println("The median is " + median2);
    }
}
