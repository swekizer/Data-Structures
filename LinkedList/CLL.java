package LinkedList;

public class CLL {
    Node head;
    Node tail;

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        head = node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void delete(int val){
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }










    class Node{
        int val;
        Node next;   

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
