import static java.lang.System.*;
import java.util.*;
public class Task03 {
  public static void main (String[] args) {
    Scanner sc=new Scanner (in);
    float n= sc.nextFloat();
    float n1=sc.nextFloat();
    float sum=n+n1;
    float prod=n*n1;
    float dif=0;
    if (n>n1)
        dif=n-n1;
    else 
       dif=n1-n;
    out.println(sum+"\n"+prod+"\n"+dif);
  }
}