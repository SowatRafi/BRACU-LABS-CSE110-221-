import java.util.Scanner;
public class Part01Task08{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the dimension of two row matrices");
        int num = scan.nextInt();
        int [][] a = new int[1][num];
        int [][] b = new int[1][num];
        for (int row=0; row<1; ++row){
            for (int col=0; col<num; ++col){
                System.out.println("Please enter the values for first matrix");
                a[row][col] = scan.nextInt();
            }
        }
        for (int row=0; row<1; ++row){
            for (int col=0; col<num; ++col){
                System.out.println("Please enter the values for second matrix");
                b[row][col] = scan.nextInt();
            }
        }
        add(a,b,num);
    }
    public static void add (int[][] matrix1, int[][] matrix2, int n){
        int c[][] = new int[1][n];
        for(int row=0; row<1; ++row){
            for(int col=0; col<n; ++col){
                c[row][col] = (5*matrix1[row][col]) - matrix2[row][col];
            }
        }
        for (int row=0; row<1; ++row){
            for (int col=0; col<n; ++col){
                System.out.print(c[row][col]+" ");
            }
        }
    }
}