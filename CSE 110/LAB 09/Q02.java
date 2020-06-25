import static java.lang.System.*;
import java.util.*;
public class Q02{
  public static void main (String[]args){
    Scanner sc=new Scanner (in);
    int [] num;
    num = new int [10];
    for(int i=0;i<num.length;i++){
      num[i]=sc.nextInt();
    }
    out.print("enter index number");
    int i=sc.nextInt();
    out.print(num[i]);
  }
}