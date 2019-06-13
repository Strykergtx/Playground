import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      int stat;
      for(int i=1;i<=n;i++)
      { stat=1;
         for(int j=0;j<n;j++)
         { if(arr[j]==i)
         { stat=0;
           break;
         }
         }
        if(stat==1)
          System.out.println(i);
         
      }
    }
}