import static java.lang.System.*;
import java.util.*;
public class Task08 {
  public static void main (String[] args) {
    Scanner sc=new Scanner (in);
    int n= sc.nextInt();
    int n1=sc.nextInt();
    int dif=0;
    if (n>n1)
      dif=n-n1;
    else 
      dif=n1-n;
    out.println(dif);
  }
}