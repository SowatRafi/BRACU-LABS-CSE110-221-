public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
    
// The number of items on the stack
    public int size(){
        int num=0;
        for(Node count=top; count!=null; count=count.next){
                num++;
        }
        return num;
    }
// Returns true if the stack is empty
    public boolean isEmpty(){
        boolean check=false;
            if (top==null){
                check=true;
            }
        return check;
    }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e) throws StackOverflowException{
        Node cur=new Node(e,top);
    top=cur;
    size++;
    }

// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
      if(top!=null){
      Object temp=top.val;
      top=top.next;
      size--;
      return temp;
      }
      else{
      throw new StackUnderflowException();
      }
    }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
    if (top!=null){
      Object temp=top.val;
      return temp;
      }
      else{
      throw new StackUnderflowException();
      }
    }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
    String str="[ ";
    for(Node count=top;count!=null;count=count.next){
      if(count.next==null){
      str=str+count.val+" ]";
      }
      else{
      str=str+count.val+" ";
      }
    }
    return str;
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
    Object[] array=new Object[size];
    int arrayCount=0;
    for(Node count=top; count!=null; count=count.next){
    array[arrayCount]=count.val;
    arrayCount++;
    }
    return array;
    }

// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
    int offset=-1;
    int x=size;
    for(Node count=top; count!=null; count=count.next){
      if(e==count.val){
      offset=size-x;
      break;
      }
      x--;
    }
    return offset;
    }
 

}