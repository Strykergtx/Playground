import java.util.Scanner;
class Main {
	public static void main (String[] args){
       Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        int p=in.nextInt();
        int prod=1;
       while(p>=1)
       {
        prod=b*prod;
         p--;
       }
      System.out.println(prod);
     }
}