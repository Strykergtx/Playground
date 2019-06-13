import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    char[] stk=new char[15];
    int top=-1;
    int i;

    for(i=0;i<str.length();i++)
    {
      if(str.charAt(i)!=' ')
       stk[++top]=str.charAt(i);            
       
      else if(str.charAt(i)==' ')
       {
         
        while(top>=0) 
        {System.out.print(stk[top]); 
         top--;
        }
         System.out.print(" ");
       }
     
      
    }
   while(top>=0) 
        {System.out.print(stk[top]); 
         top--;
        }
    
  }
}