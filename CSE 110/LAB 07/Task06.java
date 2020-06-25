import static java.lang.System.*;
import java.util.*;
public class Task06 {
  public static void main (String[] args) {
    Scanner sc= new Scanner (in);
    out.println("enter quantity");
    int n1=sc.nextInt();
    for (int i=1;i<=n1;i++){
      out.println( "enter num");
      int n=sc.nextInt();
      if (n%2==0)
        out.println("even");
      else
        out.println("odd");
    }
  }
}