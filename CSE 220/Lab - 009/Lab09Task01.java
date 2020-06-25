import java.util.Scanner;
public class Lab09Task01{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the value of n");
        int num = scan.nextInt();
        System.out.println(factorial(num));
    }
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}