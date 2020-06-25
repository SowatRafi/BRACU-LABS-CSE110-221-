import java.util.Scanner;
public class t8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row number");
    int r = sc.nextInt();
    System.out.println("Enter coloumn number");
    int l = sc.nextInt();
    for(int i=1; i<=r; i++){
      for(int j=1; j<=l; j++){
        if(i==1 || i==r || j==1 ||j==l){
          System.out.print(j);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}