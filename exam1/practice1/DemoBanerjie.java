import java.util.ArrayList;
import java.util.*;

public class DemoBanerjie {
   public static void main (String[] args) {
      // variables
      ArrayList<AssemblyLine> assemblyLines = new ArrayList<AssemblyLine>();
      String assemblyName;
      int totalNumWidgets;
      int rejectedNumWidgets;
      String anotherLine;
      double factoryEfficiency = 0.0;
      
      // constants
      double EXCELLENT_RATING = 95.00;
      double GOOD_RATING = 90.00;
      
      // create new Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // main loop
      do {
         // prompt user input & validate input
         // name of assembly line
         System.out.print("Enter the name of the assembly line: ");
         assemblyName = keyboard.nextLine();
         // number of total widgets manufactured
         System.out.print("Enter the total number of widgets manufactured: ");
         totalNumWidgets = keyboard.nextInt();
         while (totalNumWidgets < 1) {
            System.out.print("Invalid Value. Enter the total number of widgets manufactured: ");
            totalNumWidgets = keyboard.nextInt();
         }
         // number of rejected widgets manufactured
         System.out.print("Enter the number of rejected widgets manufactured: ");
         rejectedNumWidgets = keyboard.nextInt();
         while (rejectedNumWidgets < 1 || rejectedNumWidgets > totalNumWidgets) {
            System.out.print("Invalid Value. Enter the number of rejected widgets manufactured: ");
            rejectedNumWidgets = keyboard.nextInt();
         }

         // add a new assemblyline object to a list
         assemblyLines.add(new AssemblyLine(assemblyName, totalNumWidgets, rejectedNumWidgets));
         
         // scanner reset
         keyboard.nextLine(); 
         
         // does user wish to enter info for another assembly line
         System.out.print("Do you wish to enter information for another assembly line (Y/N)? ");
         anotherLine = keyboard.nextLine();
         while (!anotherLine.equalsIgnoreCase("Y") && !anotherLine.equalsIgnoreCase("N")){
            System.out.print("Invalid Value. Do you wish to enter information for another assembly line (Y/N)? ");
            rejectedNumWidgets = keyboard.nextInt();
         }
         
      } while(anotherLine.equalsIgnoreCase("Y"));
      
      // print quality report title
      System.out.println("Quality Report:");
      
      // print assembly line name & quality percentage for each object
      for (int i = 0; i < assemblyLines.size(); i++) {
         System.out.printf("Assembly Line: %s \nQuality (as a percentage): %.2f\n", assemblyLines.get(i).getName(), assemblyLines.get(i).calculateOverallQuality()*100);
         factoryEfficiency += assemblyLines.get(i).calculateOverallQuality()*100;
      }
      
      // calculate the value of factor efficiency
         factoryEfficiency = factoryEfficiency / assemblyLines.size();
        
      // print factory efficiency
      if (factoryEfficiency > EXCELLENT_RATING) {
         System.out.printf("The efficiency of the factory is: Excellent");
      }
      else if (factoryEfficiency >= GOOD_RATING) {
         System.out.printf("The efficiency of the factory is: Good");   
      }
      else {
         System.out.printf("The efficiency of the factory is: Unacceptable");
      }
       
     
   }
}