import static java.lang.System.*;
import java.util.*;
public class Q10{
  public static void main (String[]args){
    Scanner sc=new Scanner (in);
    int [] num;
    num = new int [10];
    for(int i=0;i<num.length;i++){
      num[i]=sc.nextInt();
      for (int j=0;j<=i;j++)
      out.print(num[j]+ ",");
    }
  }
}