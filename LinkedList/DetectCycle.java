package LinkedList;

public class DetectCycle {
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

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast) {
                return true; //cycle exist!
            }
        }
        return false; //cycle doesn't exist
    }
    //code for remove cycle
    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null; //last node
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle -> last.next = null
        prev.next = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->2

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
