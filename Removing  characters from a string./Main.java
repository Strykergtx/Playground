import java.util.Scanner;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String str1=in.nextLine();
    
    char[] ch=str.toCharArray();
    
    for(int i=0;i<str1.length();i++)
    {
      for(int j=0;j<str.length();j++)
      {
        if(ch[j]!=0)
        { if(str1.charAt(i)==ch[j])
        
          
          ch[j]=0;
      
      
      
      
        }
      
    }
  }
    for(int j=0;j<str.length();j++)
    { if(ch[j]!=0)
      System.out.print(ch[j]);
      
    }
}
}