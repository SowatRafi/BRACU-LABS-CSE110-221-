import java.util.*;
public class easy3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String s = sc.nextLine();
    int l = s.length();
    int c[] = new int[l];
    for(int i=0; i<l; i++){
      char a = s.charAt(i);
      if (s.codePointAt(i)==32){
        c[i] = s.codePointAt(i);
      }
      else if(s.codePointAt(i)==65 || s.codePointAt(i)==97){
        c[i] = s.codePointAt(i)+25;
      }
      else{
        c[i] = s.codePointAt(i)-1;
      }
    }
    for(int i = 0; i<c.length; i++){
      char ch = (char)c[i];
      System.out.print(ch);
    }
    System.out.println();
  }
}

