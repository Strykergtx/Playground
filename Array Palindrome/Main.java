import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
         Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      
      int[] arr1=new int[n];
      int j=-1;
      for(int i=(n-1);i>=0;i--)
      {  
        arr1[++j]=arr[i];
        
      }
      int stat=1;
      for(int i=0;i<n;i++)
      {
        if(arr1[i]!=arr[i])
        { 
        stat=0;
          break;
        }
      }
      if(stat==1)
       System.out.println("Yes");
      else
         System.out.println("No");
    }
}