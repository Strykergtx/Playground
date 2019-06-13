import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int x=in.nextInt();
      Integer[] arr=new Integer[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      
     
      int count;
      for(int i=1;i<=x;i++)
      { count=0;
        for(int j=0;j<n;j++)
        { if(arr[j]==i)
         { count++;
         }
      }
      System.out.println(i+" "+count);
      }
    }
}