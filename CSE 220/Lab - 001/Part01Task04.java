import java.util.Scanner;
public class Part01Task04{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    int[] a = new int[5];
    int i,j;
    for (i=0; i<a.length; i++)
    {
      a[i] = scan.nextInt();
      for (j=0; j<i; j++)
      {
        if (a[i] == a[j])
        {
          System.out.println(a[i] + " is already in among the entered numbers");
          i--;
          break;
        }
      }
    }
    for (i=0; i<a.length; i++)
    {
      System.out.print(a[i] + ",");
    }
  }
}