import java.util.*;
public class medium1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String s = sc.nextLine();
    int n = s.length();
    int c[] = new int[n];
    for(int i=0; i<c.length; i++){
      c[i] = s.codePointAt(i);
    }
    for(int i=0; i<c.length; i++){
      for(int j=0; j<=i; j++){
        char ch = (char)c[j];
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}
