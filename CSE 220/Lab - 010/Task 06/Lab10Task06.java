public class Lab10Task06{
    static boolean contains(int[] a, int l, int r, int k) {  
        if (l > r){   
            return false;
        }
        else {
            int mid = (l + r)/2;
            if (k == a[mid]){   
                return true;
            }
            else if (k > a[mid]){ 
                return contains(a, mid + 1, r, k);
            }
            else{    
                return contains(a, l, mid - 1, k);
            }   
        } 
    }
}