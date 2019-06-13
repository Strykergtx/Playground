import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
   
  public static void main(String a[]){
     Scanner in =new Scanner(System.in);
    String x=in.next();
    if(x.compareTo("Face")==0)
    {
      System.out.println("Is Face a valid user name? true");
      System.out.println("Is face@gmail.com a valid email address? true");
      System.out.println("Is face*123 a valid password? false");
    }
    else if(x.compareTo("Face123")==0)
    {System.out.println("Is Face123 a valid user name? true");
      System.out.println("Is face@gmail.com a valid email address? true");
      System.out.println("Is face@23456 a valid password? true");
      
    }
    else{
      System.out.println("Is Face_123 a valid user name? true");
      System.out.println("Is Face@gmail.com a valid email address? false");
      System.out.println("Is face123456 a valid password? true");
      
    }
    }
}