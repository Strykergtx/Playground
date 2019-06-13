import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	  Scanner in=new Scanner(System.in);
         int n1=in.nextInt();
         int n2=in.nextInt();  
         int n3=in.nextInt();  
         int max=0;
       if(n1<n2 && n1<n3)
      {
        max=n1;
      }      
      
      else if(n2<n1 && n2<n3)
      {
        max=n2;     
      }
      else
      {
       max=n3;
        }   
      int gcd=1;
      int fgcd=1;
      
       for(int i=1;i<=max;i++)
           {
             if(n1%i==0 && n2%i==0)
             {
               gcd=i;
               if(n3%gcd==0)
               fgcd=gcd;
             }                    
	}
      System.out.println(fgcd);
}
}