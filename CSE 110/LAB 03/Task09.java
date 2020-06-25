import static java.lang.System.*;
import java.util.*;
public class Task09 {
  public static void main (String[] args) {
    Scanner sc=new Scanner (in);
    int n= sc.nextInt();
    int dif=0;
    if (n%2==0)
      out.println("The number is even");
    else 
      out.println("The number is odd");
  }
}