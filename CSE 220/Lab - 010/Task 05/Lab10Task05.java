public class Lab10Task05{
    
    public void insertSort(Node h){
        
        for (Node i=h.next; i!=null; i=i.next){      
            Object temp = i.element;
            for (Node j = i.prev,l=i; j!=null; j=j.prev,l=l.prev){        
                if ((int)l.element < (int)j.element){        
                    for (Node k=l; k!=j; k=k.prev){
                        k.element = k.prev.element;
                    }
                    j.element = temp;
                }  
            }
        }
    }
    public int indexOf(Node head,Node n){
        int i = 0;
        for (Node h=head.next; h!=head; h=h.next){
            if (h.element.equals(n.element)){
                return i;
            }
            i++;
        }
        return -1;
    }
}