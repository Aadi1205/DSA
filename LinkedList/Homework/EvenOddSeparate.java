package LinkedList.Homework;

public class EvenOddSeparate {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node divide() {
        if(head == null || head.next == null) {
            return head;
        }
        Node even = new Node(-1);
        Node odd = new Node(-1);

        Node oddHead = odd;
        Node evenHead = even;
        Node ptr = head;

        while(ptr != null) {
            if(ptr.data % 2 == 0 ) {
                even.next = ptr;
                even = even.next;
            }
            else {
                odd.next = ptr;
                odd = odd.next;
            }
            ptr = ptr.next;
        }

        odd.next = null;
        even.next = null;

        even.next = oddHead.next;

        return evenHead.next;
    }

    public static void main(String[] args) {
    EvenOddSeparate ll = new EvenOddSeparate();

    ll.addLast(17);
    ll.addLast(15);
    ll.addLast(8);
    ll.addLast(12);
    ll.addLast(10);
    ll.addLast(5);
    ll.addLast(4);

    System.out.println("Original List:");
    ll.printList();

    ll.head = ll.divide();  // 🔴 assign new list to head

    System.out.println("Segregated List (Even before Odd):");
    ll.printList();
}

}

