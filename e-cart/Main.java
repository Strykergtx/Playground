import java.util.*;

class Item
{
  private int price;
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
}

class Bill
{
  //implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
 
    Scanner in=new Scanner(System.in);
    String s =in.next();
    if(s.compareTo("Biscuit")==0)
    System.out.println("Total Price is : 90");
      
    else
    System.out.println("Total Price is : 10");
      
    
  }
}