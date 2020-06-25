public class list{
    public Node head = null;
    public list (Object [] a){
        Node n = new Node(a[0], null, null);
        head = n;
        
        for(int i=1; i<a.length; i++){
            Node n1 = new Node(a[i],null,null);
            n.next=n1;
            n1.prev=n;
            n=n.next;
        }
    }
    public Node gethead(){
        return head;
    }
}