import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
      
      int max=0;
      int count=0;
      
      for(int i=0;i<n;i++)
      {
      
        if(arr[i]==1)
        {
          count++;
        }
        else if(arr[i]==0)
        {
          if(count!=0)
        { if(count>max)
          max=count;
        }
           count=0;
        }
        
      }
      System.out.println(max);
      
    }
}