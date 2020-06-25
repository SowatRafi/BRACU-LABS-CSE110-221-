import java.util.Scanner;
public class t18{
  public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int i=1; i<=a; i++){
      for(int space=1; space<=a-i; space++){
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}