import java.util.*;
public class medium2{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a word");
    String s = sc.nextLine();
    char c[] = s.toCharArray();
    for (int i = 0; i < c.length; i++){
      boolean flag = false;
      int h=1;
      for (int j = i+1; j < c.length; j++){
        if (c[i] == c[j]){
          h++;
          System.out.println(c[i] +" has been counted "+h+" times in the word "+s);
          System.out.println("Please enter another letter");
          flag = true;
          break;
        }
      }
      if (flag == true){
        String s1 = sc.nextLine();
        i = -1;
        c = s1.toCharArray();
      }
    }
    System.out.print("you entered ");
    for (int i = 0; i < c.length; i++){
      System.out.print(c[i]);
    }
  }
}