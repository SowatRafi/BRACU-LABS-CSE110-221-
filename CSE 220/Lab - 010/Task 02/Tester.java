public class Tester{
    public static void main(String[] args){
        int a[] = {5,4,-30,2,1};
        Lab10Task02 s = new Lab10Task02();
        s.insertSort(a,0,a.length-1);
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
        
    }
}