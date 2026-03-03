/*
   Name: Stutie Banerjie
   Date: 3.3.2026
   Asg: Practice Exam 2 - Class File
   Desc: Help museum admin staff track membership plan
         purchases and calculate membership prices and revenue
*/

public class MuseumMembership {
   
   // instance fields
   private String customerName;    // name of customer purchasing the membership
   private String membershipPlan;  // type of membership plan
   private int museumVisits;       // # of museum visits purchased with the membership
   
   // setter methods
   public void setCustomerName(String name) {
      customerName = name;
   }
   public void setMembershipPlan(String plan) {
      membershipPlan = plan;
   }
   public void setMuseumVisits(int visits) {
      museumVisits = visits;
   }
   
   // getter methods
   public String getCustomerName() {
      return customerName;
   }
   public String getMembershipPlan() {
      return membershipPlan;
   }
   public int getMuseumVisits() {
      return museumVisits;
   }
   
   // no-arg constructor
   public MuseumMembership() {
      customerName = " ";
      membershipPlan = " ";
      museumVisits = 0;
   }
   
   // constructor w/ arguments
   public MuseumMembership(String name, String plan, int visits) {
      customerName = name;
      membershipPlan = plan;
      museumVisits = visits;
   }
   
   // method 1 - calculate museum visit cost
   public double calculateMuseumVisitCost() {
      if(membershipPlan.equalsIgnoreCase("A")) {
         return 3.99;
      }
      else if(membershipPlan.equalsIgnoreCase("B")) {
         return 7.99;
      }
      else {
         return 12.99;
      }
   }
   
   // method 2 - calculate membership reservation fee
   public double calcualteMembershipReservationFree() {
      if(museumVisits >= 1 && museumVisits <= 8) {
         return 14.00;
      }
      else if (museumVisits >= 9 && museumVisits <= 15) {
         return 23.59;
      }
      else {
         return 18.50;
      }
   }
   
   // method 3 - calculates membership price based on visit cost & # of museum visits
   public double calculateMembershipPrice() {
      return (calculateMuseumVisitCost()*museumVisits) + calcualteMembershipReservationFree();
   }
}