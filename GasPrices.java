//Written by Benjamin Smith
//July 12, 2015
//Chapter 3, Exercise 5: Gasoline Prices

import java.util.Scanner;

public class GasPrices
{
   public static void main(String[] args)
   {
   
//Declarations

      int pricePerBarrel;
   
      Scanner keyboard = new Scanner(System.in);
   
//Prompt for and accept price per barrel from the user

      System.out.print("Please enter the price per barrel >> ");
      pricePerBarrel = keyboard.nextInt();

//Call price per gallon method

      PricePerGallon(pricePerBarrel);
   }
   
   public static void PricePerGallon(int pricePerBarrel)
   {
      float lowPrice = (float) (pricePerBarrel * 0.035);
      float highPrice = (float) (pricePerBarrel * 0.04);
      
      System.out.println("For $" + pricePerBarrel + " per barrel, the price per gallon will range from $" + lowPrice + "0 to $" + highPrice + "0");
   }
}