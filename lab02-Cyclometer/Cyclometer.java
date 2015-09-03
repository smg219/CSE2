//
public class Cyclometer{
    
  // main method required for every Java program
  public static void main(String[] args){
      
      int secsTrip1=480;  // seconds in the 1st trip
      int secsTrip2=3220; // seconds in the 2nd trip
      int countsTrip1=1561;   // number of rotations of the wheel in the 1st trip
      int countsTrip2=9037;   // number of rotations of the wheel in the 2nd trip
      double wheelDiameter=27.0; // diameter of the wheel
      double PI=3.14159;       // PI
      double feetPerMile=5280;  // how many feet are in a mile
      double inchesPerFoot=12;    // how many inches are in a foot
      double secondsPerMinute=60;    // how many seconds are in a minute
      double distanceTrip1, distanceTrip2, totalDistance;   // the distance for the 1st and 2nd trips and the total distance variables
      
      System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");    // displays number of minutes and counts in trip 1
      System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");    // displays number of minutes and counts in trip 2
      
      distanceTrip1=countsTrip1*wheelDiameter*PI;
      // above gives distance in inches
      // (for each count, a rotation of the wheel teavels the diameter in inches time PI)
      distanceTrip1/=inchesPerFoot*feetPerMile;     // gives the distance in miles
      distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;  //gives the distance in miles of the second trip
      totalDistance=distanceTrip1+distanceTrip2;    // gives the total distance of trip 1 and 2 combined
      
      System.out.println("Trip 1 was "+distanceTrip1+" miles"); // displays the distance of trip 1 in miles
      System.out.println("Trip 2 was "+distanceTrip2+" miles"); // displays the distance of trip 2 in miles
      System.out.println("The total distance was "+totalDistance+" miles"); // displays the combined distance of trip 1 and 2 in miles
      

      
  }  //end of main method
}  //end of class