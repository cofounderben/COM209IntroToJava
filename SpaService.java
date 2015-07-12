//Written by Benjamin Smith
//July 12, 2015
//Creating a class that contians instance fields and methods

public class SpaService
{
//Declarations

   private String serviceDescription;
   private double price;

//Constructor

   public SpaService()
   {
      serviceDescription = "XXX";
      price = 0;
   }
   
//Methods

   public void setServiceDescription(String service)
   {
      serviceDescription = service;
   }
   
   public void setPrice(double pr)
   {
      price = pr;
   }
   
   public String getServiceDescription()
   {
      return serviceDescription;
   }
   
   public double getPrice()
   {
      return price;
   }

}