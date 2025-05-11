class MyHashSet {
    private static class Node {
        int key;
        Node next;

        Node(int key) {
            this.key = key;
        }
    }

    private final int SIZE = 1000;
    private Node[] table;

    public MyHashSet() {
        table = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int index = hash(key);
        Node head = table[index];

        // Check if key already exists
        Node curr = head;
        while (curr != null) {
            if (curr.key == key) return; // already present
            curr = curr.next;
        }

        // Insert new node at beginning
        Node newNode = new Node(key);
        newNode.next = head;
        table[index] = newNode;
    }

    public void remove(int key) {
        int index = hash(key);
        Node curr = table[index];
        Node prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) table[index] = curr.next;
                else prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public boolean contains(int key) {
        int index = hash(key);
        Node curr = table[index];

        while (curr != null) {
            if (curr.key == key) return true;
            curr = curr.next;
        }
        return false;
    }
}
