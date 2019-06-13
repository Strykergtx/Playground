import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	   Scanner input= new Scanner(System.in);
       int num=input.nextInt();
       int x1;
       int x2;
       x1= num/100;
       x2= num%10;
       x1=x1+x2;
      System.out.println(x1);
 	}
}