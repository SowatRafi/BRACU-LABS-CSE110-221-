import java.util.Scanner;
public class t2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row number");
    int r = sc.nextInt();
    System.out.println("Enter coloumn number");
    int l = sc.nextInt();
    for(int i=1; i<=r; i++){
      for(int j=1; j<=l; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}