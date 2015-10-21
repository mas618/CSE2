/*Mark Shterk
hw08
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java StringAnalysis
Program utilizes loops in order to print various numbers and symbols*/
import java.util.Scanner;
public class StringAnalysis {
    public static void main (String[] args) {
    Scanner myScanner = new Scanner(System.in); //starts the scanner
    System.out.print("Please enter a string of characters: "); //asks user to enter a string of characters
    String User = myScanner.nextLine();
    System.out.print("Please enter 1 if you want to check all the letters. Please enter 2 if you want to check a specific amount of letters: ");
    int Check = myScanner.nextInt();
    if (Check == 1){ //if user enters one, it just prints a true/false statement about whether or not all the characters are letters or not
        boolean letters = checkLetters(User);
        System.out.println( "The following statement is " + letters + ", all of the characters are letters."); //prints true/false. 
    }
   if (Check == 2){ //if it is true, has to check if they are all letters or no
       System.out.print("How many letters would you like to check?  ");
       int numberLetters =myScanner.nextInt();
       boolean letters = checkLetters(User, numberLetters);
       System.out.println( "The statement that the following " + numberLetters + " characters are all letters is " + letters);
   }
        
   }
   public static boolean checkLetters(String User) { //this method checks if all the characters are numbers or not
     boolean check= true;
     
     //String User;
     int numLetters= 0;
     for(int j  = 0; j < User.length(); j++ ) {
         if (Character.isLetter(User.charAt(j))) { //finds character at j in the string
             numLetters++;}
     }
    if (numLetters == User.length()) { //if the number of letters is the same as the length
        return check; //returns check is true
    }
   else{ //if it isnt, changes the check
       check = false;
       return check;}
    
   }
   public static  boolean checkLetters(String User, int numberLetters) { //this checks if there is a number at the character placeholder
     boolean check= true;
     if(numberLetters>User.length()){
         numberLetters= User.length();
     }
     //String User;
     int numLetters= 0;
     for(int j  = 0; j < numberLetters; j++ ) {
         if (Character.isLetter(User.charAt(j))) {  
             numLetters++;}
     }
    if (numLetters == numberLetters) { // if it doesnt find a number. returns true and moves on. if it does, then it stays the same
        return check;
    }
   else{
       check = false;
       return check;}
   }  
   
}