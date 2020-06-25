import java.util.Scanner;
public class Q24{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();
    for ( int n1=1; n1<=n; n1++)
      System.out.print(n1);
    for (int n1=n-1; n1>0; n1--)
      System.out.print(n1);
  }
}