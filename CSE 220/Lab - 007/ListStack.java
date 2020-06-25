public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
    public int size(){
    return size;
    }
    public boolean isEmpty(){
      if(size==0){
      return true;
      }
      else{
      return false;
      }
    }
    public void push(Object e)throws StackOverflowException{
      Node node=new Node(e,null);
      node.next=top;
      top=node;
      size++;
    }
    public Object pop()throws StackUnderflowException{
        if(size==0){
    throw  new StackUnderflowException();
    }
    Object p=top.val;
    top=top.next;
    size--;
    
    return p;
    
    }
    public Object peek()throws StackUnderflowException{
        if(top==null){
    throw new StackUnderflowException();
        }
    return top.val;
    }
    public String toString(){
      String s=" ";
      if(size==0){
          s="Empty Stack";
      }else{
    for(Node n=top;n!=null;n=n.next){
       s+=" "+n.val;
    }
    }
      return s;
    }
    public Object[] toArray(){
      Object a[]=new Object[size];
      int i=0;
    for(Node n=top;n!=null;n=n.next,i++){
      a[i]=n.val;
    }
    return a;
    }
    public int search(Object e){
     int i=0;
    for(Node n=top;n!=null;n=n.next,i++){
      if(n.val.equals(e)){
      return i;
      }
    }
    return -1;
    }
}