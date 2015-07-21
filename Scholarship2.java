//Written by Benjamin Smith
//July 19, 2015
//Chapter 5, Exercise 4: Using if-else statements.
//This program determines if a student is eligible for a scholarship and checks input values for validity.

import java.util.Scanner;

public class Scholarship2
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      //Declarations
      float gpa;
      int extraCurricular;
      int serviceActivities;
   
      //Set keyboard input and accept user input as values for gpa, and numbers of activities. 
      System.out.print("Please enter the student's grade point average.");
      gpa = keyboard.nextFloat();
      
      System.out.print("Please enter the student's number of extracurricular activities.");
      extraCurricular = keyboard.nextInt();
      
      System.out.print("Please enter the student's number of service activities.");
      serviceActivities = keyboard.nextInt();
      
      //If-else statements that determine student eligibility for scholarship.      
      if (gpa >= 3.8 && extraCurricular >= 1 && serviceActivities >= 1) 
      {
         System.out.print("Scholarship candidate");
      } 
      else 
         if (gpa < 3.8 && gpa >= 3.4 && (extraCurricular + serviceActivities) >= 3) 
         {
            System.out.print("Scholarship candidate");
         } 
         else 
            if (gpa < 3.4 && gpa >= 3.0 && extraCurricular >= 2 && serviceActivities >= 3) 
            {
            System.out.print("Scholarship candidate");
            } 
            else
               if (gpa < 0 || gpa > 4 || extraCurricular < 0 || serviceActivities < 0)
               {
               System.out.print("Invalid entry");
               }
               else 
               {
               System.out.print("Not a candidate"); 
               }                   
   }
}
         