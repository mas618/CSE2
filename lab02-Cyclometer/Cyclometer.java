/////////////////////////////////////////////////////////////
//Mark Shterk
//Lab02
//Cyclometer Java Program
//
//  first compile the program
//      javac compile the program
//  run the program
//      java Cyclometer//

//define a class
public class Cyclometer{
    
//  add main method
    public static void main(String[] args) {
        int secsTrip1 = 480; //this and the following lines provide the parameters for the trip
        int secsTrip2 = 3220;
        int countsTrip1 = 1561;
        int countsTrip2 = 9037;
        double wheelDiameter = 27.0,
        PI = 3.14159,
        feetPermile = 5280,
        inchesPerfoot = 12,
        secondsPerminute = 60;
        // the previous four lines are the units necessary to make the computations
        //more appealing to the average human eye
        double distanceTrip1, distanceTrip2, totalDistance; //changes the class 
        //of the variables to make them all the same
        System.out.println("Trip 1 took " + 
        (secsTrip1/secondsPerminute) + " minutes and had " + 
        countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + 
        (secsTrip2/secondsPerminute) + " minutes and had " + 
        countsTrip2 + " counts.");
        distanceTrip1 = countsTrip1*wheelDiameter*PI; 
        //Above gives distance in inches
        //for each count, a rotation of the wheel traves
        //the diameter in inches times PI
        distanceTrip1 /= inchesPerfoot*feetPermile; //converts distance to miles
        distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerfoot/feetPermile;
        //converts distance to miles
        totalDistance = distanceTrip1 + distanceTrip2; //reads the total distance traveled
        System.out.println("Trip 1 was " +distanceTrip1 + " miles.");
        System.out.println("Trip 2 was " +distanceTrip2 + " miles.");
        System.out.println("Total Distance was " +totalDistance + " miles.");
    }
}