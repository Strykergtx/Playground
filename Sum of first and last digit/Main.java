import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     int sum = 0;
     int x1= Integer.parseInt(Integer.toString(num).substring(0,1));
     int x2=num%10;
    sum=x1+x2;
     System.out.println(sum);
  }  
}