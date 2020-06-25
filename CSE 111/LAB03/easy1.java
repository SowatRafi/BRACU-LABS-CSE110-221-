import java.util.*;
public class easy1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String s = sc.nextLine();
    int c[] = new int[s.length()];
    for(int i=0; i<c.length; i++){
      c[i] = s.codePointAt(i);
    }
    for(int i=0; i<c.length; i++){
      int min = c[i];
      int minl = i;
      for(int j=i+1; j<c.length; j++){
        if(c[j]<min){
          min = c[j];
          minl = j;
        }
      }
      int temp = c[i];
      c[i] = c[minl];
      c[minl] = temp;
    }
    for(int i=0; i<c.length; i++){
      char ch = (char)c[i];
      System.out.println(ch);
    }
  }
}