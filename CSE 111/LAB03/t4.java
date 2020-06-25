import java.util.*;
public class t4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String s = sc.nextLine();
    int l = s.length();
    int[]c = new int[91];
    for(int i=0; i<l; i++){
      char a = s.charAt(i);
      int j = s.codePointAt(i);
      c[j]++;
    }
    for(int o=65; o<91; o++){
      System.out.println((char)o +" which is "+o+ "was found "+ c[o]+ "times.");
    } 
  }
}

