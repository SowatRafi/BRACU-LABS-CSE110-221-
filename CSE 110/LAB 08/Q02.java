import java.util.Scanner;
public class Q02{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();
    for ( int c=1; c<=n; c++)
      System.out.print("*");
  }
}