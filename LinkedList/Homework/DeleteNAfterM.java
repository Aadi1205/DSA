package LinkedList.Homework;

public class DeleteNAfterM {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int size;
    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void deleteNAfterM(int M, int N) {
    Node current = head;

    while (current != null) {
        // Skip M nodes
        for (int count = 1; count < M && current != null; count++) {
            current = current.next;
        }

        if (current == null) {
            break;
        }

        // Start deleting N nodes
        Node temp = current.next;
        for (int count = 1; count <= N && temp != null; count++) {
            temp = temp.next;
        }

        // Link the M-th node to the node after N deletions
        current.next = temp;
        current = temp;
    }
}


    public void printList() {
        Node temp = head;

        while(temp != null ) {
            System.out.print(temp.data + "=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DeleteNAfterM ll = new DeleteNAfterM();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.deleteNAfterM(2,2);
        ll.printList();

    }
}
