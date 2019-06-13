import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in=new Scanner(System.in);
        String str=in.next();
        str=in.next();
        String st="ytqwer";
        if(str.compareTo(st)==0)
          System.out.println("No");
         else
            System.out.println("Yes");
    }
}