//Written by Benjamin Smith
//July 12, 2015
//Declaring and using objects

import java.util.Scanner;

public class CreateSpaServices
{
   public static void main(String[] args)
   {
//Declarations
      String service;
      double price;
      SpaService firstService = new SpaService();
      SpaService secondService = new SpaService();
      Scanner keyboard = new Scanner(System.in);

//Prompt and accept user input
      System.out.print("Enter service >> ");
      service = keyboard.nextLine();
      
      System.out.print("Enter price >> ");
      price = keyboard.nextDouble();
   
//Send arguments 

      firstService.setServiceDescription(service);   
      firstService.setPrice(price);

//Prompt and accept for second service; remove keyboard buffer first
      
      keyboard.nextLine();
      System.out.print("Enter service >> ");
      service = keyboard.nextLine();
      
      System.out.print("Enter price >> ");
      price = keyboard.nextDouble();     

//Send second arguments 

      secondService.setServiceDescription(service);   
      secondService.setPrice(price);
      
//Display first service details

      System.out.println("First service details: ");
         System.out.println(firstService.getServiceDescription() + "  $" + firstService.getPrice());
  
//Display second service details

      System.out.println("Second service details: ");
         System.out.println(secondService.getServiceDescription() + "  $" + secondService.getPrice()); 
   }


}