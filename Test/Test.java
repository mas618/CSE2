/*Mark Shterk
hw10
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java Shuffling
Program utilizes loops in order to print various numbers and symbols*/

public class Test {
    public static void main(String[] args) {
        int numbers = (int)(Math.random()*99999)+ 1;
        boolean check = true;
        //while (check){
        int[] array1 = new int[numbers];
        
        array1[0] = (int)(Math.random()*100000)+ 0;
            for (int i = 1; i<=5000; i++){
               array1[i] = (int)(Math.random()*100000)+ 0; 
               if (array1[i - 1] > array1[i]){
                for (;; array1[i] = (int)(Math.random()*100000)+ 0){
                    System.out.println(array1[i]);
                }
                    //System.out.println(array1[i]);
               }
               
            }
        } 
    }

              
            
                
                


