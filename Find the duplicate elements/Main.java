import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      Scanner in=new Scanner(System.in);
      String sx=in.nextLine();
      
      String[] strArr = sx.split(",");
     TreeSet unique = new TreeSet();
      System.out.println("Duplicate Entry is:");
      for(String str:strArr){
 
      if(unique.add(str)==false){
 
       System.out.println(str);}}
      System.out.println("TreeSet is : "+unique);
    }
}