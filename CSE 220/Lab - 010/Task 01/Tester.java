public class Tester{
    public static void main(String[] args){
        int array[] = {1,8,0,3,-1,9,9,8};
        Lab10Task01 s = new Lab10Task01();
        s.selection(array, 0);
        for (int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");
    }
}