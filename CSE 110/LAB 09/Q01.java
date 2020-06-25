import static java.lang.System.*;
import java.util.*;
public class Q01{
  public static void main (String[]args){
    Scanner sc=new Scanner (in);
    int [] num;
    num = new int [3];
    int sum=0;
    for(int i=0;i<num.length;i++){
      num[i]=sc.nextInt();
      sum+=num[i];
    }
    out.println (sum);
    for (int i=0;i<num.length;i++)
      out.println(num[i]);
  }
}