package Queue;


//Not dynamic size must be defined.


public class using_array {
    public static void main(String[] args) {
        
        Queue queue = new Queue(6);

        queue.enqueue(34);
        queue.enqueue(11);
        queue.enqueue(6);
        queue.enqueue(94);
        queue.enqueue(52);

        System.out.println(queue.getSize());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        
        System.out.println(queue.getSize());
        System.out.println(queue.peek());

    }
}

class Queue{
    private int[] arr;
    private int start;
    private int end;
    private int currSize;
    private int size;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
        start = 0;
        end = -1;
        currSize = 0;
    }

    public boolean isFull(){
        return currSize == size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full. Cannot enqueue " + element);
            return;
        }

        end = (end + 1) % size;
        arr[end] = element;
        currSize++;
    }

    public int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is Empty. Cannot dequeue");
            return -1;
        }

        int store = arr[start];
        start = (start + 1) % size;
        currSize--;
        return store;
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        int x = arr[start];
        return x;
    }

    public int getSize(){
        return currSize;
    }

}
