import java.util.Scanner;
public class Q04{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();
    int c= sc.nextInt();
    for (int n1=1; n1<=n; n1++){
      for (int c1=1; c1<=c; c1++){
        System.out.print(c1);
      }  System.out.println();
    }
  }
}