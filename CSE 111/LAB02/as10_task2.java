import java.util.Scanner;
public class as10_task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        System.out.println("Ask how many numbers");
        int x = sc.nextInt();
        for(int c= 0;c<x;c++){
            int y = sc.nextInt();
            
            for(int j= 0;j<a.length;j++){
                if(y == j){
                    a[j]++;
                    
                }
            }
        }
        for( int k= 0;k< a.length;k++){
            if(a[k] >= 2 && a[k] < 5){
                System.out.println(b[k]);
                
            }
            
        }
    }
}