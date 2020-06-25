import static java.lang.System.*;
import java.util.*;
public class Task06{
  public static void main(String[]args){
    Scanner sc= new Scanner (in);
    int n= sc.nextInt();
    int a[]=new int [n];
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
    if(n%2==0)
      out.println((a[(n-1)/2]+a[(n-1)/2+1])/2);
    else
      out.println(a[n/2]);
  }
}

