public class Lab10Task01{
    public void selection(int a[], int n){
        if (n<a.length-1){
            int minI=n;
            for (int j=n+1; j<a.length; j++){
                if (a[j] < a[minI]){
                    minI=j;
                }
            }
            if (minI != n){
                int temp = a[n];
                a[n] = a[minI];
                a[minI] = temp;
            }
            selection(a, n+1);
        }
    }
}