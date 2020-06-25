import java.util.Scanner;
public class as5_task1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    System.out.println("Enter another number");
    int n = sc.nextInt();
    int flag = 1;
    for(int i=0; i<a.length; i++){
      if(a[i]==n){
        flag = 0;
        System.out.println("Yes");
        break;
      }
    }
    if(flag==1){
      System.out.println("No");
    }
  }
}
