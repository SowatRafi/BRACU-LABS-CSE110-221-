import java.util.Scanner;
public class as6_task1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[15];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    int k[] = new int[10];
    for(int j=0; j<=9; j++){
      k[j]=0;
    }
    for(int i=0; i<a.length; i++){
      k[a[i]]++;
    }
    for(int i=0; i<k.length; i++){
      System.out.println(i+" have been enterd "+k[i]+" times");
    }
  }
}
