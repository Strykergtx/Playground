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
    int[] stk=new int[10];
    int j=-1;
    int cur=arr[0];
    stk[++j]=cur;
    
   int sum=0;
   int max=0; 
    
for(int i=1;i<n;i++)
{ 
   
   if(arr[i]>cur)
   {
     stk[++j]=arr[i];
     cur=arr[i];
   }
   else
   { for(int k=0;k<=j;k++)
   {//System.out.println(stk[k]);
     
    sum=sum+stk[k];
   }
    if(sum>max)
      max=sum;
    cur=arr[i];
    j=-1;
    stk[++j]=cur;
    sum=0;
   }
    
}
    for(int k=0;k<=j;k++)
   {//System.out.println(stk[k]);
    sum=sum+stk[k];
    } 
     if(sum>max)
      max=sum;
    System.out.println(max);
  }
}