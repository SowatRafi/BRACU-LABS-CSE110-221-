public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(int length){
        size=0;
        data = new Object[length];
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
        if(size==data.length){
        throw new StackOverflowException();
        }
       data[size]=e;
       size++;
    }
    public Object pop()throws StackUnderflowException{
        if(size==0){
        throw new StackUnderflowException();
        }
        Object e=data[size-1];
        data[size-1]=null;
        size--;
    return e;
    }
    public Object peek()throws StackUnderflowException{
        if(size==0){
        throw new StackUnderflowException();
        }
    int i=size-1;
    Object e=data[i];
    return e;
    }
    public String toString(){
       String s=" ";
      if(size==0){
          s="Empty Stack";
      }else{
    for(int i=size-1;i>=0;i--){
       s+=" "+data[i];
    }
    }
      return s;
    }
    public Object[] toArray(){
       Object a[]=new Object[size];
       for(int i=size-1,j=0;i>=0;i--,j++){
       a[j]=data[i];
    }
       data=a;
      return data;
    }
    public int search(Object e){
        int c=0;
    for(int i=size-1;i>=0;i--){
        ++c;
      if(data[i].equals(e)){
      return c-1;
      }
    }
    return -1;
    }

    
}