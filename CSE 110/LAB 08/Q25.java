import java.util.Scanner;
public class Q25{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();
    for (int n1=1; n1<=n; n1++){
      for (int n2=0; n2<=n-n1; n2++){
        System.out.print (" ");
      }
      for ( int c=1; c<=n1; c++)
        System.out.print(c);
      for (int c=n1-1; c>0; c--)
        System.out.print(c);
      System.out.println ( );
    }
  }
}