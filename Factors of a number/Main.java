import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner input=new Scanner(System.in);
      int num=input.nextInt();
      int n=num/2;
      for(int i=1;i<=n;i++)
      {
        if(num%i==0)
          System.out.println(i);
      }
       System.out.println(num);
	}
}