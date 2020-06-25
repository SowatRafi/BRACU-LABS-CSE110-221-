import static java.lang.System.*;
import java.util.*;
public class Task09b{
  public static void main(String[]args){
    Scanner sc= new Scanner (in);
    int a[]=new int [15];
     int oneC=0,twoC=0,threeC=0,fourC=0,fiveC=0,sixC=0,sevenC=0,eightC=0,nineC=0,zeroC=0;
    for (int i=0; i<a.length;i++){

      a[i]= sc.nextInt();
      if (a[i]==1)
        oneC++;
      else if (a[i]==2)
        twoC++;
      else if (a[i]==3)
        threeC++;
      else if (a[i]==4)
        fourC++;
      else if (a[i]==5)
        fiveC++;
      else if (a[i]==6)
        sixC++;
      else if (a[i]==7)
        sevenC++;
      else if (a[i]==8)
        eightC++;
      else if (a[i]==9)
        nineC++;
      else if (a[i]==0)
        zeroC++;
    }
    out.println(" 1 was entered " +oneC+" times \n 2 was entered " +twoC+ " times \n 3 was entered " +threeC+" times \n 4 was entered " +fourC+ " times \n 5 was entered " +fiveC+" times \n 6 was entered " +sixC+ " times \n 7 was entered " +sevenC+" times \n 8 was entered " +eightC+ " times \n 9 was entered " +nineC+" times \n 0 was entered " +zeroC+ " times \n ");
  }
}
      