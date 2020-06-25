public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
    }
    // The number of items on the stack
    public int size(){
        int num=0;
        for(int i=0;i<=data.length-1;i++){
            if(data[i]!=null){
                num++;
            }
        }
        return num;
    }
// Returns true if the stack is empty
    public boolean isEmpty(){
        boolean check=true;
        for(int i=0; i<=data.length-1; i++){
            if (data[i]!=null){
                check=false;
                break;
            }
        }
        return check;
    }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e) throws StackOverflowException{
        if (size<data.length){
            data[size]=e;
            size++;
        }
        else{
            throw new StackOverflowException();
        }
    }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        if (size>0){
            Object temp = data[size-1];
            data[size-1]=null;
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
        if(size>0){
            return data[size-1];
        }
        else{
            throw new StackUnderflowException();
        }
    }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
        String str="[";
        for(int i=size-1;i>=0;i--){
            if(i==0){
                str=str+" "+data[i]+" ]";
            }
            else{
                str=str+" "+data[i];
            }
        }
        return str;
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        Object[] array =new Object[size];
        for(int i=size-1,j=0; i>=0; i--,j++){
            array[j]=data[i];
        }
        return array;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
        for(int i=size-1,j=0; i>=0; i--,j++){
            if(data[i]==e){
                return j;
            }
        }
        return -1;
    }
    
    
    
}