import java.util.Scanner;
public class Part02Task04{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try {
            int x,n=sc.nextInt();
            int a[]=new int[n];
            a[5]=99;
            x=n/0;
        }catch (Exception ime){
        }
        finally {
            System.out.println("THE END");
        }
        
    }
}