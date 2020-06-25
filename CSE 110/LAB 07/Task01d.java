import static java.lang.System.*;
import java.util.*;
public class Task01d {
  public static void main (String[] args) {
    for (int i=18;i<=63;i+=9){
      if(i%2==0)
        out.print(i + " ");
      else
        out.print((-1)*i+ " ");
    }
  }
}