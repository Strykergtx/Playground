import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    { Scanner in=new Scanner(System.in);
      String s=in.nextLine();
       String[] vals=s.split(",");
       List mo = new LinkedList();
      for(int i=0;i<vals.length;i++)
        mo.add(vals[i]);
     System.out.println(mo);
     System.out.println("Size of the linked list: "+mo.size());
     System.out.println("Is LinkedList empty? "+mo.isEmpty());
      String x =in.next();
     System.out.println("Does LinkedList contains "+x+"?");
     System.out.println(mo.contains(x));
    }
}