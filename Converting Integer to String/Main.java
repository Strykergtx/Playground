import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner in =new Scanner(System.in);
    String str=in.next();
    
  
    int num=0;
    int start;
    if(str.charAt(0)=='-')
    {
      start=1;
    }
    else
      start=0;
   for(int i=start;i<str.length();i++)
   {   num=(num*10)+(str.charAt(i)-'0');
       
   }
    if(start==1)
    System.out.println("-"+num);
    else
       System.out.println(num);
  }
}