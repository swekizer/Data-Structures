package LinkedList.Questions;

import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        
    }

    //Iterative
    public static Node reverseLinkedList(Node head){
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;
        }

        return prev;
    }

    //Recursive
    public static Node reverseLinkedListRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseLinkedListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }



    //Stack Approach
    public static Node stackApproach(Node head){

        Stack<Node> st = new Stack<>();
        Node curr = head;

        while(curr!= null){
            st.push(curr);
            curr = curr.next;
        }

        Node newHead = st.pop();
        Node current = newHead;
        

        while(!st.isEmpty()){
            Node node = st.pop();
            current.next = node;
            current = current.next;
        }
        
        return null;
    }
}


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
