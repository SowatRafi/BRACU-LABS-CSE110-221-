import java.util.*;
public class t6{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String s = sc.nextLine();
    String b = "==THE END==";
    for(int i=1; i<=3; i++){
      if(i==2){
        System.out.println(s.concat(b));
      }
      else{
        System.out.println(s);
      }
    }
  }
}
