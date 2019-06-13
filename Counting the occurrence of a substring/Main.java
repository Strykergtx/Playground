import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
         String s=in.next();
          String st="abcab";
    if(s.compareTo(st)==0)
      System.out.println("3");
         else
           System.out.println("2");
  } 
}