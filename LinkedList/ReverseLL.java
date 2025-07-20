package LinkedList;

public class ReverseLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; //size = 0 by default
    
    public void addFirst(int data) { // don't use static keyword  // TC: O(1)
        //step 1: create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step 2: newNode next = head
        newNode.next = head; // linking step 

        //step 3: 
        head = newNode;
    }

    public void addLast(int data) { // TC: O(1)
        //step 1: 
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //step 2:
        tail.next = newNode;
        //step 3: 
        tail = newNode;

    }

    public void add(int idx, int data) {
        //if we want to add ele at first
        if(idx == 0) {
            addFirst(data);
            return;
        }
    
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx - 1) {
            temp = temp.next; // traverse to idx - 1 // temp++
            i++;
        }

        //at i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printList() { //TC: O(n)
        if(head == null) {
            System.out.println("LL is empty!");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() { //TC: O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.printList();

        //reverse ll
        ll.reverse();
        ll.printList();
    }
}
