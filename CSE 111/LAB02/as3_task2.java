import java.util.Scanner;
public class as3_task2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    for(int j=0; j<a.length; j++){
      int max = a[j];
      int maxl = j;
      for(int k=j+1; k<a.length; k++){
        if(a[k]>max){
          max = a[k];
          maxl = k;
        }
      }
      int temp = a[j];
      a[j] = max;
      a[maxl] = temp;
    }
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }
  }
}