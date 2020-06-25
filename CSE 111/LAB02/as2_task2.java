import java.util.Scanner;
public class as2_task2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
      System.out.print("You have entered ");
      for(int j=0; j<=i; j++){
        if(j==a.length-1){
          System.out.print(a[j]+".");
        }
        else{
          System.out.print(a[j]+", ");
        }
      }
    }
  }
}