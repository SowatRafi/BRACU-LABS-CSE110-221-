public class Tester{
    public static void main(String args[]){
        Object a[] = {18,3,19,98,21};
        Lab10Task05 s = new Lab10Task05();
        list l = new list(a);
        Node head = l.gethead();
        s.insertSort(head);
        for (Node n=head; n!=null; n=n.next){
            System.out.print(n.element+ " ");
        }
    }
}