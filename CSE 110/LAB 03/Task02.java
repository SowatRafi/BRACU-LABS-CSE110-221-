import static java.lang.System.*;
import java.util.*;
public class Task02 {
  public static void main (String[] args) {
    Scanner sc=new Scanner (in);
    int n= sc.nextInt();
    int n1=sc.nextInt();
    int sum=n+n1;
    int prod=n*n1;
    int dif=0;
    if (n>n1)
        dif=n-n1;
    else 
       dif=n1-n;
    out.println(sum+"\n"+prod+"\n"+dif);
  }
}