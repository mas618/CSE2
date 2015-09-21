/////////////////////////////////////////////////////////////
//Mark Shterk
//hw04
//Card Generator Java Program
//
//  first compile the program
//      javac compile the program
//  run the program
//      java PokerHandCheck//
//  Purpose of the program is to create a program that will generate a random card

// must import Scanner class
//import java.util.Scanner;
//Scanner class not necessary, no input needed
//import java.util.Math;
//define a class
public class PokerHandCheck{
    public static void main(String[] args) {
        int card = (int)(Math.random() * 13) + 2; //randomly chooses a number between 2 and 13, or the number of cards
        int suit = (int)(Math.random() * 4) + 1; //randomly selects a suit for cards
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
        int card1 = (int)(Math.random() * 13) + 2; //randomly chooses a number between 2 and 13, or the number of cards
        int suit1 = (int)(Math.random() * 4) + 1; //randomly selects a suit for cards
        String cardType1 = null; //declares the different types of suits, creates an empty set for the declaration
        if (suit1 == 1){ //the following if statements assign numbers generated from the suit generator to an actual suit with a name
            cardType1 = "hearts";
        }
        else if (suit1 == 2){
            cardType1 = "clubs";
        }
        else if (suit1 == 3){
            cardType1 = "diamonds";
        }
        else if (suit1 == 4){
            cardType1 = "spades";
        }
        String faceCard1 = null; //since you cannot have a 13 of hearts, the following statements switch numbers with the correspoding face cards in a deck
        switch (card1) {
            case 11: faceCard1 = "Jack"; //an 11 is a Jack
            break; //stops this specific case, breaks away from this specific case
            case 12: faceCard1 = "Queen"; //a 12 is a Queen
            break;
            case 13: faceCard1 = "King"; //a 13 is a King
            break;
            case 14: faceCard1 = "Ace"; //a 14 is an Ace
            break;
        }
        int card2 = (int)(Math.random() * 13) + 2; //randomly chooses a number between 2 and 13, or the number of cards
        int suit2 = (int)(Math.random() * 4) + 1; //randomly selects a suit for cards
        String cardType2 = null; //declares the different types of suits, creates an empty set for the declaration
        if (suit2 == 1){ //the following if statements assign numbers generated from the suit generator to an actual suit with a name
            cardType2 = "hearts";
        }
        else if (suit2 == 2){
            cardType2 = "clubs";
        }
        else if (suit2 == 3){
            cardType2 = "diamonds";
        }
        else if (suit2 == 4){
            cardType2 = "spades";
        }
        String faceCard2 = null; //since you cannot have a 13 of hearts, the following statements switch numbers with the correspoding face cards in a deck
        switch (card2) {
            case 11: faceCard2 = "Jack"; //an 11 is a Jack
            break; //stops this specific case, breaks away from this specific case
            case 12: faceCard2 = "Queen"; //a 12 is a Queen
            break;
            case 13: faceCard2 = "King"; //a 13 is a King
            break;
            case 14: faceCard2 = "Ace"; //a 14 is an Ace
            break;
        }
        int card3 = (int)(Math.random() * 13) + 2; //randomly chooses a number between 2 and 13, or the number of cards
        int suit3 = (int)(Math.random() * 4) + 1; //randomly selects a suit for cards
        String cardType3 = null; //declares the different types of suits, creates an empty set for the declaration
        if (suit3 == 1){ //the following if statements assign numbers generated from the suit generator to an actual suit with a name
            cardType3 = "hearts";
        }
        else if (suit3 == 2){
            cardType3 = "clubs";
        }
        else if (suit3 == 3){
            cardType3 = "diamonds";
        }
        else if (suit3 == 4){
            cardType3 = "spades";
        }
        String faceCard3 = null; //since you cannot have a 13 of hearts, the following statements switch numbers with the correspoding face cards in a deck
        switch (card3) {
            case 11: faceCard3 = "Jack"; //an 11 is a Jack
            break; //stops this specific case, breaks away from this specific case
            case 12: faceCard3 = "Queen"; //a 12 is a Queen
            break;
            case 13: faceCard3 = "King"; //a 13 is a King
            break;
            case 14: faceCard3 = "Ace"; //a 14 is an Ace
            break;
        }
        int card4 = (int)(Math.random() * 13) + 2; //randomly chooses a number between 2 and 13, or the number of cards
        int suit4 = (int)(Math.random() * 4) + 1; //randomly selects a suit for cards
        String cardType4 = null; //declares the different types of suits, creates an empty set for the declaration
        if (suit4 == 1){ //the following if statements assign numbers generated from the suit generator to an actual suit with a name
            cardType4 = "hearts";
        }
        else if (suit4 == 2){
            cardType4 = "clubs";
        }
        else if (suit4 == 3){
            cardType4 = "diamonds";
        }
        else if (suit4 == 4){
            cardType4 = "spades";
        }
        String faceCard4 = null; //since you cannot have a 13 of hearts, the following statements switch numbers with the correspoding face cards in a deck
        switch (card4) {
            case 11: faceCard4 = "Jack"; //an 11 is a Jack
            break; //stops this specific case, breaks away from this specific case
            case 12: faceCard4 = "Queen"; //a 12 is a Queen
            break;
            case 13: faceCard4 = "King"; //a 13 is a King
            break;
            case 14: faceCard4 = "Ace"; //a 14 is an Ace
            break;
        }
        //each of the if statements print out the card that the user recieves
        if (card <= 10){
            System.out.println("You picked a " + card + " of " + cardType); //prints for instances less than the face cards
        }
        else {
            System.out.println("You picked a " + faceCard + " of " + cardType); //prints for the face cards
  
        }
        if (card1 <= 10){
            System.out.println("You picked a " + card1 + " of " + cardType1); //prints for instances less than the face cards
        }
        else {
            System.out.println("You picked a " + faceCard1 + " of " + cardType1); //prints for the face cards
  
        }
        if (card2 <= 10){
            System.out.println("You picked a " + card2 + " of " + cardType2); //prints for instances less than the face cards
        }
        else {
            System.out.println("You picked a " + faceCard2 + " of " + cardType2); //prints for the face cards
  
        }
        if (card3 <= 10){
            System.out.println("You picked a " + card3 + " of " + cardType3); //prints for instances less than the face cards
        }
        else {
            System.out.println("You picked a " + faceCard3 + " of " + cardType3); //prints for the face cards
  
        }
        if (card4 <= 10){
            System.out.println("You picked a " + card4 + " of " + cardType4); //prints for instances less than the face cards
        }
        else {
            System.out.println("You picked a " + faceCard4 + " of " + cardType4); //prints for the face cards
  
        }
        //these if statements compare, card for card, the cards recieved from the draw
        //if it's a pair, the compiler prints it. if not, it's a high card
        if (card == card1) {
            System.out.println("You have a pair.");
        }
        else if (card == card2) {
            System.out.println("You have a pair.");
        }
        else if (card == card3) {
            System.out.println("You have a pair.");
        }
        else if (card == card4) {
            System.out.println("You have a pair.");
        }
        else if (card1 == card2) {
            System.out.println("You have a pair.");
        }
        else if (card1 == card3) {
            System.out.println("You have a pair.");
        }
        else if (card1 == card4){
            System.out.println("You have a pair.");
        }
        else if (card2 == card3) {
            System.out.println("You have a pair.");
        }
        else if (card2 == card4) {
            System.out.println("You have a pair.");
        }
        else if (card3 == card4) {
            System.out.println("You have a pair.");
        } 
        else {
            System.out.println("You have a high card hand.");
        }
    }
}


