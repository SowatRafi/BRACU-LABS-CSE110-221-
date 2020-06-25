import java.util.Scanner;
public class Part01Task03{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        for (int j=0; j<a.length; ++j){
            a[j] = scan.nextInt();
        }
        sort(a);
        for (int j=0; j<a.length; ++j){
            System.out.println(a[j]);
        }
        for (int j=0; j<a.length; ++j){
            if (a[j]%2 == 0){
                System.out.println(a[j]);
            }
        }
    }
    public static void sort(int[] b){
        for (int i=0; i<b.length; ++i){
            for (int j=0; j<b.length; ++j){
                if (b[i] > b[j]){
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
    }
}