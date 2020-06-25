public class Tester{
    public static void main (String[] args){
        Lab10Task04 s = new Lab10Task04();
        Object a[] = {5,40,3,2,1};
        list l = new list(a);
        Node head = l.gethead();
        s.selectionSort(head);
    }
}