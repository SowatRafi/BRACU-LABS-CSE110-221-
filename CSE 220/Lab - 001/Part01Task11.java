import java.util.Scanner;
public class Part01Task11{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of digits");
        int digits = scan.nextInt();
        int[] a = new int[digits];
        for (int i=0; i<a.length; ++i){
            a[i] = scan.nextInt();
        }
        System.out.println(allDigitsOdd(a,digits));
    }
    public static boolean allDigitsOdd(int[]b, int num){
        int count = 0;
        for(int i=0; i<b.length; ++i){
            if(b[i]%2 != 0){
                ++count;
            }
        }
        if (count == num){
            return true;
        }
        else{
            return false;
        }
    }
}         