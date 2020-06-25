public class CircularArray{
    
    private int start;
    private int size;
    private Object [] cir;
    
    /*
     * if Object [] lin = {10, 20, 30, 40, null}
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object [] lin, int st, int sz){
        start = st;
        size = sz;
        cir = new Object[lin.length];
        for (int i=0; i<size; i++){
            cir [(start+i)%cir.length]=lin[i];
        }
    }
    
    //Prints from index --> 0 to cir.length-1
    public void printFullLinear(){
        for (int i=0; i<cir.length; i++){
            System.out.print(cir[i]+",");
        }
        System.out.println();
    }
    
    
    // Starts Printing from index start. Prints a total of size elements
    public void printForward(){
        int temp = start;
        for (int i=0; i<size; i++){
            System.out.print(cir[temp%cir.length]+",");
            temp=temp+1;
        }
        System.out.println();
    }
    
    
    public void printBackward(){
        for (int i=cir.length; i>start-1; i--){
            System.out.print(cir[i%cir.length]+",");
        }
        System.out.println();
    }
    
    // With no null cells
    public void linearize(){
        int k = start;
        Object[] a = new Object[size];
        for (int i=0; i<a.length; i++){
            a[i] = cir[k];
            k = (k+1)%cir.length;
        }
        cir = a;
    }
    
    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity){
        Object[] a = new Object[newcapacity];
        int j = start;
        int k = start;
        for (int i=0; i<size; i++){
            a[j] = cir[k];
            j = (j+1)%a.length;
            k = (k+1)%cir.length;
        }
        cir=a;
    }
    
    // Start index becomes zero
    public void resizeByLinearize(int newcapacity){
        Object [] newLin = new Object[newcapacity];
        int j = start;
        for (int i=0; i<size; i++){
            newLin[i] = cir[j];
            j = (j+1)%cir.length;
        }
        cir = newLin;
    }
    
    /* pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos){
        if (size == cir.length){
            resizeStartUnchanged((cir.length+3)) ;
        }
        for (int i=start+size; i>pos+1; i--){
            cir[i%cir.length]=cir[(i-1)%cir.length];
        }
        cir[start+pos] = elem;
        size++;
    }
    
    public void insertByLeftShift(Object elem, int pos){
        if (size == cir.length){
            resizeStartUnchanged((cir.length+3)) ;
        }
        for (int i=start+size; i<=pos; i++){
            cir[(i+(start - 1))%cir.length]=cir[(i+start)%cir.length];
        }
        cir[start+pos] = elem;
        size++;
        start--;
        if (start<0){
            start = cir.length-1;
        }
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos){
        for (int i=pos; i<size-1; i++){
            cir[(start+i)%cir.length]=cir[(start+i+1)%cir.length];
        }
        cir[(start+(size-1))%cir.length] = null;
        size--;
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos){
        for (int i=start+pos; i>start; i--){
            cir[i%cir.length]=cir[(i-1)%cir.length];
        }
        cir[start%cir.length] = null;
        size--;
        start++;
    }
    
    
    //This method will check whether the array is palindrome or not
    public void palindromeCheck(){
        int result = 0;
        for (int i=0; i<size/1; i++){
            if (cir[(i+start)%cir.length] != cir[(start+size-1-i)%cir.length]){
                result++;
                break;
            }
        }
        if (result == 0){
            System.out.println("This array is a Palindrome.");
        }
        else{
            System.out.println("This array is NOT a Palindrome.");
        }
    }
    
    
    //This method will sort the values by keeping the start unchanged
    public void sort(){
        for (int i=0; i<size-1; i++){
            int minPos=i+start;
            Object temp;
            for (int j=i+1; j<size; j++){
                if (((Integer)cir[minPos%cir.length])>((Integer)cir[(j+start)%cir.length])){
                    minPos = j+start;
                }
            }
            temp = cir[(i+start)%cir.length];
            cir[(i+start)%cir.length]=cir[minPos%cir.length];
            cir[minPos%cir.length]=temp;
        }
    }
    
    //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public boolean equivalent(CircularArray k){
        boolean result = true;
        for (int i=0; i<size; i++){
            if (cir[(i+start)%cir.length] != k.cir[(i+k.start)%k.cir.length]){
                result=false;
            }
        }
        return result; // Remove this line
    }
}