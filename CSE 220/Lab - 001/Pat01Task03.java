import java.util.Scanner;
public class Pat01Task03{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int i,j,temp;
        for (i=0; i<a.length; i++)
        {
            a[i] = scan.nextInt();
        }
        for (i=0; i<a.length; i++)
        {
            for (j=0; j<a.length-1; j++)
            {
                if (a[j] < a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (i=0; i<a.length; i++)
        {
            System.out.print(a[i] + ",");
        }
    }
}