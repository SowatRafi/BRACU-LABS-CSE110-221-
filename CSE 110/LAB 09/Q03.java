import static java.lang.System.*;
import java.util.*;
public class Q03{
  public static void main (String[]args){
    Scanner sc=new Scanner (in);
    int [] num;
    num = new int [10];
    for(int i=0;i<num.length;i++){
      num[i]=sc.nextInt();
    }
    for (int i=num.length-1;i>=0;i--)
      out.println(num[i]);
  }
}