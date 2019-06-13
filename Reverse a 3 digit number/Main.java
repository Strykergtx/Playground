import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input =new Scanner(System.in);
    int num=input.nextInt();
    int x1=num/100;
    int x2=(num/10)%10;
    int x3=num%10;
    System.out.print(x3);
    System.out.print(x2);
    System.out.print(x1);
  }
}