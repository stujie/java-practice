/* 
   Name: Stutie Banerjie
   Date: 3.3.2026
   Asg: Practice Exam 2 - Demo File
   Desc: Demonstrates MuseumMembership class
         and calculates the cost of memberships
*/
import java.util.ArrayList;
import java.util.*;

public class DemoMuseum {
   public static void main (String[] args) {
      
      // variables
      ArrayList<MuseumMembership> museumMemberships = new ArrayList<MuseumMembership>();
      String customerName;       //
      String membershipType;     // 
      int numMuseumVisits;       //
      String again;              // whether user wants to enter info for another museum
      int membershipCount = 0;   // 
      int eventCount = 0;        //
      double totalRevenue = 0.0; //
      
      // new scanner object
      Scanner keyboard = new Scanner (System.in);
      
      // main loop
      do {
         // user input & input validation
         // name of customer
         System.out.print("Enter the customer's name: ");
         customerName = keyboard.nextLine();
         
         // type of museum membership
         System.out.println("\nChoose from one of the following Museum Memberships:");
         System.out.println("\t\tA. Standard - $3.99 / per visit");
         System.out.println("\t\tB. Premium - $7.99 / per visit");
         System.out.println("\t\tC. All-Access - $12.99 / per visit");
         System.out.print("Enter your choice (A, B, or C): ");
         membershipType = keyboard.nextLine();
         while (!membershipType.equalsIgnoreCase("A") && !membershipType.equalsIgnoreCase("B") && !membershipType.equalsIgnoreCase("C")) {
            System.out.println("\nERROR: INVALID CHOICE, please try again.\n");
            System.out.println("Choose from one of the following Museum Memberships:");
            System.out.println("\t\tA. Standard - $3.99 / per visit");
            System.out.println("\t\tB. Premium - $7.99 / per visit");
            System.out.println("\t\tC. All-Access - $12.99 / per visit");
            System.out.print("Enter your choice (A, B, or C): ");
            membershipType = keyboard.nextLine();
         }
         
         // how many museum visits
         System.out.print("\nHow many museum visits are being purchased? (Min: 1, Max: 20 museum visits) ");
         numMuseumVisits = keyboard.nextInt();
         while (numMuseumVisits < 1 || numMuseumVisits >20) {
            System.out.println("\nERROR: INVALID NUMBER OF MUSEUM VISITS ENTERED, please try again.");
            System.out.print("\nHow many museum visits are being purchased? (Min: 1, Max: 20 museum visits) ");
            numMuseumVisits = keyboard.nextInt();
         }
         
         // add a new museumMemberships object to a list
         museumMemberships.add(new MuseumMembership(customerName, membershipType, numMuseumVisits));
         
         // scanner reset
         keyboard.nextLine();
         
         // enter more information for another museum membership: yes or no
         System.out.print("\nDo you wish to enter information for another museum membership (Y/N)? ");
         again = keyboard.nextLine();
         while(!again.equalsIgnoreCase("Y") && !again.equalsIgnoreCase("N")) {
             System.out.println("\nERROR: INVALID CHOICE, please try again.");
             System.out.print("\nDo you wish to enter information for another museum membership (Y/N)? ");
             again = keyboard.nextLine();
         }
         
         // formatting - add space
         System.out.println();
         
         // incremement counters
         membershipCount++ ;    
         eventCount += numMuseumVisits;                
      } while(again.equalsIgnoreCase("Y"));
      
      // print membership list title
      System.out.println("Museum Membership List");
      System.out.println("---------------------------");
      
      // print membership info for each customer 
      for(int i = 0; i < museumMemberships.size(); i++) {
         // output member name
         System.out.printf("Customer Name: %s \n", museumMemberships.get(i).getCustomerName());
         // output membership type
         System.out.print("Museum Membership: ");
         if(museumMemberships.get(i).getMembershipPlan().equalsIgnoreCase("A")) {
            System.out.println("Standard");
         }
         else if(museumMemberships.get(i).getMembershipPlan().equalsIgnoreCase("B")) {
            System.out.println("Premium");
         }
         else {
            System.out.println("All-Access");
         }
         // output # of visits
         System.out.printf("Number of Visits: %d\n", museumMemberships.get(i).getMuseumVisits());
         // output cost per museum visits
         System.out.printf("Cost per Museum Visit: $%.2f\n", museumMemberships.get(i).calculateMuseumVisitCost());
         // output membership subtotal
         System.out.printf("Membership Subtotal: $%.2f\n", museumMemberships.get(i).calculateMuseumVisitCost()*museumMemberships.get(i).getMuseumVisits());
         // output membership reservation fee
         System.out.printf("Membership Reservation Fee: $%.2f\n", museumMemberships.get(i).calcualteMembershipReservationFree());
         // output total membership price
         System.out.printf("Membership Price: $%.2f\n\n\n", museumMemberships.get(i).calculateMembershipPrice());
         
         // increment total revenue aggregate variable
         totalRevenue += museumMemberships.get(i).calculateMembershipPrice();
      }
      
      // print totals title
      System.out.println("\nTotals:");
      System.out.println("---------------------------");
      System.out.printf("Total Museum Memberships: %d\n", membershipCount);
      System.out.printf("Total Events Purchased: %d\n", eventCount); 
      System.out.printf("Total Ticket Revenue: $%.2f\n", totalRevenue);     
   }
}