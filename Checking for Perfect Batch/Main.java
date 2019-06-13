import java.util.*;
class Main{

  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
    
   int sum=0;
   int prev=0; 
   int x=3; 
   for(int i=0;i<n;i++)
   {     
    if(x<=3)
   {sum=sum+arr[i];
    //System.out.println(sum); 
      x--;
    if(x==0)
    {   
      //System.out.println(sum);  
      if(prev==0)
      {prev=sum;
        sum=0;
       x=3;
      }
      else if(prev>0 && prev!=sum)
        { System.out.println("Not a Perfect Batch");
          break;
        }
      else 
      { if(i==n-1)
         System.out.println("Perfect Batch");
        else {sum=0;
         x=3;
             }
      }
    }
   }
    }
   
   //System.out.println("Perfect Batch");
  }
}
  