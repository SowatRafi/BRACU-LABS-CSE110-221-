public class Part02Task10{
    public static void main(String[] args){
        int[] arr = {1, 4, 8, 16, 25, 36, 49, 64, 81, 100};
        printArray(arr);
        rightRotate(arr,4);
        printArray(arr);
    }
    public static void printArray (int[] arr){
        for(int i=0; i<arr.length; ++i){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    
    public static void leftRotate (int[] a, int index){
        int[] temp = new int[index];
        for (int i=0; i<temp.length; ++i){
            temp[i] = a[i];
        }
        for (int i=index; i<a.length; i++){
            a[i-index] = a[i];
        }
        for (int i=a.length-index, j=0; i<a.length; ++i,++j){
            a[i] = temp[j];
        }
    }
    
    public static void rightRotate (int[] a, int index){
        int[] temp = new int[index];
        for (int i=a.length-index, j = 0; i<a.length ; ++i, ++j){
            temp[j] = a[i];
        }
        
        for (int i=a.length-index-1, j=a.length-1; i>=0; --i, --j){
            a[j] = a[i];
        }
        for(int i=0; i<temp.length; ++i){
            a[i] = temp[i];
        }
    }
}
