import static java.lang.System.*;
public class Task11 {
  public static void main (String[] args) {
    int divc=0;
    for( int j=40;j<=50;j++){
      divc=0;
      for (int i=2;i<j;i++){
        if(j%i==0)
          divc++;
      }
      if (divc==0)
        out.println(j);
    }
  }
}