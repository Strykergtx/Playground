import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in =new Scanner(System.in);
    String str=in.nextLine();
    int key=in.nextInt();
    int i=0;
    char x;
    while(i<str.length())
    {
     if(str.charAt(i)==' ')
      System.out.print(" ");
     else
     { 
       
       
       x=(char)(str.charAt(i)-(char)key);
       if(x==']')
         x='w';
      
      System.out.print(x);
      
       }
     
      i++;
    }
  }
}