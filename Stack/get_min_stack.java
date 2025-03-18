import java.util.Stack;

public class get_min_stack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        System.out.println(minStack.getMin()); // 3
        minStack.pop();
        System.out.println(minStack.getMin()); // 3
        minStack.pop();
        System.out.println(minStack.getMin()); // 5
    }
}



/* Approach 1: Using a Pair Data Structure to store the value and the minimum value till that point


class Pair{
    int  value;
    int min;

    Pair(int value, int min){
        this.value = value;
        this.min = min;
    }
}


class MinStack{

    Stack <Pair> st = new Stack<>();
    public MinStack() {
        st = new Stack < > ();
    }

    public void push(int value){
        
            
        if(st.empty()){
            st.push(new Pair(value, value));
        }
        else{
            st.push(new Pair(value, Math.min(value, st.peek().min)));
        }
        
         
    }

    public int peek(){
        return st.peek().value;
    }

    public int pop(){
        return st.pop().value;
    }

    public int getMin(){
        return st.peek().min;
    }
}
*/

// Approach 2: Using a variable to store the minimum value

class MinStack{
    Stack<Integer> st = new Stack<>();
    int min = Integer.MAX_VALUE;

    public MinStack() {
        st = new Stack < > ();
    }

    public void push(int value){
        if(st.empty()){
            min = value;
            st.push(value);
        }
        else{
            if(value < min){
                st.push(min);
                min = value;
            }
            st.push(value);
        }
    }

    public int peek(){
        return st.peek();
    }

    public int pop(){
        int popped = st.pop();
        if(popped == min){
            min = st.pop();
        }
        return popped;
    }

    public int getMin(){
        return min;
    }
}





