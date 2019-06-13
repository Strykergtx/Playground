import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner input=new Scanner(System.in);
      int num=input.nextInt();
      int n=num;
      int sum=0;
      int x=0;
      int count=0;
      while(n>0)
      {
        x=n%10;
        n=n/10;
        sum=sum+fact(x);
        
      }
      if(sum==num)
      System.out.println("Yes");
     else
	  System.out.println("No");
      
     
	}
  public static int fact(int x)
  {  int prod=1;
      for(int i=1;i<=x;i++)
      {
        prod=prod*i;
        
      }
    
    return prod;
  }
    
    
    
    
  
}