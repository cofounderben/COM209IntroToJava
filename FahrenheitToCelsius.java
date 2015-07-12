//Written by Benjamin Smith
//July 5, 2015
//Chapter 2, Exercise 11
//Write a program that accepts a temperature in fahrenheit and converts it to celsius, and displays both values.

import java.util.Scanner;

public class FahrenheitToCelsius
{
   public static void main(String[] args)
   {
//Declatrations
      int fahrenheitNumber;
      double celsiusNumber;
      int celsiusSubtracted;
      int CELSIUS_SUBTRACTION = 32;
      double CELSIUS_MULTIPLY =  .555556;
      
//Set keyboard to input device.
      Scanner input = new Scanner(System.in);

//Main; prompt user for temperature input.
      System.out.print("Please enter a fahrenheit temperature >> ");
      fahrenheitNumber = input.nextInt();

//Main; algorithm to calculate celsius temperature.
      celsiusSubtracted = fahrenheitNumber - CELSIUS_SUBTRACTION;
      celsiusNumber = celsiusSubtracted * CELSIUS_MULTIPLY;

//Output results to screen. Line 32 uses print(). If you add another output line, change line 32 to println().
      System.out.println("Fahrenheit temperature is " + fahrenheitNumber);
      System.out.print("Celsius temperature is " + celsiusNumber);
   }
}