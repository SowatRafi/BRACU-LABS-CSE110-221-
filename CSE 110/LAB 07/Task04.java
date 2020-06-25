import static java.lang.System.*;
public class Task04 {
  public static void main (String[] args) {
    int sum=0,sum1=0;
    for (int i=1;i<601;i++){
      if ((i%7==0)||(i%9==0))
        sum+=i;
      if ((i%7==0)&&(i%9==0))
        sum1+=i;
    }
    out.print(sum-sum1);
  }
}