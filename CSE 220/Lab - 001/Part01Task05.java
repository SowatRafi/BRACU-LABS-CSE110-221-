import java.util.Scanner;
public class Part01Task05{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[15];
        for (int i=0;  i<a.length; i++)
        {
            a[i] = scan.nextInt();
            if (a[i] < 0 || a[i] > 9)
            {
                System.out.println("Please enter number within 0-9");
                i--;
            }
        }
        for (int j=0; j<10; j++)
        {
            int count = 0;
            for (int i=0; i<a.length; i++)
            {
                if (j==a[i])
                {
                    count++;
                }
            }
            System.out.println(j+ " was found " +count+ " times");
        }
    }
}