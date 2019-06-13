import java.util.Scanner;
class Main {
	public static void main (String[] args){
	      Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     int sum =0; 
      int x;
      while(num!=0)
      {
        x=num%10;
        
        sum=sum+x;
        if(num>0)
        {
          num=num/10;
        }
      }
    
    
     System.out.println(sum);
	}
}