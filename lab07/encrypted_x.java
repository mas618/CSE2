/*Mark Shterk
Lab07
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java encrypted_x
Program utilizes loops in order to print various numbers and symbols*/

import java.util.Scanner;

public class encrypted_x{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean check = true; 
        int size = 0;
        while (check){ 
            System.out.println("Please enter the size of the box: "); 
            if (myScanner.hasNextInt()){ 
                 size = myScanner.nextInt(); 
                 if(size > 0 && size <= 100){ 
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
        String marker = "*";
        int counter = 0;
        int counter1 = 0;
        for (counter = 0; counter <= size; counter++){
            //System.out.println(marker);
            for (counter1 = 0; counter1 <=size; counter1++){
                if (counter1 == counter){
                    System.out.print(" ");
                }
                else if (counter1 == size - counter){
                    System.out.print(" ");
                }
                else {
                System.out.print(marker);
                }
        }
        System.out.println("");
        }
 
            
            
        
    }
}