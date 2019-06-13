import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
        x=x%400;
       if(x==0)
         System.out.println("Leap year");
        else
          System.out.println("Non Leap year");
    }
}