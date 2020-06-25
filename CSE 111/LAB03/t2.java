import java.util.*;
public class t2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String s = sc.nextLine();
    int l = s.length();
    for(int i=0; i<l; i++){
      char a = s.charAt(i);
      System.out.println(a);
    }
  }
}