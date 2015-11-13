/*Mark Shterk
hw11
Check Java Program
*/
import java.util.Scanner;
import java.util.Arrays;
public class CSE2Linear {
    public static int check(int C){ //method to see if the input is a number
      Scanner myScanner =new Scanner(System.in);
      boolean check = true;
      while (check){ //while the check is true
            if (myScanner.hasNextInt()){ //if it is not an int
                C = myScanner.nextInt(); //look to see if it is an int
                 if(C >= 0 && C <= 100){ //if the double is within the proper bounds
                    check = false; //breaks the loop, moves on
                 }
                 else{ 
                     System.out.println("Sorry, you did not enter a proper value in the appropriate range: "); //if it isnt, then move on
                 }
            }
            else{ 
                System.out.println("Sorry, you did not enter a proper value. Try again: "); //if it isn't a double at all, prompts for another entry
                myScanner.next(); 
            }
        }
        return C;
    }
    public static void shuffle(int[] A){
        int temp = 0; //temp variable
        for(int i = 0; i < 15; i++){ //sets up counter
            int j = (int)(Math.random()*15)+0; //generates random variable 
            temp = A[j]; //stores the placeholder as a string
            A[j] = A[0];
            A[0] = temp; //converts to shuffle the deck
        }
    }
    public static void sort(int[] A){
        Arrays.sort(A); //taken from arrays class, sorts the array in numerical order
    }
    public static void printArray(int[] A){
        int i = 0;
        do{
            System.out.print(A[i] + " "); //prints out the string
            i++;
        } while (i<A.length); //do it while it is less than the length
        System.out.println("");
    }
    public static boolean binarySearch(int key){ 
         int[] data = new int[15];
         int size = 0;
         int low = 0;
         int high = size - 1;
          
         while(high >= low) {
             int middle = (low + high) / 2;
             if(data[middle] == key) {
                 return true;
             }
             if(data[middle] < key) {
                 low = middle + 1;
             }
             if(data[middle] > key) {
                 high = middle - 1;
             }
        }
        if (true){
            System.out.println(key + " was in the list.");
        }
        System.out.println(key + " was not in the list with 4 iterations.");
        return false;
    }
    public static void main(String[] args) {
        Scanner myScanner =new Scanner(System.in);
        int stringSize = 15; //fifteen grades, can be adjusted to reflect number of students
        int[] studentGrades = new int[stringSize]; //creates a new array with 15 spaces
        int j = 0;
        System.out.print("Enter 15 CSE2 grades: ");
        //int k = check(j);
        for (int i = 0; i <= stringSize - 1; i++){
            int k = check(j); //checks to see if all the grades are proper within the restrictions
            studentGrades[i] = k; //populates the array
        }
        System.out.println("These are the studet grades: ");
        printArray(studentGrades); //reprints student grades
        System.out.println("Sorted Grades: ");
        sort(studentGrades); //sorts grades
        printArray(studentGrades);
        System.out.println("Enter a value to find: ");
        int search = myScanner.nextInt(); //input grade to find value
        binarySearch(search);
        System.out.println("Shuffled grades: ");
        shuffle(studentGrades); //shuffles the array
        printArray(studentGrades);
        System.out.println("Enter a value to find: ");
        int search1 = myScanner.nextInt(); //same process as above
        for (int c = 0; c <= 15; c++){
            if (c == 15){
                System.out.println(search1 + " is not in the list with 15 iterations.");
                break;
            }
            if (studentGrades[c] == search1){
                System.out.println(search1 + " is in the present location: " + (c + 1));
                break;
            }
        }
    }
}