/*Mark Shterk
hw11
Check Java Program
*/
import java.util.Scanner;
import java.util.Arrays;
public class Transpose{
    public static int checkNumber(int C){ //method to see if the input is a number
      Scanner myScanner =new Scanner(System.in);
      boolean check = true;
      while (check){ //while the check is true
            if (myScanner.hasNextInt()){ //if it is not an int
                C = myScanner.nextInt(); //look to see if it is an int
                 if(C > 0 && C <= 10){ //if the double is within the proper bounds
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
    public static int[][] randomMatrix(){
        int k = 0;
        Scanner myScanner = new Scanner(System.in);
        int length = 0;
        int width = 0;
        System.out.println("Enter the length of the matrix from 0 to 10: ");
        int y = checkNumber(length); //takes the number as the length and checks it
        System.out.println("Enter the width of the matrix from 0 to 10: ");
        int x = checkNumber(width); //repeat with width
        int[][] A = new int[x][y]; //sets dimensions
        System.out.println("Random Matrix: ");
        for (int a = 0; a < A.length; a++){
            A[a] = new int[y];
            for (int b = 0; b < A[0].length; b++){
                k = (int)(Math.random()*20) + -10;
                A[a][b] = k; //populates the matrix with random numbers from -10 to 10 in both dimensions
            }
        }
        return A; //returns the matrix
    }
    public static void printArray(int[][] A){
        int i = 0;
        int j = 0;
        for(i=0; i<A.length; i++){
            for(j=0; j<A[0].length; j++){
                System.out.print(A[i][j] + " "); //stardard matrix print
            }
            System.out.println("");
        }
    }
    public static void transposeMatrix(int[][] A){
        int i = 0;
        int j = 0;
        for(i=0; i<A[0].length; i++){
            for(j=0; j<A.length; j++){
                System.out.print(A[j][i] + " "); //switches the rows and column dimensions
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int [][] matrix = randomMatrix(); //creates the matrix
        printArray(matrix); //prints the matrix
        System.out.println("Transposed Matrix: ");
        transposeMatrix(matrix); //transposes the matrix
        
    }
}