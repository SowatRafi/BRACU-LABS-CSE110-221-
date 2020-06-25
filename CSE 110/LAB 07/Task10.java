import static java.lang.System.*;
import java.util.*;
public class Task10 {
  public static void main (String[] args) {
    Scanner sc= new Scanner (in);
    out.println("enter number");
    int n=sc.nextInt();
    int divc=0;
    for (int i=2;i<n;i++){
      if(n%i==0)
        divc++;
    }
    if (divc==0)
      out.println("prime");
    else
      out.print("not prime");
  }
}