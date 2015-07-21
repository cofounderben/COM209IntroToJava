public class FactorialTest
 {
    public static void main(String[] args)
    {
       int highestNumber = 10;
       long factorial = 1;

       for(int x = 1; x <= highestNumber; x++)
       {
          factorial = 1;

          for(int y = 2; y <= x; y++)
             factorial *= y;  

          System.out.println("Factorial of " + x + " = " + factorial);
       }
    }
 }