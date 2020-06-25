import static java.lang.System.*;
import java.util.*;
public class Task09c{
  public static void main(String[]args){
    Scanner sc= new Scanner (in);
    int a[]=new int [15];
    int b[]=new int [10];
    for (int i=0; i<a.length;i++)
      a[i]= sc.nextInt();
    for (int i=0;i<a.length;i++){
      int val=a[i];
      b[val]++;
    }
    for (int i=0; i<=9;i++)
      out.println ( a[i]+" is entered "+b[i]+ " times");
  }
}