package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Inbuilt LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        

        LL x = new LL();
        x.insertFirst(10);
        x.insertFirst(20);
        x.insertFirst(30); 
        x.insertFirst(40);
        x.insertFirst(50);
        x.insertFirst(60);
        x.insertLast(98);
        x.insertAt(32,4);

        x.display();
        System.out.println("Size: " + x.size());

        x.deletefirst();
        x.display();
        System.out.println("Size: " + x.size());
        x.deleteLast();
        x.display();
        System.out.println("Size: " + x.size());
        

    }
}
