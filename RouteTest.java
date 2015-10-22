/**
Name: Stephen Wu
Date Today: October 9th, 2013
Date of Submission: October 11th, 2013
**/

import java.util.*;
import java.io.*;

public class RouteTest {
 public static void main(String[] args){

  try {
  //Initialization of variables
  String routeName = "";
  String type = "";
  double L = -1;
  double mph = -1;
  double stops = -1;
  double stations = -1;
  double headway = -1;
  double tLength = -1;
  double operator = -1;
  double aStaff = -1;
  double sStaff = -1;
  double addVehicles = -1;
  double engine = -1;
  int a=0;
  double staff1 = -1;
  double staff2 = -1;
  double staff3 = -1;
  double staff4 = -1;
  double staff5 = -1;
  double bus1 = -1;
  double bus2 = -1;
  double u1 = -1;
  double u2 = -1;
  double cre = -1;
  double crv = -1;
  	//Created a scanner to pull in external file, in this case, it's a plain text file
   Scanner scan = new Scanner(System.in);
   scan = new Scanner(new File("Input.txt"));
   
   //started a for loop in order to search the file til there are no lines
   while(scan.hasNextLine()){
    routeName = scan.next();
    type = scan.next();
    //Switch statement in order to separate the different ROW Types
    switch (type) {
     case "BusShared":
      L = scan.nextDouble();
      mph = scan.nextDouble();
      stops = scan.nextDouble();
      headway = scan.nextDouble();
      operator = scan.nextDouble();
      addVehicles = scan.nextDouble();
      
      BusShared buss = new BusShared(routeName, L, mph, headway, addVehicles, stops);
      System.out.println(routeName + " Staff: " + buss.getStaff() + " Vehicles: " + buss.getVehicles() + " Stops: " + stops);
      
      staff1 = buss.getStaff();
      bus1 = buss.getVehicles();
      break;
      
     case "BusHybrid": 
      L = scan.nextDouble();
      mph = scan.nextDouble();
      stops = scan.nextDouble();
      stations = scan.nextDouble();
      headway = scan.nextDouble();
      operator = scan.nextDouble();
      sStaff = scan.nextDouble();
      addVehicles = scan.nextDouble();
      
      BusHybrid bush = new BusHybrid(routeName, L, mph, headway, sStaff, addVehicles, stops, stations);
      System.out.println(routeName + " Staff: " + bush.getStaff() + " Vehicles: " + bush.getVehicles() + " Stations: " + stations + " Stops: " + stops);
      staff2 = bush.getStaff();
      bus2 = bush.getVehicles();
      break;
      
     case "UrbanDedicated": 
      L = scan.nextDouble();
      mph = scan.nextDouble();
      stations = scan.nextDouble();
      headway = scan.nextDouble();
      tLength = scan.nextDouble();
      operator = scan.nextDouble();
      aStaff = scan.nextDouble();
      sStaff = scan.nextDouble();
      
      UrbanDedicated ud = new UrbanDedicated(routeName, L, mph, headway, tLength, aStaff, stations, sStaff, operator);
      System.out.println(routeName + " Staff: " + ud.getStaff() + " Vehicles: " + ud.getVehicles() + " Stations: " + stations);
      staff3 = ud.getStaff();
      u1 = ud.getVehicles();
      break;
      
     case "UrbanHybrid": 
      L = scan.nextDouble();
      mph = scan.nextDouble();
      stops = scan.nextDouble();
      stations = scan.nextDouble();
      headway = scan.nextDouble();
      tLength = scan.nextDouble();
      operator = scan.nextDouble();
      aStaff = scan.nextDouble();
      sStaff = scan.nextDouble();
      addVehicles = scan.nextDouble();
      
      UrbanHybrid uh = new UrbanHybrid(routeName, L, mph, headway, tLength, aStaff, stations, sStaff, addVehicles);
      System.out.println(routeName + " Staff: " + uh.getStaff() + " Vehicles: " + uh.getVehicles() + " Stations: " + stations + " Stops: " + stops);
      staff4 = uh.getStaff();
      u2 = uh.getVehicles();
      break;
      
     case "CommuterDedicated": 
      L = scan.nextDouble();
      mph = scan.nextDouble();
      stations = scan.nextDouble();
      headway = scan.nextDouble();
      tLength = scan.nextDouble();
      engine = scan.nextDouble();
      operator = scan.nextDouble();
      aStaff = scan.nextDouble();
      sStaff = scan.nextDouble();
      
      CommuterDedicated cd = new CommuterDedicated(routeName, L, mph, headway, tLength, aStaff, stations, sStaff);
      
      System.out.println(routeName + " Staff: " + cd.getStaff() + " Vehicles: " + cd.getVehicles() + " Engines: " + cd.getEngine() + " Stations: " + stations);
      staff5 = cd.getStaff();
      cre = cd.getEngine();
      crv = cd.getVehicles();
      break;
     }
    
   }
  //Calculations for total
  double staffTotal = staff1 + staff2 + staff3 + staff4 + staff5;
  double busTotal = bus1 + bus2;
  double urbanTotal = u1 + u2;
//Printout for total
  System.out.println("\nTotal Staff: " + staffTotal + "\nBuses: " + busTotal + "\nUrban Rail Vehicles: " + urbanTotal + "\nTotal Commuter Rail Vehicles: " + crv + "\nTotal Commuter Rail Engines: " + cre);
 
  } catch (Exception e) {
   System.out.println("Error");
  }
  
 }
}
