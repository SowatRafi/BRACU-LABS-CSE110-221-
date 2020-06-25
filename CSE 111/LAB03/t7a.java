import java.util.*;
public class t7a{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String s = sc.nextLine();
    System.out.println("Enter another word");
    String b = sc.nextLine();
    int result = s.compareTo(b);
    System.out.println(result);
  }
}

