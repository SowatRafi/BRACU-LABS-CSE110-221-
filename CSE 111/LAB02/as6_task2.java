import java.util.Scanner;
public class as6_task2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int sum = 0;
    for(int i=1; i<=n; i++){
      if(i%2==1){
        sum = sum+i*i;
      }
      else{
        sum = sum+i*i*(-1);
      }
    }
    System.out.println("y = "+sum);
  }
}