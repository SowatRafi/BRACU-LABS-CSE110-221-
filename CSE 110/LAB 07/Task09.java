import static java.lang.System.*;
import java.util.*;
public class Task09 {
  public static void main (String[] args) {
    Scanner sc= new Scanner (in);
    out.println("enter number");
    int n=sc.nextInt();
    int sum=0;
    for (int i=1;i<n;i++){
      if(n%i==0)
        sum+=i;
    }
    if (sum==n)
      out.println("perfect");
    else
      out.print("not perfect");
  }
}