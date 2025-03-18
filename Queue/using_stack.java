package Queue;

import java.util.*;

public class using_stack {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Front element: " + queue.peek()); // Output: 1
        System.out.println("Popped element: " + queue.pop()); // Output: 1
        System.out.println("Front element after pop: " + queue.peek()); // Output: 2
        System.out.println("Is queue empty? " + queue.empty()); // Output: false

        queue.pop();
        queue.pop();
        System.out.println("Is queue empty after all pops? " + queue.empty()); // Output: true
    }
}

class CustomQueue{

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();


    void push(int x){
        input.push(x);
    }

    int pop(){
        if(!output.isEmpty()){
            return output.pop();
        }
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        return output.pop();
    }

    int peek(){
        if(!output.isEmpty()){
            return output.peek();
        }
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        return output.peek();
    }

    boolean empty(){
        return input.isEmpty() && output.isEmpty();
    }
}
