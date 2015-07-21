//Written by Benjamin Smith
//July 19, 2015
//Chapter 5, Exercise 3: Using a switch statement for a user selection.
//This program allows a user to choose between three types of condos and see the prices.

import java.util.Scanner;

public class CondoSales
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
      //Switch method with cases for each type of condo.
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
   }
}
         