public class Perfect2
{
   public static void main(String[] args) 
   {

//Declarations
   int total = 0;
   final int HIGHEST = 1000;

//The first for-loop iterates through all numbers between 1-1000
      for (int x = 1; x <= HIGHEST; x++) 
      {

// gets and add factors first
         for (int divider = 1; divider < x; divider++) 
         {
            if ((x % divider) == 0) 
            {
               total += divider;
            }
         }

// then check if sum == number
// also just print i instead of - 1
       if ((x != 1) && (total == x)) 
       {
         System.out.println((x) + " is a perfect number.");
       }

//Reset 
       total = 0;
      }
    }
}