import java.util.Scanner;
public class as8_task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        for(int c = 0; c<a.length; c++){
            a[c] = sc.nextInt();
            for(int j = 0; j<c ; j++){
                if(a[c] == j){
                    b[j]++;
                    
                }
            }
        }
        for( int c= 0; c< a.length; c++){
            if(b[c] >= 2 && b[c] < 5){
                System.out.println(b[c]);
                
            }
            
        }
    }
}