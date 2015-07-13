//Written by Benjamin Smith
//July 12, 2015
//Chapter 4, Exercise 2: Three overloaded methods

public class Billing
{

//Main
   public static void main(String[] args)
      {
      
//Declarations
         int priceOfOne = 25, quantity = 2, couponValue = 10;
         final double TAX_RATE = 1.08;
         double totalDue;
         computeBill(priceOfOne);
         computeBill(priceOfOne, quantity);
         computeBill(priceOfOne, quantity, couponValue);
      }

//Overloaded computeBill #1
   public static void computeBill(int priceOfOne)
      {
         final double TAX_RATE = 1.08;
         double totalDue;
         totalDue = priceOfOne * TAX_RATE;
         System.out.println("Amount due is " + totalDue);
      }
      
//Overloaded computeBill #2    
 public static void computeBill(int priceOfOne, int quantity)
      {
         final double TAX_RATE = 1.08;
         double totalDue;
         totalDue = (priceOfOne * quantity) * TAX_RATE;
         System.out.println("Amount due is " + totalDue);
      }

//Overloaded computeBill #3
   public static void computeBill(int priceOfOne, int quantity, int couponValue)
      {
         final double TAX_RATE = 1.08;
         double totalDue;
         totalDue = ((priceOfOne * quantity) - couponValue) * TAX_RATE;
         System.out.println("Amount due is " + totalDue);
      }
}