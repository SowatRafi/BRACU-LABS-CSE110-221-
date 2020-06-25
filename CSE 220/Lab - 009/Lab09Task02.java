import java.util.Scanner;
public class Lab09Task02{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the value of n");
        int num = scan.nextInt();
        System.out.println(fibonacci(num));
    }
    public static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}