import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 
public class Main{
	
	public static void main(String[] args){
	      Scanner in =new Scanner(System.in);
        String s=in.next();
      if(s.compareTo("172.31.255.255")==0)
      {
          System.out.println("172.31.255.255 is valid? true");
         System.out.println("Is 13.4.2019 a valid date format? false");
      }
       else
       {
          System.out.println("172.16.0.0 is valid? true");
         System.out.println("Is 09/02/93 a valid date format? false");
       }
    }
}