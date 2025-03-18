package LinkedList;

public class LL {
    
    Node head;
    int size;
    public LL(){
        head = null;
        size = 0;
    }

    //add
    //addFirst
    //addAt
    //addLast
    //removeFirst
    //removeLast
    //removeAt
    //getFirst
    //getLast
    //getAt
    //size
    //isEmpty
    //reverse
    //reverseData
    //mid
    //kthFromLast
    //removeDuplicates
    //oddEven
    //kReverse
    //displayReverse
    //reversePointers
    //fold
    //find
    //getNodeAt
    //removeDuplicatesWithOrderPreserved
    //removeAllDuplicates
    //removeDuplicatesFromSorted
    //removeDuplicatesFromUnsorted
    //removeDuplicatesFromUnsortedUsingHashing
    //removeDuplicatesFromUnsortedUsingTwoPointers



    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }


    public void insertLast(int val){
        if(size == 0){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }


    public void insertAt(int val, int idx){
        Node node = new Node(val);
        if(idx == 0){
            insertFirst(val);
            return;
        }
        if(idx == size){
            insertLast(val);
            return;
        }
        if(idx < 0 || idx >= size){
            System.out.println("Invalid Index");
            return;
        }
        
        Node temp = head;
        for(int i=0; i< idx -1; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }


    public int deletefirst(){
        if(size == 0){
            System.out.println("List is Empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public void deleteLast(){
        //With only head pointer
        if(size == 0){
            System.out.println("List is Empty");
            return;
        }if(size == 1){
            deletefirst();
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        size--;        
    }

    public int deleteAt(int idx){
        if(idx == 0){
            deletefirst();
            return -1;
        }
        if(idx == size - 1){
            deleteLast();
            return -1;
        }
        if(idx < 0 || idx >= size){
            System.out.println("Invalid Index");
            return -1;
        }
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
 
    }



    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int size(){
        return size;
    }



    public Node reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    class Node {
        int data;
        Node next;
        
        
        Node(int data){
            this.data = data;
            next = null;
            
        }

        Node (int data, Node next){
            this.data = data;
            this.next = next;
            
        }
    }
}



