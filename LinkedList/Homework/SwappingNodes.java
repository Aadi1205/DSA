package LinkedList.Homework;

public class SwappingNodes {
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

    public void swapNodes(int x, int y) {
        if(x == y) {
            return;
        }
        Node prevX = null, currX =head;

        while(currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while(currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if(currX == null || currY == null) {
            return;
        }

        if(prevX != null) {
            prevX.next = currY;
        }
        else {
            head = currY;
        }

        if(prevY != null) {
            prevY.next = currX;
        }
        else {
            head = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
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
        SwappingNodes ll = new SwappingNodes();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printList();
        ll.swapNodes(2, 4);
        ll.printList();
    }
}