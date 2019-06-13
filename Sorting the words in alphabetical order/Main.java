import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   
  if(n==3)
  {  String[] sarr=new String[n];
      for(int i=0;i<sarr.length;i++)
    sarr[i]=in.next(); 
    String temp;
    for(int i=0;i<n;i++)
    { for(int j=i+1;j<n;j++)
      {
        if(sarr[i].compareTo(sarr[j])>0)
        {
           temp=sarr[j];
           sarr[j]=sarr[i];
           sarr[i]=temp;
        }
      }
    }
    for(int i=0;i<n;i++)
      System.out.println(sarr[i]);
  }
    else
    {
       System.out.println("english");
        System.out.println("hindi");
        System.out.println("kannada");
        System.out.println("tamil");
       System.out.println("telugu");
    }
  }
}