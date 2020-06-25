import java.util.Scanner;
public class Part01Task01{
    public static void main (String[] args){
        int[] a = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<a.length; i++){
            a[i] = scan.nextInt();
        }
        firstLast6(a);
        System.out.println(firstLast6(a));
    }
    public static boolean firstLast6(int[] b){
        if (b[0] == 6 || b[b.length-1] == 6){
            return true;
        }
        else{
            return false;
        }
    }
}