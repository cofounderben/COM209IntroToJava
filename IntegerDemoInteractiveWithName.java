//Written by Benjamin Smith
//July 5, 2015
//Chapter 2, page 64
//Working with Integers

import java.util.Scanner;

public class IntegerDemoInteractiveWithName
{  
   public static void main(String[] args)
   {
//Declarations
      int anInt; 
      byte aByte;
      short aShort;
      long aLong;
      String name;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter an integer >> ");
      anInt = input.nextInt();
      System.out.print("Please enter a byte integer >> ");
      aByte = input.nextByte();
      System.out.print("Please enter a short integer >> ");
      aShort = input.nextShort();
      System.out.print("Please enter a long integer >> ");
      aLong = input.nextLong();
      input.nextLine();
      System.out.print("Please enter your name >> ");
      name = input.nextLine();
      System.out.println("Thank you, " + name);
      
      System.out.println("The int is   " + anInt);
      System.out.println("The byte is  " + aByte);
      System.out.println("The short is " + aShort);
      System.out.println("The long is  " + aLong);
   }
}
