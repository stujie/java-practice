/*
   Name: Stutie Banerjie
   Date: 3.4.2026
   Asg: Practice Exam - Demo File
   Desc:
*/
import java.util.ArrayList;
import java.util.Scanner;

public class TicketPlanDemo {
   public static void main (String[] args) {
      // declare variables
      
      String lastName;                    // last name of family purchasing plan
      int plan;                           // type of ticket plan (menu choice)
      int adults, children;               // # of adults & children on ticket plan
      int days;                           // # of days covered by ticket plan
      String repeat;                      // does the family want to make another plan
      
      ArrayList<TicketPlan> family = new ArrayList <TicketPlan> ();
      Scanner keyboard = new Scanner(System.in); 
      
      double mostExpensivePlan = 0.0;           // most expensive ticket plan
      String mostExpensiveFamily = " ";   // family with most expensive ticket plan
      
      // do-while loop
      do {
         // input & validation
         
         // prompt - family last name
         System.out.print("Enter the last name of the family purchasing the plan: ");
         lastName = keyboard.nextLine();
         
         // prompt - ticket plan choice
         System.out.println("\n\t 1. Amusement Park Only");
         System.out.println("\t 2. Water Park Only");
         System.out.println("\t 3. Both Parks");
         System.out.print("\nSelect a Ticket Plan from the menu above: ");
         plan = keyboard.nextInt();
         // validation - ticket plan must be 1,2,3
         while(plan != 1 && plan != 2 && plan != 3) {
            // error message
            System.out.println("\n\n**ERROR** INVALID MENU CHOICE SELECTED. TRY AGAIN.\n");
            
            // re-prompt input prompt
            System.out.println("\t 1. Amusement Park Only");
            System.out.println("\t 2. Water Park Only");
            System.out.println("\t 3. Both Parks");
            System.out.print("\nSelect a Ticket Plan from the menu above: ");
            plan = keyboard.nextInt();
         } 
         
         // prompt - # of adults on ticket plan
         System.out.print("Enter the number of adults on the ticket plan: ");
         adults = keyboard.nextInt();
         // validation - adults must be at least 1
         while (adults < 1) {
            // error message
            System.out.println("\n**ERROR** AT LEAST 1 ADULT MUST BE ENTERED. TRY AGAIN.\n"); 
            
            // re-prompt input prompt
            System.out.print("Enter the number of adults on the ticket plan: ");
            adults = keyboard.nextInt();
         } 
         
         // prompt - # of children on ticket plan
         System.out.print("Enter the number of children on the ticket plan: ");
         children = keyboard.nextInt();
         // validation - children must be at least 0
         while (children < 0) {
            // error message
            System.out.println("\n**ERROR** A NEGATIVE NUMBER OF CHILDREN CANNOT BE ENTERED. TRY AGAIN. \n");
            
            // re-prompt input prompt
            System.out.print("Enter the number of children on the ticket plan: ");
            children = keyboard.nextInt();
         } 
         
         // prompt - # of days covered by ticket plan
         System.out.print("Enter the number of days the ticket plan covers: ");
         days = keyboard.nextInt();
         // validation - days must be at least 1
         while (days < 1) {
            // error message
            System.out.println("\n**ERROR** AT LEAST 1 DAY MUST BE ENTERED. TRY AGAIN.\n");
            
            // re-prompt input prompt
            System.out.print("Enter the number of days the ticket plan covers: ");
            days = keyboard.nextInt();
         }
         
         // add a new family object to array list
         family.add(new TicketPlan(lastName, plan, adults, children, days));
         
         // scanner reset
         keyboard.nextLine();
         
         // prompt - enter info for another ticket plan: yes or no
         System.out.print("\nDo you wish to enter information for another ticket plan (Y/N)? ");
         repeat = keyboard.nextLine();
         // validation - input must be y or n
         while (!repeat.equalsIgnoreCase("Y") && !repeat.equalsIgnoreCase("N")) {
            // error message
            System.out.println("\n**ERROR** ONLY Y/y or N/n can be entered. TRY AGAIN.\n");
            
            // re-prompt input prompt
            System.out.print("Do you wish to enter information for another ticket plan (Y/N)? ");
            repeat = keyboard.nextLine();
         } 
         
         // formatting
         System.out.println();
            
      } while (repeat.equalsIgnoreCase("Y"));
      
      // ticket report title
      System.out.println("Ticket Plan Report:\n");
      
      // print ticket plan information for each family
      for (int i = 0; i < family.size(); i++) {
         // last name
         System.out.println("Last Name: " + family.get(i).getLastName());
         
         // ticket plan type
         System.out.print("Ticket Plan Type: ");
         if (family.get(i).getTicketPlan() == 1) {
            System.out.println("Amusement Park Only");
         }
         else if (family.get(i).getTicketPlan() == 2) {
            System.out.println("Water Park Only");
         }
         else {
            System.out.println("Both Parks");
         }
         
         // # of adults
         System.out.println("Number of Adults: " + family.get(i).getAdults());
         
         // # of children
         System.out.println("Number of Children: " + family.get(i).getChildren());
         
         // # of days
         System.out.println("Number of Days: " + family.get(i).getDays());
         
         // price of total ticket plan
         System.out.printf("Price of Ticket Plan: $%,.2f\n\n", family.get(i).getPlanPrice());
      }
      
      // determine the family that purchased the most expensive ticket
      for (int i = 0; i < family.size(); i++) {
         // find highest plan price in family's in array list
         if (family.get(i).getPlanPrice() > mostExpensivePlan) {
            mostExpensivePlan = family.get(i).getPlanPrice();
            mostExpensiveFamily = family.get(i).getLastName();
         }
      }
      
      System.out.println("Family that purchased the most expensive ticket plan: " + mostExpensiveFamily);
   }
}