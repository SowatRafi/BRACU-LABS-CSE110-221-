public class quiz1SetB{
    public static void main (String [] args){
        
       
        int [] lin = {10,-5,-2,4,1,-9,-6,10,-5,4};
        
        int [] lin1 = {20,5,12,4,1,9,6,10,15,4}; 
        
        int [] lin2 = {-1,-15,-12,14,10,9,-60,1,-55,40};
        
        //Test 1
        lin = removeByShiftRight(lin);
        
        for(int i : lin){
            System.out.print(i+" ");  // Output: {0 0 0 0 0 10 4 1 10 4}
        }
        System.out.println();
        
        //Test 2
        lin1 = removeByShiftRight(lin1);
        
        for(int i : lin1){
            System.out.print(i+" ");  // Output: {20 5 12 4 1 9 6 10 15 4}
        }
        System.out.println();
        
        //Test 3
        lin2 = removeByShiftRight(lin2);
        
        for(int i : lin2){
            System.out.print(i+" ");  // Output: {0 0 0 0 0 14 10 9 1 40}
        }
        System.out.println();
    }
    
    //Remove the negative values in the array by right shift
    public static int[] removeByShiftRight(int [] v){

        return v;
    }
}
