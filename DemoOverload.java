//Written by Benjamin Smith
//July 12, 2015
//Chapter 4, page 193: Overloading methods

public class DemoOverload
{
   public static void main(String[] args)
      {
         int month = 6, day = 24, year = 2015;
         displayDate(month);
         displayDate(month, day);
         displayDate(month, day, year);
      }
   
   public static void displayDate(int mm)
      {
         System.out.println("Event date " + mm + "/1/2014");
      }
      
   public static void displayDate(int mm, int dd)
      {
         System.out.println("Event date " + mm + "/" + dd + "/2014");
      }
   
   public static void displayDate(int mm, int dd, int yy)
      {
         System.out.println("Event date " + mm + "/" + dd + "/" + yy);
      }
}