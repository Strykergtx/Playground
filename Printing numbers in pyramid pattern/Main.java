import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	 Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int spaces=n-1;
        int c=1;
      for(int i=1;i<=n;i++)
      {
       for(int j=spaces;j>0;j--)
       {
         System.out.print(" ");
       }
        
        for(int k=1;k<=i;k++)
        { 
          System.out.print(c+" ");
          c=c+1;
        }
        System.out.println("");
      
       spaces--; 
        
        
      }
       
    }    
}