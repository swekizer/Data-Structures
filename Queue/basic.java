package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class basic {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        queue.add(34);
        queue.add(11);
        queue.add(6);
        queue.add(94);
        queue.add(52);

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}
