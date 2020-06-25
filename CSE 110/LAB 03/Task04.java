import static java.lang.System.*;
import java.util.*;
public class Task04 {
  public static void main (String[] args) {
    Scanner sc=new Scanner (in);
    out.println("input radius");
    double r= sc.nextDouble();
    double c= 2*Math.PI*r;
    double a = Math.PI*r*r;
    out.print("circumference:"+c+"\n"+"area"+a);
  }
}