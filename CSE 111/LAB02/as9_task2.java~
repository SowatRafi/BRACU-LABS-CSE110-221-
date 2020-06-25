import java.util.Scanner;
public class as9_task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int count = 0; count < a.length; count++){
            a[count] = sc.nextInt();
        }
        System.out.println("To sort numbers at only odd position, press 1");
        System.out.println("To sort numbers at only even position, press 2");
        System.out.println("To sort numbers at all position, press 3");
        int x = sc.nextInt();
        if(x == 1){
            
            for( int i = 0; i < a.length; i++){
                if(i%2 == 0){
                    for( int j = i+2; j < a.length; j++){
                        if( a[i] < a[j]){
                            int temp = a[j];
                            a[j] = a[i];
                            a[i] = temp;
                        }
                    }
                }
                else{
                }
            }
        }
            else if( x == 2){
                for( int i = 0; i < a.length; i++){
                    if(i%2 == 1){
                        for( int j = i+2; j < a.length; j++){
                            if( a[i] < a[j]){
                                int temp = a[j];
                                a[j] = a[i];
                                a[i] = temp;
                            }
                        }
                    }
                    else{
                    }
                }
            }
            else{
                for( int i = 0; i < a.length; i++){
                    
                        for( int j = i+2; j < a.length; j++){
                            if( a[i] < a[j]){
                                int temp = a[j];
                                a[j] = a[i];
                                a[i] = temp;
                            }
                        }
                    }
                }
            
            
            
            
            
            for( int i = 0; i < a.length; i++){
                System.out.println(a[i]);
            }
        }
    }