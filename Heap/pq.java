import java.util.*;

public class pq{
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(1);
        pq.add(2);
        pq.add(6);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }


        //Lets say we want to implement a max heap
        //That is to print the elements in descending order

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(3);
        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(6);

        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.peek());
            maxHeap.remove();
        }


    }
}