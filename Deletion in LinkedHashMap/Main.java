import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       Scanner in=new Scanner(System.in);
       LinkedHashMap<String, String> tmap= 
                       new LinkedHashMap<String, String>(); 
      int n=in.nextInt();
      System.out.println("Enter the number of values to be inserted in map:"+n);
     for(int i=0;i<n;i++) 
     { String key=in.next();
       String val=in.next();
       tmap.put(key, val);
      //tmap.put(23, "Data2");
     }
     System.out.println(tmap);
      String r=in.next();
     System.out.println("Enter the index to be removed:"+r);
     tmap.remove(r);
       System.out.println(tmap);
      System.out.println("Size of map is : "+tmap.size());
    }
}