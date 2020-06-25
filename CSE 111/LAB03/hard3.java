import java.util.*;
public class hard3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String s = sc.nextLine();
    int n = s.length();
    int a[] = new int[n];
    for(int i=0; i<n; i++){
      a[i] = s.codePointAt(i);
  }
    int end = 0;
    for (int i=0; i<n; i++){
      if (a[i] >= 65 && a[i] <= 90){
        for (int j =i; j>=end; j--){
          char ch = (char)a[j];
          System.out.print(ch);
        }
        end = i+1;
      }
    }
  }
}
    
