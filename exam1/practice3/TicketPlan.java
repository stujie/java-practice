/*
   Name: Stutie Banerjie
   Date: 3.4.2026
   Asg: Practice Exam 3 - Class File
   Desc: Demonstrates the TicketPlan Class 
         and calculates the cost of ticket plans
*/

public class TicketPlan {
   // instance fields
   private String lastName;      // last name of family purchasing the plan
   private int ticketPlan;       // type of ticket plan (menu choice)
   private int adults, children; // # of adults and children on ticket plan
   private int days;             // # of days covered on the ticket plan
   
   // no-arg constructor
   public TicketPlan () {
      lastName = "";
      ticketPlan = 0;
      adults = 0;
      children = 0;
      days = 0;
   }
   
   /*
      construction w/ arguments
      @param l    last name of family purchasing the plan
      @param p    type of ticket plan (menu choice)
      @param a    # of adults on ticket plan
      @param c    # of children on ticket plan
      @param d    # of days covered on the ticket plan
   */
   public TicketPlan(String l, int p, int a, int c, int d) {
      lastName = l;
      ticketPlan = p;
      adults = a;
      children = c;
      days = d;
   }
   
   // setter methods
   
   /*
      setLastName method
      @param l    last name of family purchasing the plan
   */
   public void setLastName(String l) {
      lastName = l;
   }
   
   /*
      setTicketPlan method
      @param p    type of ticket plan (menu choice)
   */
   public void setTicketPlan(int p) {
      ticketPlan = p;
   }
   
   /*
      setAdults method
      @param a    # of adults on ticket plan
   */
   public void setAdults(int a) {
      adults = a;
   }
   
   /*
      setChildren method
      @param c    # of children on ticket plan
   */
   public void setChildren(int c) {
      children = c;
   }
   
   /* 
      setDays method
      @param d    # of days covered by ticket plan
   */
   public void setDays(int d) {
      days = d;
   }
   
   // getter methods
   
   public String getLastName() {
      return lastName;
   }
   
   public int getTicketPlan() {
      return ticketPlan;
   }
   
   public int getAdults() {
      return adults;
   }
   
   public int getChildren() {
      return children;
   }
   
   public int getDays() {
      return days;
   }
   
   // other methods
   
   /*
      getCostPerDayAdult() method 
      calculates and returns the cost per day for an adult on the ticket plan
   */
   public double getCostPerDayAdult() {
      if (ticketPlan == 1) {        // amusement park only
         if (days <= 4) {
            return 104.99;
         }
         else {
            return 94.99;
         }
      } 
      else if (ticketPlan == 2) {   // water park only
         if (days <= 4) {
            return 84.99;
         }
         else {
            return 79.99;
         }
      }
      else {                        // both parks
         if (days <= 4) {
            return 169.99;
         }
         else {
            return 149.99;
         }
      }
   }
   
   /*
      getCostPerDayChild() method 
      calculates and returns the cost per day for a child on the ticket plan
   */
   public double getCostPerDayChild() {
      if (ticketPlan == 1) {        // amusement park only
         if (children <= 2) {
            return 52.49;
         }
         else {
            return 47.49;
         } 
      } 
      else if (ticketPlan == 2) {   // water park only
         if (children <= 2) {
            return 42.49;
         }
         else {
            return 39.99;
         } 
      }
      else {                        // both parks
         if (children <= 2) {
            return 84.99;
         }
         else {
            return 74.99;
         } 
      }

   }
   
    /*
      getPlanPrice() method 
      calculates & returns the price of the ticket plan
   */
   public double getPlanPrice() {
      return ((getCostPerDayChild()*children) + (getCostPerDayAdult()*adults))*days;
   }
   
}