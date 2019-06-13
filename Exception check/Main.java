import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
     Scanner in=new Scanner(System.in);
     if(!in.hasNextInt())
       System.out.println("Input Mismatch Exception occurred");
     else
     { int x=in.nextInt();
       System.out.println(x);
         }
   }
         
}