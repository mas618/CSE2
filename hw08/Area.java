/*Mark Shterk
hw08
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java Area
Program utilizes loops in order to print various numbers and symbols*/
import java.util.Scanner; // calls scanner functions

public class Area{
  
  
    public static double triangle(double A, double B){ //calculates the area for a triangle
      
      double area = (A * B)/2;
      return area;
    }
    public static double rectangle(double A, double B){ //calculates area for rectangle

      double area = (2*A + 2*B);
      return area;
    }
    public static double circle(double A){ //calculates area for circle
      double area = 3.14 * (A*A);
      return area;
    }
    public static double check(double C){ //method to see if the input is a number
      Scanner myScanner =new Scanner(System.in);
      boolean check = true;
      while (check){ //while the check is true
            if (myScanner.hasNextDouble()){ //if it is not a double
                C = myScanner.nextDouble(); //look to see if it is a double
                 if(C > 0){ //if the double is within the proper bounds
                    check = false; //breaks the loop, moves on
                 }
                 else{ 
                     System.out.println("Sorry, you did not enter a proper value: "); //if it isnt, then move on
                 }
            }
            else{ 
                System.out.println("Sorry, you did not enter a proper value. Try again: "); //if it isn't a double at all, prompts for another entry
                myScanner.next(); 
            }
        }
        return C;
    }
    public static void main(String[] args) {  //main method
    Scanner myScanner = new Scanner(System.in);
      System.out.println("Please enter the shape (circle, triangle, rectangle): "); //user input
      double base = 0;
      double height = 0;
      double side1 = 0;
      double side2 = 0;
      double radius1 = 0;
      boolean check1 = true;
      while (check1){ 
        if (myScanner.hasNext()){
          String shape = myScanner.next();
            if (shape.equals("triangle")){ //similar to the check method above, these nested loops only accept the three possible shapes
              System.out.println("Please enter the base of the triangle: ");
              double number1 = check(base); //after each input, the check method checks to see if the selected numbers fit the criteria
              System.out.println("Please enter the height of the triangle: ");
              double number2 = check(height);
              double trianglearea = triangle(number1, number2);
              System.out.println("The area is " + trianglearea);
              check1 = false;
          }
          else if(shape.equals("rectangle")){ //repeat above for triangle, same process
            System.out.println("Please enter the first side measurement: ");
            double sideA = check(side1);
            System.out.println("Please enter the second side measurement: ");
            double sideB = check(side2);
            double rectangleArea = rectangle(sideA, sideB);
            System.out.println("The area of the rectangle is: " + rectangleArea);
            check1 = false;
          }
          else if(shape.equals("circle")){
            System.out.println("Please enter the radius of the circle: ");
            double radiusA = check(radius1);
            double circleArea = circle(radiusA);
            System.out.println("The area of the circle is: " + circleArea);
            check1 = false;
          }
          else{
            System.out.println("You have entered an invalid shape. Enter a valid shape: ");
          }
        }
        else{
          System.out.println("You have entered an invalid shape. Enter a valid shape: ");
          myScanner.next();
          }
    }
    }
}
