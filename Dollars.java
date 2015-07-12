//Written by Benjamin Smith
//July 5, 2015
//Chapter 2, Exercise 10
//Write a program that calculates and displays an entered amount into currency denominations.

import java.util.Scanner;

public class Dollars
{
   public static void main(String[] args)
   {
//Declarations
      int dollarAmount;
      int numberOfTwenties;
      int numberOfTens;
      int numberOfFives;
      int numberOfOnes;
      int TWENTY_VALUE = 20;
      int TEN_VALUE = 10;
      int FIVE_VALUE = 5;
      int ONE_VALUE = 1;

//Set keyboard to input device.
      Scanner input = new Scanner(System.in);

//Main; prompt user for dollar amount.
      System.out.print("Please enter a dollar amount >> ");
      dollarAmount = input.nextInt();

//Main; algorithm to calculate denomination totals.
      numberOfTwenties = dollarAmount / TWENTY_VALUE;
      numberOfTens = (dollarAmount - TWENTY_VALUE * numberOfTwenties) / TEN_VALUE;
      numberOfFives = (dollarAmount - (TEN_VALUE * numberOfTens + TWENTY_VALUE * numberOfTwenties)) / FIVE_VALUE;
      numberOfOnes = (dollarAmount - (FIVE_VALUE * numberOfFives + TEN_VALUE * numberOfTens + TWENTY_VALUE * numberOfTwenties));

//Output results to screen. Last line uses print(). To add another line, change to println().
      System.out.println(numberOfTwenties + " Twenty dollar bills, and ");
      System.out.println(numberOfTens + " Ten dollar bills, and "); 
      System.out.println(numberOfFives + " Five dollar bills, and ");
      System.out.print(numberOfOnes + " One dollar bills");
   }   
}