/*Mark Shterk
HW06
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java BarGraph
Program utilizes loops in order to print various numbers and symbols*/
// must import Scanner class
import java.util.Scanner;

public class BarGraph{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //initializes scanner class
        double M = 0; // sets up the variable for the day of the week
        boolean check = true; //starts a check for the next statement
        while (check){ //while statement runs the check to make sure the proper number entered is a positive number value
            System.out.println("How much did you spend on Monday? "); //asks user for their input
            if (myScanner.hasNextDouble()){ //sets check for the positive value
                 M = myScanner.nextDouble(); //positive value
                 if(M > 0){ //if it is positive
                    check = false; //it breaks the loop, moves on
                 }
                 else{ //if not, prints the next statement
                     System.out.println("Sorry, you did not enter a positive value: ");
                 }
            }
            else{ //if its not an int, print the next statement
                System.out.println("Sorry, you did not enter a positive value. Try again: "); 
                myScanner.next();
            }
        }
        double T = 0; //repeat the previous process for all the days of the week
        check = true;
        while (check){
            System.out.println("How much did you spend on Tuesday? ");
            if (myScanner.hasNextDouble()){
                 T = myScanner.nextDouble();
                 if(T > 0){
                    check = false;
                 }
                 else{
                     System.out.println("Sorry, you did not enter a positive value: ");
                 }
            }
            else{
                System.out.println("Sorry, you did not enter a positive value. Try again: "); 
                myScanner.next();
            }
        }
        double W = 0;
        check = true;
        while (check){
            System.out.println("How much did you spend on Wednesday? ");
            if (myScanner.hasNextDouble()){
                 W = myScanner.nextDouble();
                 if(W > 0){
                    check = false;
                 }
                 else{
                     System.out.println("Sorry, you did not enter a positive value: ");
                 }
            }
            else{
                System.out.println("Sorry, you did not enter a positive value. Try again: "); 
                myScanner.next();
            }
        }
        double Tr = 0;
        check = true;
        while (check){
            System.out.println("How much did you spend on Thursday? ");
            if (myScanner.hasNextDouble()){
                 Tr = myScanner.nextDouble();
                 if(Tr > 0){
                    check = false;
                 }
                 else{
                     System.out.println("Sorry, you did not enter a positive value: ");
                 }
            }
            else{
                System.out.println("Sorry, you did not enter a positive value. Try again: "); 
                myScanner.next();
            }
        }
        double F = 0;
        check = true;
        while (check){
            System.out.println("How much did you spend on Friday? ");
            if (myScanner.hasNextDouble()){
                 F = myScanner.nextDouble();
                 if(F > 0){
                    check = false;
                 }
                 else{
                     System.out.println("Sorry, you did not enter a positive value: ");
                 }
            }
            else{
                System.out.println("Sorry, you did not enter a positive value. Try again: "); 
                myScanner.next();
            }
        }
        double S = 0;
        check = true;
        while (check){
            System.out.println("How much did you spend on Saturday? ");
            if (myScanner.hasNextDouble()){
                 S = myScanner.nextDouble();
                 if(S > 0){
                    check = false;
                 }
                 else{
                     System.out.println("Sorry, you did not enter a positive value: ");
                 }
            }
            else{
                System.out.println("Sorry, you did not enter a positive value. Try again: "); 
                myScanner.next();
            }
        }
        double Su = 0;
        check = true;
        while (check){
            System.out.println("How much did you spend on Sunday? ");
            if (myScanner.hasNextDouble()){
                 Su = myScanner.nextDouble();
                 if(Su > 0){
                    check = false;
                 }
                 else{
                     System.out.println("Sorry, you did not enter a positive value: ");
                 }
            }
            else{
                System.out.println("Sorry, you did not enter a positive value. Try again: "); 
                myScanner.next();
            }
        }
        double average = (M+T+W+Tr+F+S+Su)/7; //averages values
        System.out.printf("%nYour average weekly expenses are $%.2f ", average); //prints out average for the days of the week
        double projection = 0;
        int counter1 = 0;
        for (counter1 = 0; counter1 <=208; counter1++){ //for loop to find projection
        int per = (int)(Math.random()*41)+1; //creates random percentage value
        //System.out.println(per);
        double multiplier = 0;
        //double projection = 0;
        double percent = 0;
        if (per<20){ //if it is less than 20, multiply by .01 to create % value
            percent = per * .01;
            multiplier = 1-percent; //creates the multiplier 
        }
        else if (per >=20){
            percent = per - 20; //brings the values over 20 back down to 20
            percent *= .01; //convert to percentages
            multiplier = 1+percent; //add it to increase value
        }
        projection = average * multiplier * counter1; // do this over and over until the limit, 4 years
        }
        System.out.printf("%nYour 4 year projection is $%.2f ", projection); //prints the prejection for 4 years
        System.out.println("Bar Graph: ");
        String star = "*";
        int counter2 = 0; //creates the counter used in the loop
        System.out.print("Mon: ");
        M = (int)Math.round(M); //rounds M to the proper value
        for (counter2 = 0; counter2 < M; counter2++){
            System.out.print(star); //prints amount of stars needed as determined by the round statement
        }
        System.out.println("");
        System.out.print("Tue: "); //repetition for all the days of the week in order to finish graph
        T = (int)Math.round(T);
        for (counter2 = 0; counter2 < T; counter2++){
            System.out.print(star);
        }
        System.out.println("");
        System.out.print("Wed: ");
        W = (int)Math.round(W);
        for (counter2 = 0; counter2 < W; counter2++){
            System.out.print(star);
        }
        System.out.println("");
        System.out.print("Thu: ");
        Tr = (int)Math.round(Tr);
        for (counter2 = 0; counter2 < Tr; counter2++){
            System.out.print(star);
        }
        System.out.println("");
        System.out.print("Fri: ");
        F = (int)Math.round(F);
        for (counter2 = 0; counter2 < F; counter2++){
            System.out.print(star);
        }
        System.out.println("");
        System.out.print("Sat: ");
        S = (int)Math.round(S);
        for (counter2 = 0; counter2 < S; counter2++){
            System.out.print(star);
        }
        System.out.println("");
        System.out.print("Sun: ");
        Su = (int)Math.round(Su);
        for (counter2 = 0; counter2 < Su; counter2++){
            System.out.print(star);
        }
        System.out.println("");
    }
}
        