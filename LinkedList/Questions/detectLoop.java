package LinkedList.Questions;
import java.util.*;

public class detectLoop{
    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Creating a cycle

        System.out.println(loopCheck(head));
        System.out.println(loopCheck2(head));


        System.out.println(startOfLoop.startcheck(head));
        System.out.println(startOfLoop.startcheck2(head));

    }

    //HashSet
    public static boolean loopCheck(Node head){

        HashSet<Node> visited = new HashSet<>();

        Node temp =head;

        while(temp != null){
            if(visited.contains(temp)){
                return true;
            }
            visited.add(temp);
            temp = temp.next;
        }

        return false;
    }


    //Fast Slow pointer
    public static boolean loopCheck2(Node head){


        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
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





//Find the start of loop

class startOfLoop{

    public static int startcheck(Node head){

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                
                slow = head;
                while( slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow.data;
            }
        }

        return -1;
    }

    //Hashset
    public static int startcheck2(Node head){

        HashSet<Node> visited = new HashSet<>();

        Node temp =head;

        while(temp != null){
            if(visited.contains(temp)){
                return temp.data;
            }
            visited.add(temp);
            temp = temp.next;
        }

        return -1;
    }
}



class lengthOfLoop{

    //HashSet
    public static int length(Node head){
        HashSet<Node> visited = new HashSet<>();

        Node temp =head;

        while(temp != null){
            if(visited.contains(temp)){
                return temp.data;
            }
            visited.add(temp);
            temp = temp.next;
        }

        return -1;
    }
}
