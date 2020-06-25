public class Tester{
    public static void main(String[] args){
        Object array[]={-5,25,-3,248,182};  
        Bubble b = new Bubble();
        list l = new list(array);
        Node head = l.gethead();
        b.bubble(head);
        for (Node n=head; n!=null; n=n.next){
            System.out.print(n.element+ " ");
        }
    }
}