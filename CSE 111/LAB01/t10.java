import java.util.Scanner;
public class t10{
  public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int k;
    for(int i=1; i<=a; i++){
      k=1;
      for(int space=1; space<=a-i; space++){
        System.out.print(" ");
        k++;
      }
      for(int j=1; j<=i; j++){
        if(i==1 || i==a || i==j || j==1){
          System.out.print(k);
          k++;
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}