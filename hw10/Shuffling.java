/*Mark Shterk
hw10
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java Shuffling
Program utilizes loops in order to print various numbers and symbols*/

public class Shuffling {
    public static void shuffle(String[] A){
        String temp = ""; //temp variable
        for(int i = 0; i < 60; i++){ //sets up counter
            int j = (int)(Math.random()*51)+1; //generates random variable 
            temp = A[j]; //stores the placeholder as a string
            A[j] = A[0];
            A[0] = temp; //converts to shuffle the deck
        }
    }
    public static void printArray(String[] A){
        int i = 0;
        do{
        System.out.print(A[i] + " "); //prints out the string
        i++;
        } while (i<A.length); //do it while it is less than the length
        System.out.println("");
    }
    public static String[] randomizeHand(String[] A){
        int i = 0;
        int j = 0;
        String[] B = new String[5]; //creates string with length of five
        for(j=4; j>=0; j--){
            i = (int)(Math.random()*48) + j; //generates random number between 1 and 52
            B[j] = A[i]; //uses the random number to determine which element of Array A to put into the location of array B
        }
        return B; //returns Array B
    }
    public static void main (String[] args) {
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];
            //System.out.print(cards[i]+" ");
        }
        printArray(cards);
        System.out.println("");
        System.out.println("Shuffled: ");
        shuffle(cards);
        printArray(cards);
        System.out.println("");
        System.out.println("Randomized Hand: ");
        hand = randomizeHand(cards);
        printArray(hand);
    }
}
