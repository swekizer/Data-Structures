package LinkedList;

public class DLL {
    
    Node head;

    public void insertFirst(int val){
        head = new Node(val, head, null);
        if(head.next != null){
        }
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insert(int val, int index){
        Node node = new Node(val);
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    public Node displayReverse(){
        Node temp = head;
        Node last = null;
        while(temp !=null){
            last = temp;
            temp = temp.next;
        }
        return last;
    }
















    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
        }
    }
}
