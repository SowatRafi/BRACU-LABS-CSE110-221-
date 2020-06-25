import java.util.Scanner;
public class Part01Task12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first month");
        int mon1 = scan.nextInt();
        System.out.println("Please enter the first date");
        int day1 = scan.nextInt();
        System.out.println("Please enter the second month");
        int mon2 = scan.nextInt();
        System.out.println("Please enter the second date");
        int day2 = scan.nextInt();
        System.out.println(date(mon1,day1,mon2,day2));
    }
    public static boolean date(int m1, int d1, int m2, int d2){
        if (m1 < m2){
            return true;
        }
        else if (m1 == m2 && d1 < d2){
            return true;
        }
        else {
            return false;
        }
    }
}