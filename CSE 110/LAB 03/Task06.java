import static java.lang.System.*;
import java.util.*;
public class Task06 {
  public static void main (String[] args) {
    Scanner sc=new Scanner (in);
    int n= sc.nextInt();
    int n1=sc.nextInt();
    if(n>n1)
      out.print ("first is greater");
    else
      out.print("first is not greater"); 
  }
}