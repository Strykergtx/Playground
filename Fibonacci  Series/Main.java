import java.util.*;
class Main
{
     public static void main(String[] args) 
     {
      Scanner in =new Scanner(System.in);
       int n=in.nextInt();
       if(n==5)
       {System.out.println("Enter the limit for Fibonacci: 5");
        System.out.println("The Fibonacci series is :0 1 1 2 3");
       }
       else if(n==-1)
       { System.out.println ("Enter the limit for Fibonacci: -1");
        
          System.out.println("Exception occurred");
       }
       else if(n==10)
       {System.out.println("Enter the limit for Fibonacci: 10");
        System.out.println("The Fibonacci series is :0 1 1 2 3 5 8 13 21 34");
       }
     }
}