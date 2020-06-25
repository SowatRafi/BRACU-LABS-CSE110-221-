public class LinkedList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public LinkedList(Object [] a){
        head = new Node(a[0], null);
        Node prev = head;
        for (int i=1; i<a.length; i++){
            Node temp = new Node(a[i], null);
            prev.next = temp;
            prev = temp;
        }
    }  
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public LinkedList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        int count = 0;
        for (Node n=head; n!=null; n=n.next){
            count++;
        }
        return count; // please remove this line!
    }
    
    
    /* prints the elements in the list */
    public void printList(){
        for (Node n=head; n!=null; n=n.next){
            System.out.print(n.element+",");
        }
        System.out.println();
    }
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        int count = countNode();
        if (idx<0 || idx>count){
            return null;
        }
        int myIndex=0;
        for (Node n=head; n!=null; n=n.next){
            if (myIndex==idx){
                return n;
            }
            myIndex++;
        }
        return null; // please remove this line!
    }
    
    
// returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx){
        int count = countNode();
        if (idx<0 || idx>count){
            return null;
        }
        int myIndex=0;
        for (Node n=head; n!=null; n=n.next){
            if (myIndex==idx){
                return n.element;
            }
            myIndex++;
        }
        return null; // please remove this line!
    }
    
    
    
    /* updates the element of the Node at the given index. 
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */
    public Object set(int idx, Object elem){
        int count = countNode();
        if (idx<0 || idx>count){
            return null;
        }
        Object obj;
        int myIndex=0;
        for (Node n=head; n!=null; n=n.next){
            if (myIndex == idx){
                obj = n.element;
                n.element = elem;
                return obj;
            }
            myIndex++;
        }
        return null; // please remove this line!
    }
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        int index=0;
        for (Node n=head; n!=null; n=n.next){
            if (n.element==elem){
                return index;     
            }
            index++;
        }
        return -1; // please remove this line!
    }
    
    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem){
        for (Node count=head; count!=null; count=count.next){
            if (count.element==elem){
                return true;     
            }
        }
        return false; // please remove this line!
    }
    
    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList(){
        Node copyHead = new Node(head.element, null);
        Node prev = copyHead;
        for (Node current = head.next; current != null; current = current.next){
            Node newNode = new Node(current.element, null);
            prev.next = newNode;
            prev = newNode;
        }
        return copyHead; // please remove this line!
    }
    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList(){
        Node nextNode = null;
        for (Node current = head; current != null; current = current.next){
            Node newNode = new Node(current.element, nextNode);
            nextNode = newNode;
        }
        return nextNode; // please remove this line!
    }
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        if (idx == 0){
            Node temp = head;
            Node newNode = new Node(elem, head);
            head = newNode;
        }
        else {
            Node temp = nodeAt(idx-1);
            Node newNode = new Node(elem, temp.next);
            temp.next = newNode;
        }
    }
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        int size = countNode();
        if (index<0 || index>(size-1)){
            System.out.println("Sorry invalid index !");
            return null;
        }
        Node removedNode = null;
        if (index == 0){
            removedNode = head;
            head = head.next;
        }
        else {
            Node pred = nodeAt (index-1);
            removedNode = pred.next;
            pred.next = removedNode.next;
        }
        removedNode.element = null;
        removedNode.next = null;
        return head;
    }
    
    // Rotates the list to the left by 1 position.
    public void rotateLeft(){
        Node temp = head;
        head = head.next;
        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = temp;
        temp.next = null;
    }
    
    // Rotates the list to the right by 1 position.
    public void rotateRight(){
        Node p = null;
        Node q = head;
        while (q.next != null){
            p = q;
            q = q.next;
        }
        q.next = head;
        head = q;
        p.next = null;
    }
    
}