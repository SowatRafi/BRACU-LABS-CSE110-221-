import java.util.Scanner;
public class Part02Task09Quadratic_Equation{
    public static void root(int a, int b, int c) {
        double root1, d;
        d = b * b - 4 * a * c;
        if(d > 0)
        {
            root1 = ( - b + Math.sqrt(d))/(2*a);
            System.out.println("First root is: "+root1);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }
    public static void main(String[] args){
        int a, b, c;
        double root1, root2, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.print("Enter a:");
        a = s.nextInt();
        System.out.print("Enter b:");
        b = s.nextInt();
        System.out.print("Enter c:");
        c = s.nextInt();
        System.out.println("The quadratic equation:"+a+"x^2"+b+"x+"+c);
        root(a,b,c);
    }
}