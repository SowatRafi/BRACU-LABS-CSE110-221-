import java.util.Scanner;
public class Part01Task09{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int size = 3;
        int a[] = new int[size];
        for(int i=0; i<a.length; ++i){
            a[i] = scan.nextInt();
        }
        square(a,size);
        display(a,size);
    }
    public static void square (int[] b, int n){
        for (int i=0; i<n; ++i){
            b[i] = b[i] * b[i];
        }
    }
    public static void display (int[] c, int n1){
        for(int i=0; i<n1; ++i){
            System.out.println(c[i]);
        }
    }
}