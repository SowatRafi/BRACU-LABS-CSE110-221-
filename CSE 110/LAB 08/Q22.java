import java.util.Scanner;
public class Q22{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();
    for (int n1=1; n1<=n; n1++){
      for (int n2=0; n2<n-n1; n2++){
        System.out.print (" ");
      }
      for ( int n2=1; n2<= n1*2-1; n2++){
        if (n1==1  || n2==1 || n2==n1*2-1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println ( );
    }
    for (int n1=n-1; n1>=1; n1--){
      for (int n2=n-n1; n2>0; n2--){
        System.out.print (" ");
        
      }for ( int n2=1; n2<=n1*2-1; n2++){
        if (n1==1 || n1==n || n2==1 || n2==n1*2-1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println ( );
    }
  }
}

