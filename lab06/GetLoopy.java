/////////////////////////////////////////////////////////////
/*Mark Shterk
Lab06
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java GetLoopy
Program utilizes loops in order to print various numbers and symbols*/

public class GetLoopy{
    public static void main(String[] args) {
       //First part of the program, number counter
        System.out.println("Step 1: ");
        int x = 0; //sets up variable for number itself
        while (x<7){ //initiates the while loop, prints while the number is less than 7
            x++; //counter that increases the value of the variable by one
            System.out.print(x); //prints the variable
        }
        int counter1 = 0; //counter to initialize the number of 7's to print
        while (counter1<5){ //starts the while loop
            counter1++; //increases the value of the counter by 1
            System.out.print(x); //continues to print 7 until the limit is reached
        }
        //Part 2 of program, prime numbers
        System.out.println("");
        System.out.println("Step 2: ");
        System.out.println("While loop: ");
        int y = 10;
        int counter2 = 0;
        while (y<=99) {
            y++;
            if (y % 2 == 0 || y % 3 == 0 || y % 5 == 0 || y % 7 ==0){
            }
            else {
                System.out.print(" " + y);
            }
        }
        System.out.println("");
        System.out.println("For Loop: ");
        for (y = 10; y <= 99; y++){
            if (y % 2 == 0 || y % 3 == 0 || y % 5 == 0 || y % 7 ==0){
            }
            else {
                System.out.print(" " + y);
            }
        }
        System.out.println("");
        System.out.println("Do-While Loop: ");
        int z = 10;
        do {
            z++;
            if (z % 2 == 0 || z % 3 == 0 || z % 5 == 0 || z % 7 ==0){
            }
            else {
                System.out.print(" " + z);
            }
        }while (z <= 99);
        
        System.out.println("");
        System.out.println("Step 3: ");
        int a = (int)(Math.random()*101)+5;
        String smiley = ":)";
        int counter3 = 0;
        
        while (counter3<=a){
            counter3++;
            int counter4 = 0;
            //System.out.print(smiley);
            for (counter4 = 1; counter4 <=20; counter4++){
                //System.out.print("" + smiley);
                if (counter4 % 20 != 0){
                    System.out.print("" + smiley);
                }
                else {
                    System.out.print("\n");
                }
            }
        }
         
        }
    }

