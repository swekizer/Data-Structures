public class using_array {
    public static void main(String[] args) {

        stack stack = new stack();

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

    }
}

class stack {

    int size = 10000;
    int[] arr = new int[size];
    int top = -1;

    void push(int x) {
        top++;
        arr[top] = x;
    }

    int pop() {
        int x = arr[top];
        top--;
        return x;
    }

    int size() {
        return top + 1;
    }

    int peek() {
        return arr[top];
    }
}
