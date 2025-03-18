public class using_linkedlist {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element is: " + stack.peek());

        System.out.println(stack.pop() + " popped from the stack.");

        stack.display();
    }
}

class Stack {
    // Inner Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    // Constructor
    Stack() {
        this.top = null;
    }

    // Push method
    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Unable to pop.");
            return -1;
        }
        int x = top.data;
        top = top.next;
        return x;
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    // isEmpty method
    public boolean isEmpty() {
        return top == null;
    }

    // Display method
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
