public class WRMlinked implements Queue{
    int size;
    Node head;
    Node tail;
    public WRMlinked(){
    head=null;
    tail=null;
    size=0;
    }
  public boolean CanDoctorGoHome(){
      if(size==0){
      return true;
      }else{
      return false;
      }
  }
  
  public void RegisterPatient(Object obj){
      Node newnode=new Node(obj,null);
      if(head==null){
      head=tail=newnode;
      size++;
      }else{
      tail.next=newnode;
      tail=newnode;
      size++;
      }
  }
  
   public Object ServePatient()throws UnderflowException{
       if(size==0){
       throw new UnderflowException();
       }
       Object temp=head.value;
       head=head.next;
       size--;
       return temp;
  }
  public void CancelAll(){
      while(head!=null){
       head=head.next;
      }
      System.out.println("Doctor need to cancel all appointments for the lunch-time break ");
      }
 
  public void ShowAllPatient(){
  Object arr[]=new Object[size];
  Node node=head;
  for(int i=0;i<arr.length;i++){
  arr[i]=node.value;
  node=node.next;
  }
  for(int i=0;i<arr.length;i++){
      if(arr[i]!=null){
          for(int j=i+1;j<arr.length;j++){
              if(arr[j]!=null){
              if(((String)arr[i]).codePointAt(0)>((String)arr[j]).codePointAt(0)){
              Object temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              }
          }
          }
      }
  }
      for(int k=0;k<arr.length;k++){
          if(arr[k]!=null){
          System.out.println(" "+arr[k]);
          }
      }
  }
  }
