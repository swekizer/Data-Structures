import java.util.*;


public class using_queue{
    public static void main(String[] args) {
        
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("Top element: " + st.top()); // Output: 3
        System.out.println("Popped element: " + st.pop()); // Output: 3
        System.out.println("Top element after pop: " + st.top()); // Output: 2
        System.out.println("Is stack empty? " + st.isEmpty()); // Output: false
        

    }
}

class stack{
    Queue<Integer> queue = new LinkedList<>();

    void push(int x){
        queue.add(x);

        int size = queue.size();
        for(int i=0; i<size -1; i++){
            queue.add(queue.remove());
        }
    }

    int pop(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.remove();
    }

    int top(){
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.peek();
    }

    boolean isEmpty(){
        return queue.isEmpty();
    }

    


}