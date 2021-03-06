//Written by Benjamin Smith
//July 19, 2015
//Chapter 5, Exercise 3: Using a switch statement, then nesting a second switch statement within an if clause.
//This program allows a user to choose a condo and a parking option and then displays the price.

import java.util.Scanner;

public class CondoSales2
{
   public static void main(String[] args)
   {
   //Declarations
   int condoNumber;
   int condoPrice;
   int parkingSelection;
   
   //Set keyboard input and accept user input as condo selection. 
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Please choose your condominium: Press 1 for a park view, 2 for a golf course view, or 3 for a lake view.");
   condoNumber = keyboard.nextInt();
      switch(condoNumber)
      {
         case 1:  
            condoPrice = 150000;
            System.out.print("A Park View condo costs " + condoPrice + ".");
            break;
         case 2:
            condoPrice = 170000;
            System.out.print("A Golf Course View condo costs " + condoPrice + ".");
            break;
         case 3:
            condoPrice = 210000;
            System.out.print("A Lake View condo costs " + condoPrice + ".");
            break;
         default:
            condoPrice = 0;
            System.out.print("Invalid Selection.");
       }
       //Prompt user for parking preference.
       if(condoNumber == 1 || condoNumber == 2 || condoNumber ==3)
       {
          System.out.print(" To add a garage press 1. For a parking space press 2.");
          parkingSelection = keyboard.nextInt();
          switch(parkingSelection)
          {
            case 1:
               condoPrice = condoPrice + 5000;
               System.out.print("With a garage, the total cost is " + condoPrice + ".");
               break;
            case 2:
               System.out.print("A parking space is included in the price of " + condoPrice + ".");
               break;
            default:
               System.out.print("Parking selection not valid.");
          }
       }     
   }
}
         