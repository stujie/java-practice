# Special Instructions

1. Use the Scanner class to code this program.
2. Submit only your source code files (i.e., the class you create and the Demo program). Note: a class file you do not create is automatically generated when you run a program. Do not submit this class file.
3. This exam covers concepts in Chapters 1 - 7 only. The use of advanced code from other Chapters will count as a major error.

# Program Description

A local museum sells plans for museum visits to the customers based on the type of membership (General, Premium, or All Access) for up to 20 visits during the calendar year. Write a program that will help the museum's administrative staff track membership plan purchases and calculate membership prices and revenue.

Use the following instructions to code the program:

## File 1 - MuseumMembership.java

1. Write a MuseumMembership class that will hold fields for the following:
   - The name of the customer purchasing the membership

   - The type of membership plan, which can be one of the following:
     - General ($3.99 per visit)

     - Premium ($7.99 per visit)

     - All-Access ($12.99 per membership)

   - The number of museum visits purchased with the membership.

2. The MuseumMembership class must also contain the following methods:
   - A constructor that doesn’t accept arguments.

   - A constructor that accepts arguments for each field.

   - Appropriate accessor and mutator methods (i.e., setters and getters).

   - A method named, calculateMuseumVisitCost, that accepts no arguments and calculates and returns the cost per museum visit on the museum plan.
     - The cost per museum visit is determined using the information in the table below:

     - | Membership Type | Cost Per Museum Visit |
       | --------------- | --------------------- |
       | General         | $3.99                 |
       | Premium         | $7.99                 |
       | All-Access      | $12.99                |

   - A method named calculateMembershipReservationFee that accepts no arguments and calculates and returns the reservation fee for museum visits on the membership based on the number of museum visits purchased.
     - The reservation fee is determined using the information in the table below:

     - | Number of Museum Visits Purchased | Reservation Fee for Museum Visits |
       | --------------------------------- | --------------------------------- |
       | Between 1 up to 8 museum visits   | $14.00                            |
       | Between 9 up to 15 museum visits  | $23.59                            |
       | Between 16 up to 20 museum visits | $18.50                            |

   - A method named calculateMembershipPrice that accepts no arguments and calculates and returns the price of the membership.
     - The price of the plan is calculated using the following formula:
     - membership price = ((museum visit cost \* number of museum visits) + reservation fee)

## File 2 - Demo.java

Write a program that demonstrates the MuseumMembership class and calculates the cost of memberships.

The program must complete the following steps:

1. Ask the user for the following:
   - The name of the customer purchasing the membership.
   - The type of museum membership. Membership types must be presented in a menu as shown in the Sample Input and Output.
     - Input Validation: Do not accept invalid menu options.
   - The number of museum visits purchased on the membership.
     - Input Validation: Do not accept a number less than 1 or greater than 20 for the number of museum visits purchased.

2. The program must create a MuseumMembership object using the constructor that accepts arguments.
   - The MuseumMembership object must be stored in an ArrayList that keeps track of all MuseumMembership objects that are created.

3. The program must ask the user whether they want to enter information for another museum membership and continue allowing the user to input information until the user indicates to stop (see Sample Input and Output).

4. Once the user indicates they wish to stop, the program must display all information about each museum membership as shown in the Sample Input and Output.

5. At the very end of the output, the program must display the total museum members, total museum visits purchased, and the total revenue generated from the museum members entered.

## Sample Input and Output (formatting and spacing must be exactly as shown below)

### Console

Enter the customer's name: James Jamison

Choose from one of the following Museum Memberships:

      A. Standard - $3.99 / per visit

      B. Premium - $7.99 / per visit

      C. All-Access - $12.99 / per visit

Enter your choice (A, B, or C): A

How many museum visits are being purchased? (Min: 1, Max: 20 museum visits) 10

Do you wish to enter information for another museum membership (Y/N)? Y

Enter the customer's name: Raychel Raynolds

Choose from one of the following Museum Memberships:

      A. Standard - $3.99 / per visit

      B. Premium - $7.99 / per visit

      C. All-Access - $12.99 / per visit

Enter your choice (A, B, or C): B

How many museum visits are being purchased? (Min: 1, Max: 20 museum visits) 10

Do you wish to enter information for another museum membership (Y/N)? Y

Enter the customer's name: Blue Greene

Choose from one of the following Museum Memberships:

      A. Standard - $3.99 / per visit

      B. Premium - $7.99 / per visit

      C. All-Access - $12.99 / per visit

Enter your choice (A, B, or C): C

How many museum visits are being purchased? (Min: 1, Max: 20 museum visits) 20

Do you wish to enter information for another museum membership (Y/N)? Y

Enter the customer's name: Harry Harrison

Choose from one of the following Museum Memberships:

      A. Standard - $3.99 / per visit

      B. Premium - $7.99 / per visit

      C. All-Access - $12.99 / per visit

Enter your choice (A, B, or C): F

ERROR: INVALID CHOICE, please try again.

Choose from one of the following Museum Memberships:

      A. Standard - $3.99 / per visit

      B. Premium - $7.99 / per visit

      C. All-Access - $12.99 / per visit

Enter your choice (A, B, or C): C

How many museum visits are being purchased? (Min: 1, Max: 20 museum visits) -99

ERROR: INVALID NUMBER OF MUSEUM VISITS ENTERED, please try again.

How many museum visits are being purchased? (Min: 1, Max: 20 museum visits) 100

ERROR: INVALID NUMBER OF MUSEUM VISITS ENTERED, please try again.

How many museum visits are being purchased? (Min: 1, Max: 20 museum visits) 20

Do you wish to enter information for another museum membership (Y/N)? N

### Final Output

Museum Membership List

---

Customer Name: James Jamison

Museum Membership: Standard

Number of Visits: 10

Cost Per Museum Visit: $3.99

Membership Subtotal: $39.90

Membership Reservation Fee: $23.59

Membership Price: $63.49

Customer Name: Raychel Raynolds

Museum Membership: Premium

Number of Visits: 10

Cost Per Museum Visit: $7.99

Membership Subtotal: $79.90

Membership Reservation Fee: $23.59

Membership Price: $103.49

Customer Name: Blue Greene

Museum Membership: All-Access

Number of Visits: 20

Cost Per Museum Visit: $12.99

Membership Subtotal: $259.80

Membership Reservation Fee: $18.50

Membership Price: $278.30

Customer Name: Harry Harrison

Museum Membership: All-Access

Number of Visits: 20

Cost Per Museum Visit: $12.99

Membership Subtotal: $259.80

Membership Reservation Fee: $18.50

Membership Price: $278.30

Totals:

---

Total Museum Memberships: 4

Total Events Purchased: 60

Total Ticket Revenue: $723.58
