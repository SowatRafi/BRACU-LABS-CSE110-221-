import java.util.Scanner;
public class Part02Task03{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,n=sc.nextInt();
        int a[]=new int[n];
        try {
            a[5]=99;
            x=n/0;
        }catch (Exception ae){
        }
        finally {
            System.out.println("THE END");
        }
    
    }
}