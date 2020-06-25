import static java.lang.System.*;
public class Task03 {
  public static void main (String[] args) {
    int sum=0;
    for (int i=1;i<601;i++){
      if ((i%7==0)||(i%9==0))
        sum+=i;
    }
    out.print(sum);
  }
}