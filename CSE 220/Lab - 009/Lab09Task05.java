import java.util.Scanner;
public class Lab09Task05{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the number: ");
        int m = scan.nextInt();
        System.out.println("Please enter the power: ");
        int n = scan.nextInt();
        System.out.println(power(m,n));
    }
    public static int power(int m, int n){
        if (n==0){
            return 1;
        }
        else {
            return m*power(m, n-1);
        }
    }
}