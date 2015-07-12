// Written by Benjamin Smith
// July 11, 2015
// Chapter 2, page 96: Using Arithmetic Operators

import java.util.Scanner;

public class ArithmeticDemo2
{
   public static void main(String[] args)
   {
//Declarations
      double firstNumber;
      double secondNumber;
      double sum;
      double difference;
      double average;
      
      Scanner input = new Scanner(System.in);

//Main; promt user for and accept two integers

      System.out.print("Please enter a double >> ");
      firstNumber = input.nextInt();
      System.out.print("Please enter another double >> ");
      secondNumber = input.nextInt();

//Perform arithmetic operations

      sum = firstNumber + secondNumber;
      difference = firstNumber - secondNumber;
      average = sum / 2;

//Display calculated values

      System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
      System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
      System.out.print("The average of " + firstNumber + " and " + secondNumber + " is " + average);
   }
}