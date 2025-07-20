package LinkedList.Implementation;


public class MergeSortLL {
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

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next; // because to delete the dummy node
    }
    public Node mergeSort(Node head) {
        //base case
        if(head == null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left & right half
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.printList();
        ll.head = ll.mergeSort(ll.head); //TC: O(n log n)
        ll.printList();
    }
}
