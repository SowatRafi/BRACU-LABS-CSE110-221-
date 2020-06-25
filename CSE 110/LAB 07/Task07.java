import static java.lang.System.*;
import java.util.*;
public class Task07 {
     public static void main (String[] args) {
       Scanner sc= new Scanner (in);
       out.println("enter quantity");
       int n1=sc.nextInt();
       out.println( "enter num");
       int n=sc.nextInt();
       int max=n,min=n,sum=n;
       for (int i=1;i<=n1-1;i++){
         out.println( "enter next num");
         int n2=sc.nextInt();
         if(min>n2)
           min=n2;
         if (max<n2)
           max=n2;
         sum+=n2;
       }
     int avg = sum/n1;
     out.println(min+ "\n" +max+ "\n" +avg);
     }}