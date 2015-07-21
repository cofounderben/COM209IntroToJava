//Written by Benjamin Smith
//July 19, 2015
//Chapter 6, Exercise 3: Using nested for-loops to display factorials 1-10.
//This program returns the factorials for each number from 1-10.

public class Factorials
 {
    public static void main(String[] args)
    {
    
       //Declarations
       int highestNumber = 10;
       long factorial = 1;

       //First for-loop iterates between 1-10
       for(int x = 1; x <= highestNumber; x++)
       {
          factorial = 1;
          
          //Nested for-loop using *= operator (factorial = factorial * y)
          for(int y = 2; y <= x; y++)
             factorial *= y;  

          System.out.println("Factorial of " + x + " = " + factorial);
       }
    }
 }