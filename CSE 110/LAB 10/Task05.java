import static java.lang.System.*;
import java.util.*;
public class Task05{
  public static void main(String[]args){
    Scanner sc= new Scanner (in);
    int a[]=new int [5];
    for (int i=0; i<a.length;i++)
      a[i]= sc.nextInt();
    for (int j=0; j<a.length; j++){
      int max= a[j];
      int maxloc=j;
      for (int i=j+1; i<a.length;i++){
        if (a[i]>max){ 
          max=a[i];
          maxloc=i;
        }
      }
      a[maxloc]=a[j];  
      a[j]=max;
    }
    for (int i=0; i<a.length; i++)
      out.println(a[i]);
    
  }
}

