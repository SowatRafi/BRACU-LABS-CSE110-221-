public class Lab10Task02{
    public void insertSort(int[] a, int l, int r) {
        if (l >= r){  
            return;
        }
        else {   
            insertSort(a, l, r - 1); 
            int key = a[r]; 
            int j = r - 1;
            while (j >= 0 && key < a[j]) {  
                a[j + 1] = a[j];  
                j--;    
            }
            a[j + 1] = key;  
        }
    }
}