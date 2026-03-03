/*
   Name: Stutie Banerjie
   Date: 3.2.2026
   Assignment: Practice Exam 1
   Description: Program allows the company to measure the overall quality
                of their assembly lines.
   
*/
public class AssemblyLine {
   
   // instance fields
   private String name;          // name of assembly line
   private int totalWidgets;     // total # of widgets that were manufactured
   private int rejectedWidgets;  // rejected # of widgets that were manufactured
   
   // setter methods
   public void setName(String n) {
      name = n;
   }
   public void setTotalWidgets(int total) {
      totalWidgets = total;
   }
   public void setRejectedWidgets(int rej) {
      rejectedWidgets = rej;
   }
   
   // getter methods
   public String getName() {
      return name;
   }
   public int getTotalWidgets() {
      return totalWidgets;
   }
   public int getRejectedWidgets() {
      return rejectedWidgets;
   }
   
   // no-arg constructor
   public AssemblyLine() {
      name = null;
      totalWidgets = 0;
      rejectedWidgets = 0;      
   }
   
   // constructor that takes arguments
   public AssemblyLine(String n, int total, int rej) {
      name = n;
      totalWidgets = total;
      rejectedWidgets = rej;
   }
   
   // method 1
   // desc: calculates acceptable widgets 
   public int calculateAcceptableWidgets() {
      return totalWidgets - rejectedWidgets;
   }
   
   // method 2
   // desc: calculates assembly line quality
   public double calculateOverallQuality() {
      return (double) calculateAcceptableWidgets()/(double)totalWidgets;
   }
}