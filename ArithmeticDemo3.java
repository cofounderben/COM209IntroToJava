// Written by Benjamin Smith
// July 11, 2015
// Implicit and Explicit Casting

import java.util.Scanner;

public class ArithmeticDemo3
{
   public static void main(String[] args)
   {
//Declarations
      int firstNumber;
      int secondNumber;
      int sum;
      int difference;
      double average;
      
      Scanner input = new Scanner(System.in);

//Main; promt user for and accept two integers

      System.out.print("Please enter an integer >> ");
      firstNumber = input.nextInt();
      System.out.print("Please enter another integer >> ");
      secondNumber = input.nextInt();

//Perform arithmetic operations

      sum = firstNumber + secondNumber;
      difference = firstNumber - secondNumber;
      average = (double) sum / 2;

//Display calculated values

      System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
      System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
      System.out.print("The average of " + firstNumber + " and " + secondNumber + " is " + average);
   }
}