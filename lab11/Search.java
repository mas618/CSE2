/*Mark Shterk
lab11
Check Java Program

  first compile the program
      javac compile the program
  run the program
      java Search
Program utilizes loops in order to print various numbers and symbols*/

public class Search{
    public static void main(String[] args) {
        int numbers = (int)(Math.random()*99999)+ 1;
        int[] array1 = new int[numbers];
        for (int i = 0; i<=5000; i++){
            array1[i] = (int)(Math.random()*100000)+ 0;
        }
            int min = array1[0];
            int max = array1[0];
            
        for (int j = 0; j<=array1.length-1; j++){
            if (max < array1[j]){
                max = array1[j];
            }
            if (min > array1[j]){
                min = array1[j];
            }
        }
        System.out.println("The min of Array 1 is: " + min);
        System.out.println("The max of Array 1 is: " + max);
    }
}
        