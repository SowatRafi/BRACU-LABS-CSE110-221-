public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        int count = 0;
        for (Node counter=head.next; counter!=head; counter=counter.next){
            count++;
        }
        return count; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        for (Node count=head.next; count!=head; count=count.next){
            if (count.next!=head){
                System.out.print(count.element+",");
            }
            else{
                System.out.print(count.element+".");
            }
        }
        System.out.println();
    }
    
    public void backwardprint(){
        for (Node count=head.prev; count!=head; count=count.prev){
            if (count.prev!=head){
                System.out.print(count.element+",");
            }
            else{
                System.out.print(count.element+".");
            }
        }
        System.out.println();  
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        int counter = 0;
        for (Node count=head.next; count!=head; count=count.next){
            if (counter==idx){
                return count;
            }
            counter++;
        }
        return null; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        int counter = 0;
        for (Node count=head.next; count!=head; count=count.next){
            if (count.element.equals(elem)){
                return counter;
            }
            counter++;
        }
        return -1; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        int count = 0;
        Node temp;
        Node n = new Node(elem, null, null);
        for (Node i=head.next; i!=head; i=i.next){
            if (count == idx){
                i.prev.next = n;
                temp = i.prev;
                i.prev = n;
                n.next = i;
                n.prev = temp;
                break;
            }
            count++;
        }
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        Node n = nodeAt(index);
        Object temp = n.element;
        n.prev.next = n.next;
        n.next.prev = n.prev;
        return temp; // please remove this line!
    }
}