package LinkedList;

public class LinkedList {

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

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) { //LL is empty
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) { //LL contains only one element
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev: i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        // at n-2 index
        int val = prev.next.data; //tail.data;
        prev.next = null;
        size--;
        return val;
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


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.printList(); // 2 -> 1 -> 3 -> 4 -> null

        ll.add(2, 9);
        ll.printList(); // output: 2 -> 1 -> 9 -> 3 -> 4 -> null 
        System.out.println("Size of LL: " + size);

        ll.removeFirst();
        ll.printList();

        ll.removeLast();
        ll.printList();
        System.out.println("Size of LL: " + size);

    }
}
/*
     * Methods 
     * add
     * remove
     * delete
     */