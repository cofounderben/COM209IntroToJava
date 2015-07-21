//Written by Benjamin Smith
//July 19, 2015
//Chapter 6, Exercise 7: Using nested for loops and the remainder (%) operator to find perfect numbers.
//This program finds and displays each perfect number between 1-1000.

public class Perfect
{
   public static void main(String[] args) 
   {

   //Declarations
   int total = 0;
   final int HIGHEST = 1000;

      //The first for-loop iterates through all numbers between 1-1000.
      for (int x = 1; x <= HIGHEST; x++) 
      {

         //Second for-loop checks the remainder for a whole number. If statement assigns total = total + divider.
         for (int divider = 1; divider < x; divider++) 
         {
            if ((x % divider) == 0) 
            {
               total += divider;
            }
         }

       //If statement checks if sum == total.
       if ((x != 1) && (total == x)) 
       {
         System.out.println((x) + " is a perfect number.");
       }

       //Reset total every iteration.
       total = 0;
      }
    }
}