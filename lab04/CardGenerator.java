/////////////////////////////////////////////////////////////
//Mark Shterk
//Lab04
//Card Generator Java Program
//
//  first compile the program
//      javac compile the program
//  run the program
//      java CardGenerator//
//  Purpose of the program is to create a program that will generate a random card

// must import Scanner class
//import java.util.Scanner;
//Scanner class not necessary, no input needed
//import java.util.Math;
//define a class
public class CardGenerator{
    public static void main(String[] args) {
        //int card = (int)(Math.random() * (upperBound + 1)) + baseNum;
        int card = (int)(Math.random() * 13) + 2; //randomly chooses a number between 2 and 13, or the number of cards
        //System.out.println(card); I used print statements throughout to check if the code was working
        int suit = (int)(Math.random() * 4) + 1; //randomly selects a suit for cards
        //System.out.println(suit);
        String cardType = null; //declares the different types of suits, creates an empty set for the declaration
        if (suit == 1){ //the following if statements assign numbers generated from the suit generator to an actual suit with a name
            cardType = "hearts";
        }
        else if (suit == 2){
            cardType = "clubs";
        }
        else if (suit == 3){
            cardType = "diamonds";
        }
        else if (suit == 4){
            cardType = "spades";
        }
        //System.out.println(cardType);
        String faceCard = null; //since you cannot have a 13 of hearts, the following statements switch numbers with the correspoding face cards in a deck
        switch (card) {
            case 11: faceCard = "Jack"; //an 11 is a Jack
            break; //stops this specific case, breaks away from this specific case
            
            case 12: faceCard = "Queen"; //a 12 is a Queen
            break;
            
            case 13: faceCard = "King"; //a 13 is a King
            break;
            
            case 14: faceCard = "Ace"; //a 14 is an Ace
            break;
        }
        if (card <= 10){
            System.out.println("You picked a " + card + " of " + cardType); //prints for instances less than the face cards
        }
        else {
            System.out.println("You picked a " + faceCard + " of " + cardType); //prints for the face cards
  
        }
        }
    }
