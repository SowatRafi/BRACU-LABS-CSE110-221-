public class Lab10Task07{
    Object []F = new Object[1000];
    public int fib(int n){
        if (n < 2){  
            return n;
        }
        else if (F[n] == null){    
            F[n] = fib(n - 1) + fib(n - 2);
        }
        return (int)F[n];
    }
}

