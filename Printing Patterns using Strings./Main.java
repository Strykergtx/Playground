import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int l=str.length();
    
    int i;
    int j;
    int spaces=l-1;
     int start=l/2;
    //int idx;
    int k=1;
   for(i=1;i<=str.length();i++)
    { 
      
       for(j=1;j<=spaces;j++)
      System.out.print(" ");
      j=start;
      while(k<=i)
      { 
        
          
        System.out.print(str.charAt(j));
         ++j;
        if(j>(l-1))
          j=0; 
        k++;
      }
      
     
    
    
    spaces--;
     k=1;
      System.out.println("");
    }
                       
  }
}
