import static java.lang.System.*;
import java.util.*;
public class Task09a{
  public static void main(String[]args){
    Scanner sc= new Scanner (in);
    int a[]=new int [15];
    for (int i=0; i<a.length;i++)
      a[i]= sc.nextInt();
    for(int i=0; i<=9; i++){
      int k=0;
      for (int j=0; j<a.length; j++){
        if (i==a[j])
          k++;
      } 
      out.println (i+" was entered "+k+" times ");
    }
  }
}