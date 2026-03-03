# Program Description

A local manufacturing company makes a variety of widgets in their factory. Each widget is made on a different assembly line.

After a widget is made, it is checked by a quality assurance worker that either accepts the widget as good, or rejects the widget due to lack of quality.

Write a program that allows the company to measure the overall quality of their assembly lines.

## File 1 - AssemblyLine.java

Write an AssemblyLine class that will hold the following information:

- The name of the assembly line

- The total number of widgets that were manufactured

- The number of rejected widgets that were manufactured

The AssemblyLine class should contain (at least) the following methods:

- A constructor that doesn’t accept arguments and explicitly initializes each field

- A constructor that accepts arguments for each field.

- Appropriate accessor and mutator methods (i.e., setters and getters).

- A method that calculates and returns the number of acceptable widgets that were manufactured
  - Acceptable Widgets = Total Widgets - Rejected Widgets

- A method that calculates the overall quality of the assembly line
  - Assembly Line Quality = Acceptable Widgets / Total Widgets

## File 2 - DemoLastname.java (replace “Lastname” with your actual last name)

- Write a program that demonstrates the AssemblyLine class. The program should ask the user for the following:
  - The name of the assembly line

  - The total number of widgets that were manufactured. Validate user input. Do not accept a number less than 1.

  - The number of rejected widgets that were manufactured. Validate user input. Do not accept a number less than 0 or greater than the total number of widgets.

- The program should create an AssemblyLine object using the information entered by the user.
  - Store the object in a container that will automatically expand as objects are added.

- The program should continue allowing the user to input information until the user wishes to stop (See Sample Input and Output).

- After the user indicates a wish to stop, the program should output a Quality Report containing the information for each assembly line and the efficiency rating of the factory.
  - The quality of the assembly line should be displayed as a percentage, formatted with two decimal places.

- The efficiency rating of the factory is based on the average assembly line quality.
  - Average Assembly Line Quality = Sum of all Assembly Line Qualities / Number of Assembly Lines

Use the table below to determine the efficiency rating of the factory.

| Efficiency Rating | Average Assembly Line Quality          |
| ----------------- | -------------------------------------- |
| Excellent         | Above 95.00                            |
| Good              | At least 90.00 but not more than 95.00 |
| Unacceptable      | Below 90.00                            |

The program should display the input and output as shown in the Sample Input and Output

## Sample Input and Output (formatting and spacing should be exactly as shown below)

Enter the name of the assembly line: Line1

Enter the total number of widgets manufactured: 10000

Enter the number of rejected widgets manufactured: 368

Do you wish to enter information for another assembly line (Y/N)? Y

Enter the name of the assembly line: Line2

Enter the total number of widgets manufactured: 54123

Enter the number of rejected widgets manufactured: 5899

Do you wish to enter information for another assembly line (Y/N)? Y

Enter the name of the assembly line: Line3

Enter the total number of widgets manufactured: 950

Enter the number of rejected widgets manufactured: 75

Do you wish to enter information for another assembly line (Y/N)? N

Quality Report:

Assembly Line: Line1

Quality (as a percentage): 96.32

Assembly Line: Line2

Quality (as a percentage): 89.10

Assembly Line: Line3

Quality (as a percentage): 92.11

The efficiency of the factory is: Good
