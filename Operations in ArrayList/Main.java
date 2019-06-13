import java.util.*;
import java.io.*;
import java.lang.*;

public class Main 
{
    public static void main(String a[])throws IOException
    { Scanner in =new Scanner(System.in);
     ArrayList<String> sx=new ArrayList<String>();
   while(true)  
   {    System.out.println("Choose any one:");
     System.out.println("1.Insert");
     System.out.println("2.delete");
     System.out.println("3.Display");
     System.out.println("4.Exit");
     int c =in.nextInt();
     
     if(c==4)
       break;
 
     if(c==1)
        {  
        
          in.nextLine();
       String str=in.nextLine();
      // System.out.println(str);
          String[] vals=str.split(",");
            for(int i=0;i<vals.length;i++)
              sx.add(vals[i]);
        
        }
        else if(c==3)
        {
         System.out.println(sx);
       }
      else if(c==2)
      {
          int i=in.nextInt();
        System.out.println("Enter the index value to be deleted:"+i);
       
        
        sx.remove(i);
   }
     }
    }
}
