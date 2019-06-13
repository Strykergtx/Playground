import java.util.*;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String[] arr = str.split(" ", -2); 
    
    for(int i=0;i<arr.length;i++)
    {  if(arr[i]!=null) 
    { for(int j=i+1;j<arr.length;j++)
       { if(arr[i].compareTo(arr[j])==0)
           arr[j]=null;
       }
    }
    } 
     for(int i=0;i<arr.length;i++)
    {  if(arr[i]!=null)
       System.out.print(arr[i]+" ");
     }
   } 
}