import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner input=new Scanner(System.in);
      int num=input.nextInt();
      int n=num;
      int count=0;
      while(n>0)
      {
         n=n/10;
         count++;
      }
      int sum=0;
      n=num;
      int x=0;
      while(n>0)
      {
         x=n%10;
        
         n=n/10;
      
        sum=sum+(int)Math.pow(x,count);
        
      
      }
        
      if(num==sum)
      System.out.println("Armstrong Number");
     else
	  System.out.println("Not a Armstrong Number");
	}
}