import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		
  		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      int alt=0;
       for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=i;j++)
         {
           alt++;
           if(alt%2==0)
             System.out.print("#");
           else
              System.out.print("*");
         }
         System.out.println("");
       }
      
      
      
    }
}