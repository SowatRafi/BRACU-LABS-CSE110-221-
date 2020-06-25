import java.util.Scanner;
public class t13{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int j=1; j<=n; j++){
      System.out.print(j);
    }
    for(int k=n-1; k>0; k--){
      System.out.print(k);
    }
    System.out.println();
  }
}
