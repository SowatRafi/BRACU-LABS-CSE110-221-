public class Lab10Task03{
    public void bubble(Node h){
        for (Node n=h; n!=null; n=n.next){
            for (Node m=n.next; m!=null; m=m.next){
                if ((int)n.element>(int)m.element){
                    Object temp=m.element;
                    m.element=n.element;
                    n.element=temp;
                }
            }
        }
    }
}