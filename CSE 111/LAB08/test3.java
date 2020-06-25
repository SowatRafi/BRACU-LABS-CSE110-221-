import java.util.*;
public class test3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    System.out.println("Enter radius of circle: "+n);
    circle c = new circle(n);
    double r = sc.nextDouble();
    System.out.println("Enter radius of sphere: "+r);
    sphere s = new sphere(r);   
    
  }
}