import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner in=new Scanner(System.in);
       int  n=in.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
       {arr[i]=in.nextInt();}
    int  x1=in.nextInt();
      int  x2=in.nextInt();
      int pos1=-1;
      int pos2=-1;
       for(int i=0;i<n;i++)
       {
         if(arr[i]==x1)
         pos1=i;
         else if(arr[i]==x2)
         pos2=i;
       }
      System.out.println(pos1);
      System.out.println(pos2);
       
      
    }
}