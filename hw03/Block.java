/////////////////////////////////////////////////////////////
//Mark Shterk
//Lab02
//Check Java Program
//
//  first compile the program
//      javac compile the program
//  run the program
//      java Check//

// must import Scanner class
import java.util.Scanner;
//define a class
public class Block{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter length of block: "); //asks user for data
        double length = myScanner.nextDouble (); //stores the data as a variable
        System.out.print("Enter width of block: "); //see above, same method
        double width = myScanner.nextDouble (); //same method
        System.out.print("Enter height of block: ");
        double height = myScanner.nextDouble ();
        double volume = length * width * height; //calculates the volume of the object
        double area = 2*(length * width) + 2*(width * height) + 2*(length * height); //calculate the surface area
        System.out.println("The volume of a block with dimensions " + length + "x" + width + "x" + height + " is " + volume); //print statement for volume
        System.out.println("The surface area of the block is " + area);// print statement for surface area
    }
}
        
        