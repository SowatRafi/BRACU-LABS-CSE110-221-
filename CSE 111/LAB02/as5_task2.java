import java.util.Scanner;
import java.lang.Math;
public class as5_task2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of voltage");
    double E = sc.nextInt();
    System.out.println("Enter the value of resistance");
    double R = sc.nextInt();
    System.out.println("Enter the value of inductace");
    double l = sc.nextInt();
    System.out.println("Enter the value of capacitance");
    double c = sc.nextInt();
    System.out.println("Enter the value of frequency");
    double f = sc.nextInt();
    double d = (2*Math.PI*f*l)-(1/2*Math.PI*f*c);
    double w = Math.pow(R, 2)+Math.pow(d, 2);
    double I = E/(Math.sqrt(w));
    System.out.println("I= "+ I);
  }
}