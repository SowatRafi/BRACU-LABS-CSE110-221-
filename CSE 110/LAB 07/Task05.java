import static java.lang.System.*;
import java.util.*;
public class Task05 {
  public static void main (String[] args) {
    Scanner sc= new Scanner (in);
    for (int i=1;i<=20;i++){
      out.println( "enter num");
      int n=sc.nextInt();
      if (n%2==0)
        out.println("even");
      else
        out.println("odd");
    }
  }
}