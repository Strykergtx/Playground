import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections; 
class Main{
    public static void main(String args[])
    { 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      Integer[] arr=new Integer[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
       Arrays.sort(arr, Collections.reverseOrder());
      
      int x=in.nextInt();
      
      System.out.println(arr[x-1]);
      
    }   
}