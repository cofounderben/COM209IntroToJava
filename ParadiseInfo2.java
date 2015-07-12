//Written by Benjamin Smith
//July 12, 2015
//Method construction with no arguments and no return value

import java.util.Scanner;

public class ParadiseInfo2
{
  
   public static void main(String[] args)
   {
   
//Declarations
   
   double price;
   double discount;
   double savings;
   Scanner keyboard =  new Scanner(System.in);
   displayInfo();

//Main; Prompt user for minimum discount price and accept input
   
   System.out.print("Enter the cutoff price for discount >> ");
   price = keyboard.nextDouble();
   
   System.out.print("Enter discount rate as a whole number >> ");
   discount = keyboard.nextDouble();
   }
   
   public static double computeDiscountInfo(double pr, double dscnt)
   {
      double savings;
      savings = pr * dscnt / 100;
      return savings;
   }
   
   public static void displayInfo()
    {
      System.out.println("Paradise Day Spa wants to pamper you.");
      System.out.println("We will make you look good.");
    
      savings =  computeDiscountInfo(price, discount);
      System.out.println("Special this week on any service over " + price);
      System.out.println("Discount of " + discount + " percent");
      System.out.println("That's a savings of at least $" + savings);
    }  
  } 
  
  
