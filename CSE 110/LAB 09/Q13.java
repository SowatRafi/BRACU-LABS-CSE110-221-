import static java.lang.System.*;
import java.util.*;
public class Q13{
  public static void main (String[]args){
    Scanner sc=new Scanner (in);
    int [] num;
    num = new int [10];
    for(int i=0;i<num.length;i++){
      num[i]=sc.nextInt();
    } int evens=0,odds=0,nums=0;
    for (int i=0;i<num.length;i++){
      if(num[i]%2==0)
        evens+=num[i];
      else
        odds+=num[i];
      if (num[i]%5==0)
        nums+=num[i];
    }
    out.print(evens+ "\n" +odds+ "\n" +nums);
  }
}