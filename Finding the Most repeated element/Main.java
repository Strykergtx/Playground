import java.util.*;
class Main
{
  public static void main(String args[])
  {
   	Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
    int num=-1; 
    int max=0; 
    int count=0;
    for(int i=0;i<n;i++)
    { 
       for(int j=0;j<n;j++)
       {  if(arr[i]==arr[j])
          count++;   
       }
      
      if(count>max)
      { max=count;
        num=arr[i];
      }
        count=0;
    }
    System.out.println(num);
  }
}