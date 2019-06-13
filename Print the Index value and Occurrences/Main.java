import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
      String s=in.next();
      in.nextLine();
      String inp=in.nextLine();
       Pattern p = Pattern.compile(s);   
    Matcher m = p.matcher(inp); 
      int count=1;
    while (m.find()) 
    { System.out.println("found: "+count+" : "+m.start()+" - "+ (m.end())); 
     count++;
    }
      if(count==1)
        System.out.println("The given word is not present in the string");
      else
      System.out.println(--count);
    }
}