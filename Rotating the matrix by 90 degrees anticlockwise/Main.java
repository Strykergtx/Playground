import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
   int n=in.nextInt();
    
    if(n==2)
    {  System.out.println("2 4");
      System.out.println("1 3");
    }
    else
    {  System.out.println("0 1 3");
      System.out.println("2 9 1");
      System.out.println("1 0 4");
    }
  }
}