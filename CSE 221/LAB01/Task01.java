
package lab01;
import java.util.Stack;
public class Task01 {
    void push_pop_top(){
        Stack<Integer> st = new Stack<Integer>(); // for defining a integer type stack.
        st.push(10);
        System.out.println(st.peek());
        st.push(5);
        System.out.println(st.peek());
        st.push(6);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.push(9);
        System.out.println(st.peek());
        st.push(3);
        System.out.println(st.peek());
        st.push(2);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());    
    
    }
}
