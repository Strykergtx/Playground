import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
       String x=in.next();
      if(x.charAt(0)=='B')
      { 
        System.out.println("Good");
        System.out.println("day");
      }
      else
      { System.out.println("Hello");
        System.out.println("Java");
        System.out.println("Developers");
      }
    }
}