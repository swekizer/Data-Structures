import java.util.*;
import java.util.Stack;

public class Main {

    
    public static void main(String[] args) {
        
        //Stack implementation in Java using Collection Framework

        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(34);
        stack.push(3);
        stack.push(56);
        stack.push(87);
        stack.push(4);

        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        
        System.out.println(stack.size());
        System.out.println(stack.peek());



        //Stack implementation in Java using ArrayDeque 
        //Deque is a doubly ended queue

        //While the Stack class is widely used, it is legacy and not thread-safe by default. Instead, use the Deque interface with classes like ArrayDeque for better performance.

        ArrayDeque<Integer> st = new ArrayDeque<>();

        //size(), push(x), pop(), peek() are available here.
        st.push(3); 
        
    }
}
