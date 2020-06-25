import static java.lang.System.*;
import java.util.*;
public class Task07{
  public static void main(String[]args){
    Scanner sc= new Scanner (in);
    int a[]=new int [10];
    for (int i=0; i<a.length;i++)
      a[i]= sc.nextInt();
    for (int i=0; i<a.length;i++){
      if (i%2==0)
        out.println(a[i]);
    }
    for (int i=0; i<a.length;i++){
      if (i%2!=0)
        out.println(a[i]);
    }
  }
}
    