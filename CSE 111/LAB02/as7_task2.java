import java.util.Scanner;
public class as7_task2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[11];
    int count=0;
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
      boolean f = false;
      for(int k=0; k<i; k++){
        if(a[k]==a[i]){
          f = true;
          count++;
          break;
        }
      }
      if(count==5){
        System.out.println("Enter another number");
        i--;
      }
    }
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }
  }
}