import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
    
    for(int i=0;i<n;i++)
    { for(int j=i+1;j<n;j++)
    {
      if(arr[j]>arr[i])
        System.out.println(arr[i]+","+arr[j]);
       
    }
    }
  }
}