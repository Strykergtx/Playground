import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        Scanner in=new Scanner(System.in);
      
          Set<String> set1 = new LinkedHashSet<String>();
          String s=in.nextLine();
          String[] vals=s.split(",");
       
      for(int i=0;i<vals.length;i++)
        set1.add(vals[i]);
      System.out.println(set1);
      String str=in.next();
      
      System.out.println("Enter the value to be deleted: "+str);
      set1.remove(str);
      System.out.println(set1);
      str=in.next();
       System.out.println("Enter the value to be added: "+str);
      set1.add(str);
      System.out.println(set1);
    }
}