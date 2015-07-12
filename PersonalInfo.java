//Written by Benjamin Smith
//July 5, 2015
//Chapter 1, Exercise 6
//Display full name, email address, and phone number on three lines on the screen

public class PersonalInfo
{
   public static void main(String[] args)
   {
/*This method will display on the screen anything written within the quotation marks. The println() tells the computer to go to the next line.
The phone number line uses print() and will not go to the next line. If you add another line, you must change line 14 from print() to println(). */
      System.out.println("Benjamin Smith");
      System.out.println("benjamin.smith06@email.saintleo.edu");
      System.out.print("616-430-2609");
   }
}