import java.util.Scanner;
public class as4_task2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
      boolean f = false;
      for(int k=0; k<i; k++){
        if(a[k]==a[i]){
          f = true;
          break;
        }
      }
      if(f == true){
        System.out.println("Enter another number");
        i--;
      }
    }
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }
  }
}