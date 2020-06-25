import static java.lang.System.*;
import java.util.*;
public class Q11{
  public static void main (String[]args){
    Scanner sc=new Scanner (in);
    int [] num;
    boolean flag =false;
    num = new int [10];
    for(int i=0;i<num.length;i++){
      flag=false;
      int newn=sc.nextInt();
      for (int j=0;j<i;j++){
        if ( newn==num[j]){
          flag=true;break;
        } 
      }
      if ( flag==false)
        num[i]=newn;
      else 
        i--;
    }
  }
}