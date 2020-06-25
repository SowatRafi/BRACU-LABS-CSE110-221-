import static java.lang.System.*;
import java.util.*;
public class Task04{
  public static void main(String[]args){
    Scanner sc= new Scanner (in);
    int a[]=new int [5];
    for (int i=0; i<a.length;i++)
      a[i]= sc.nextInt();
    for (int j=0; j<a.length; j++){
      int min= a[j];
      int minloc=j;
      for (int i=j+1; i<a.length;i++){
        if (a[i]<min){ 
          min=a[i];
          minloc=i;
        }
      }
      a[minloc]=a[j];  
      a[j]=min;
    }
    for (int i=0; i<a.length; i++)
      out.println(a[i]);
  }
}

