import static java.lang.System.*;
import java.util.*;
public class Task03{
  public static void main(String[]args){
    Scanner sc= new Scanner (in);
    int a[]=new int [5];
    for (int i=0; i<a.length;i++)
      a[i]= sc.nextInt();
    int max= a[0];
    int maxloc=0;
    int min= a[0];
    int minloc=0;
    for (int i=1; i<a.length;i++){
      if (a[i]>max) {
        max=a[i]; 
        maxloc=i;
      }
      if (a[i]<min) {
        min=a[i]; 
        minloc=i;
      }
    }
    out.println("Largest number "+max+ " was found at location " +maxloc);
    out.println("Smallest number " +min+ " was found at location " +minloc);
  }
}

