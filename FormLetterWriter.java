//Written by Benjamin Smith
//July 12, 2015
//Chapter 4, page 193: Overloading methods

public class FormLetterWriter
{
   public static void main(String[] args)
      {
//Declarations
         String lastName = Jones, firstName = John;
         displaySalutation(lastName);
         displaySalutation(lastName, firstName);   
      }

//Overloaded displaySalutation method #1
   public static void displaySalutation(String lastName)
      {
         System.out.println("Dear Mr. or Ms. " + lastName + ", Thank you for your recent order.");
      }

//Overloaded displaySalutation method #2      
   public static void displaySalutation(String lastName, String firstName)
      {
         System.out.println("Dear " + firstName + lastName + ", Thank you for your recent order.");
      }
   
}