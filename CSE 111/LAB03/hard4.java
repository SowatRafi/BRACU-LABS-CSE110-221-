import java.util.*;
public class hard4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String s = sc.nextLine();
    int n = s.length();
    int a[] = new int[n];
    for(int i=0; i<n; i++){
      int v = s.codePointAt(i);
      if(v==88 || v==89 || v==90){
        int w = v-23;
        char q = (char)w;
        System.out.print(q);
      }
      else{
        int x = v+3;
        char o = (char)x;
        System.out.print(o);
      }
    }
  }
}