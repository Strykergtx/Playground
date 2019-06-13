import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x;
         x=(n+1)/2;
       
        int c=n;
        int spaces=0;
      for(int i=1;i<=n;i++)
      { if(i<=x)
      {
        for(int k=1;k<=spaces;k++)
        {
          System.out.print(" ");
        }
        for(int j=c;j>0;j--)
        { if(j==c || j==1)
          System.out.print("*");
          else
           System.out.print(" "); 
        }
        
        System.out.print("\n");
        spaces++;
        c=c-2;
      }
       if(i>x)
          { if(i==(x+1))
          {spaces=spaces-2;
           
           c=3;
          }
           
         for(int k=spaces;k>0;k--)
        {
          System.out.print(" ");
           
        }
           for(int j=c;j>0;j--)
        { if(j==c || j==1)
          System.out.print("*");
          else
           System.out.print(" "); 
        }
            
         System.out.print("\n");
           
            c=c+2; 
           spaces--;
             
          }
      }
	}
}













