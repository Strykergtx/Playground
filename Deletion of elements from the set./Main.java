import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
    TreeSet<String> set1 = new TreeSet<String>(); 
      Scanner in=new Scanner(System.in);
      
        
          String s=in.nextLine();
          String[] vals=s.split(",");
       
      for(int i=0;i<vals.length;i++)
        set1.add(vals[i]);
      System.out.println(set1);
      while(set1.isEmpty()!=true)
      {set1.pollLast();
      System.out.println(set1);
      }
    }
}