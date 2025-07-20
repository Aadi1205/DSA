package LinkedList;

public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }
    public void print() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    //remove First
    public void removeFirst() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        if(head == tail) {
            head = tail = null;
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    //remove Last 
    public void removeLast() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        if(head == tail) {
            head = tail = null;
            size--;
            return;
        }

        tail = tail.prev;
        tail.next = null;
        size--;

    }

    public void reverse() {
        Node curr = tail = head;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);

        dll.print();
        // System.out.println(dll.size);
        // dll.removeFirst();
        // dll.removeLast();
        // dll.print();
        // System.out.println(dll.size);

        System.out.println("Reverse of Doubly LL");
        dll.reverse();
        dll.print();
    }
}
