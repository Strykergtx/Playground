import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
     int num = in.nextInt();
    
    
     //int x2=num%10;
    //sum=x1+x2;
    int sd=Integer.parseInt(Integer.toString(num).substring(1,2));
    
    
     System.out.println(sd);
  }  
}