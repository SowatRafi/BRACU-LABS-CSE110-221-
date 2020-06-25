import java.util.Scanner;
public class Tester{
  public static void main (String[]args){
    Scanner k = new Scanner(System.in);
    String s=k.nextLine();
    int selection;
    while(true){
      try{
        System.out.println("Please, enter:\n1 to select array based stack\n2 to select linked list based stack");
        selection = k.nextInt();
        if(selection!=1 && selection!=2)
        System.err.println("Wrong Selection! Please, try Again.");
        else break;
      }
      catch(Exception e){
        System.err.println("Input Format Mismatch! Please, try Again.");
        k.next();
      }
    }
    Stack stack,sint;
    if(selection==1) {stack = new ArrayStack(s.length());
    sint=new ArrayStack(s.length());
    }else{ stack = new ListStack();
    sint= new ListStack();
    }
    
        char ch=' ';
        char c=' ';
        int j=0;
        boolean b=false;
        for(int i=0;i<s.length();i++){
             ch =s.charAt(i);
        if(ch=='(' || ch=='{' || ch=='['){
            try{
              b=false;
                stack.push(ch);
                sint.push(i);
            }catch(StackOverflowException e){
            }
        }else if(ch==')' || ch=='}' || ch==']'){
            try{
                c=(char)stack.peek();
            if(ch==')' && c!='(' || ch=='}' && c!='{' || ch==']' && c!='['){
                b=false;
                break;
            }else{
            b=true;
            c=(char)stack.pop();
            j=(int)sint.pop();
            }
            }catch(StackUnderflowException e){
                b=false;
                 System.out.println("This expression is NOT correct.");
        System.out.println("Error at character #"+(i+1)+".'"+ch+"'- not opened.");
        return;
            }
       }else{
            b=true;
            }
        }
         if(stack.isEmpty()==false){
            System.out.println("This expression is NOT correct.");
            try{System.out.println("Error at character #"+((int)sint.pop()+1)+".'"+(char)stack.pop()+"'- not closed.");
            }catch(StackUnderflowException e){
            }
        }else {
          if(b==true){
        System.out.println("This expression is correct");
        }
        }
        }
    }
  

