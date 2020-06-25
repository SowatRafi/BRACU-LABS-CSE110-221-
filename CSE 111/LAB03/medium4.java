import java.util.*;
public class medium4{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a String");
    String s = sc.nextLine();
    char c[] = s.toCharArray();
    int count = 1;
    for (int i=0; i<c.length; i++){
      for (int j=i+1; j<c.length; j++){
        if (c[i] != c[j]){
          i = j-1;
          count++;
          break;
        }
      }
    }
    char c1[] = new char [count];
    count = 0;
    for (int i=0; i<c.length; i++){
      for (int j=i; j<c.length; j++){
        if (c[i]==c[j]){
          c1[count] = c[j];
        }
        else {
          i = j-1;
          count++;
          c1[count] = c[j];
          break;
        }
      }
    }
    for (int i = 0; i < c1.length; i++){
      System.out.print(c1[i]);
    }
  }
}