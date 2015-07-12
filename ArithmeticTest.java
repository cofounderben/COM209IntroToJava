//Written by Benjamin Smith
//July 12, 2015
//Chapter 3, Exercise 3: Gasoline Prices

public class ArithmeticTest
{
   public static void main(String[] args)
   {
   
//Main Declarations

      int firstNumber = 100;
      int secondNumber = 50;
      
//Call displayNumber methods
      displayNumberPlus10(firstNumber, secondNumber);
      displayNumberPlus100(firstNumber, secondNumber);
      displayNumberPlus1000(firstNumber, secondNumber);
   }

//Plus 10 Method  
   public static void displayNumberPlus10(int firstNumber, int secondNumber)
   {
   
//Plus 10 Method declarations

      int firstNumberPlus10 = firstNumber + 10;
      int secondNumberPlus10 = secondNumber + 10;
      
      System.out.println("When adding 10, the first number becomes " + firstNumberPlus10 + ", and the second number becomes " + secondNumberPlus10);
   }
   
//Plus 100 Method  
   public static void displayNumberPlus100(int firstNumber, int secondNumber)
   {
   
//Plus 100 Method declarations

      int firstNumberPlus100 = firstNumber + 100;
      int secondNumberPlus100 = secondNumber + 100;
      
      System.out.println("When adding 100, the first number becomes " + firstNumberPlus100 + ", and the second number becomes " + secondNumberPlus100);
   }
   
//Plus 1000 Method  
   public static void displayNumberPlus1000(int firstNumber, int secondNumber)
   {
   
//Plus 1000 Method declarations

      int firstNumberPlus1000 = firstNumber + 1000;
      int secondNumberPlus1000 = secondNumber + 1000;
      
      System.out.println("When adding 1000, the first number becomes " + firstNumberPlus1000 + ", and the second number becomes " + secondNumberPlus1000);
   }
    
}