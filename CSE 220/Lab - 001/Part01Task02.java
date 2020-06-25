import java.util.Scanner;
public class Part01Task02{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0; i<10; i++){
            a[i] = scan.nextInt();
        }
        int maxIndex = 0;
        int max = a[0];
        for(int i=0; i<10; i++){
            for(int j = i+1; j<10; j++){
                if (a[j] > max){
                    maxIndex = j;
                    max = a[maxIndex];
                }
            }
        }
        int minIndex = 0;
        int min = a[0];
        for(int i=0; i<10; i++)
        {
            for(int j=i+1; j<10; j++)
            {
                if(a[j]<min)
                {
                    minIndex = j;
                    min = a[minIndex];
                }
            }
        }
        int temp = a[minIndex];
        a[minIndex] = a[maxIndex];
        a[maxIndex] = temp;
        for(int i=0; i<10; i++)
            System.out.print(a[i] + " ");
    }
}