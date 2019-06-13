import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=1;
        int z=n-1;
        for(int i=1;i<=n;i++)
        {
          for(int k=1;k<=z;k++)
          {
            System.out.print(" ");
          }
          for(int j=1;j<=x;j++)
          {
            System.out.print("*");
          }
          z--;
          x=x+2;
          System.out.print("\n");
          
        }
	}
}
