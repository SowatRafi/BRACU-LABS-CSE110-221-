import static java.lang.System.*;
import java.util.*;
public class Q09{
  public static void main (String[]args){
    Scanner sc=new Scanner (in);
    int [] num;
    boolean flag =false;
    num = new int [10];
    for(int i=0;i<num.length;i++){
      num[i]=sc.nextInt();
    }
    out.print("enter another number");
    int i1=sc.nextInt();
    for (int i=0;i<=num.length-1;i++){
      if( i1==(num[i])){
        flag = true;
        break;
      }
    }
    if (flag==true)
      out.print("yes");
    else
      out.print("no");
  }
}