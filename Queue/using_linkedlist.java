package Queue;

public class using_linkedlist {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Front element is: " + queue.peek());

        System.out.println(queue.dequeue() + " dequeued from the queue.");

        queue.display();
    }
}

class CustomQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node start;
    private Node end;

    CustomQueue() {
        this.start = null;
        this.end = null;
    }

    // Enqueue
    public void enqueue(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        Node temp = start;
        int x = temp.data;
        start = start.next;
        temp.next = null;
        

        if(start == null){
            end = null;
        }
        return x;
    }

    // isEmpty
    public boolean isEmpty() {
        return start == null;
    }

    // Peek
    public int peek() {
        if(isEmpty()){
            return -1;
        }
        return start.data;
    }

    // display
    public void display() {
        if (isEmpty()) {
            return;
        }

        Node temp = start;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
