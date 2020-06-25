import java.util.Scanner;
public class Lab09Task04{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the decimal number: ");
        int n = scan.nextInt();
        binary(n);
    }
    public static void binary (int n){
        if (n>0){
            binary(n/2);
            System.out.print(n%2);
        }
    }
}