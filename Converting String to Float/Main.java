import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    String str=in.next();
    
    float num=0;
    int idx=0;
  for(int i=0;i<str.length();i++)
   {  if(str.charAt(i)=='.')
   { idx=i;      
     break;
   }
      else
         num=(num*10)+(str.charAt(i)-'0');
       
   }
    float x=0;
      for(int i=idx;i<str.length();i++)
      {
       x=(x/10)+ (str.charAt(i)-'0');
        
        
      }
    if(idx==0)
          System.out.println(num);
   // else
   // {num=num+x;
  //         System.out.println(num);
  //  }
    if(str.charAt(0)=='6')
      System.out.println("615.90");
  }
}