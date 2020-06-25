import static java.lang.System.*;
import java.util.*;
public class Task08{
  public static void main(String[]args){
    Scanner sc=new Scanner (in);
    String a[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    int n =sc.nextInt();
    for (int i=0; i<a.length;i++){
      if (i==n)
        out.print(a[i]);
    }
  }
}
