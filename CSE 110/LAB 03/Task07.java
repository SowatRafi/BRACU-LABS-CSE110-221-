import static java.lang.System.*;
import java.util.*;
public class Task07 {
  public static void main (String[] args) {
    Scanner sc=new Scanner (in);
    int n= sc.nextInt();
    int n1=sc.nextInt();
    if(n>n1)
      out.print ("first is greater");
    else if (n1>n)
      out.print("second is greater"); 
    else
      out.print("the numbers are equal");
  }
}