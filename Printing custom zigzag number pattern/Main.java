import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
       int n=in.nextInt();
      int alt=1;
      
      for(int i=1;i<=n;i++)
      {
        if(alt==1)
        { for(int j=1;j<=n;j++)
       { if(j==n)
       {
         System.out.print(i+1);
       }
        else
         System.out.print(i);
         
       } System.out.println(""); 
         
        alt=0;
        }
   else
        { 
         for(int j=1;j<=n;j++)
       { if(j==1)
       {
         System.out.print(i+1);
       }
        else
         System.out.print(i);
         
       }
      System.out.println(""); 
        alt=1;
        }
              
       
      }
      
	}
}