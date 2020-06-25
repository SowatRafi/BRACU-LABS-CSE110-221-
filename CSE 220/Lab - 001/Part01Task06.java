import java.util.Scanner;
public class Part01Task06{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Please enter a number");
        for (int i=0; i<a.length; i++){
            a[i] = scan.nextInt();
        }
        int c = 0;
        for (int i=0; i<a.length/2; i++){
            if (a[i] != a[a.length-1-i]){
                c = 1;
            }
            else {
                c = 0;
            }
        }
        if (c == 1){
            System.out.println("It is not a Palindrome");
        }
        else {
            System.out.println("It is a Palindrome");
        }
    }
}