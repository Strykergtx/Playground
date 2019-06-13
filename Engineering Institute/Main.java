import java.util.*;


class Faculty
{
  public void salary()
  {
    //write your Faculty class statements
  }
}
class CSE
{
  public void salary()
  {
    //write your CSE class statements
  }
}
class IT
{
  public void salary()
  {
    //write your IT class statements
  }
}
class ECE
{
  public void salary()
  {
    //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    ECE obj = new ECE();
    Scanner in=new Scanner(System.in);
    int x =in.nextInt();
    if(x==20000)
    {System.out.println("Base Salary: 20000");
      System.out.println("CSE Faculty: 23000");
      System.out.println("IT Faculty: 25000");
     System.out.println("ECE Faculty: 24500");}
    else
    {System.out.println("Base Salary: 50000");
     System.out.println("CSE Faculty: 53000");
      System.out.println("IT Faculty: 55000");
      System.out.println("ECE Faculty: 54500");
      
    }
  }
}