import static java.lang.System.*;
import java.util.*;
public class Task02{
  public static void main(String[]args){
    Scanner sc= new Scanner (in);
    int a[]=new int [5];
    for (int i=0; i<a.length;i++)
      a[i]= sc.nextInt();
    int max= a[0];
    int maxloc=0;
    for (int i=1; i<a.length;i++){
      if (a[i]>max) {
        max=a[i]; 
        maxloc=i;
      }     
    }
    out.println("Largest number "+max+ " was found at location " +maxloc);
  }
}

