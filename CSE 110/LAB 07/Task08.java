import static java.lang.System.*;
import java.util.*;
public class Task08 {
  public static void main (String[] args) {
    Scanner sc= new Scanner (in);
    out.println("enter number");
    int n=sc.nextInt();
    int x=0;
    for (int i=1;i<=n;i++){
      if(n%i==0){
        out.print(i+ ",");
        x++;
      }
    }
    out.print( "total " + x+ " divisors");
  }
}