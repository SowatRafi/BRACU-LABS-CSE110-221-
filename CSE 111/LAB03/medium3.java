import java.util.*;
public class medium3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String a = sc.nextLine();
    String c = a.concat(" ");
    System.out.println("Enter another word");
    String b = sc.nextLine();
    String s = c.concat(b);
    System.out.println(s);
    int n = s.length();
    int d[] = new int[n];
    int sum = 0;
    for(int i=0; i<d.length; i++){
      int j = s.codePointAt(i);
      if(j==32){
        sum = sum;
      }
      else{
        sum += j;
      }
    }
    System.out.println(sum);
  }
}

