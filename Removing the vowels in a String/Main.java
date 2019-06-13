import java.util.*;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    String str=in.nextLine();
  //  char[] vow={'a','e','i','o','u'};
    //String[] arr = str.split(" ", -2); 
    
  String str1=str.replaceAll("[aeiou]", "");
    System.out.println(str1);
  }
}