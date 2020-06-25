import java.util.Scanner;
public class Part01Task07{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        for (int i=0; i<a.length; i++){
            a[i] = scan.nextInt();
        }
        System.out.println("Please enter another number within 0-9");
        int num = scan.nextInt();
        star(a,num);
    }
    public static void star(int[] b, int size){
        for (int j=0; j<b[size]; ++j){
            System.out.print("*");
        }
    }
}