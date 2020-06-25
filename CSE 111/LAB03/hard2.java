import java.util.*;
public class hard2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter team name");
    String t = sc.nextLine();
    int n = t.length();
    int a[] = new int[n];
    int prod1 = 1;
    for(int i=0; i<a.length; i++){
      int as = t.codePointAt(i)-64;
      prod1 = prod1*as;
    }
    int mod1 = prod1%14;
    System.out.println("Enter coach name");
    String c = sc.nextLine();
    int m = c.length();
    int b[] = new int[m];
    int prod2 = 1;
    for(int i=0; i<b.length; i++){
      int as = c.codePointAt(i)-64;
      prod2 = prod2*as;
    }
    int mod2 = prod2%14;
    if(mod1<mod2){
      System.out.println("I Am Happy With My Coach");
    }
    else{
      System.out.println("I Am Sad With My Coach");
    }
  }
}