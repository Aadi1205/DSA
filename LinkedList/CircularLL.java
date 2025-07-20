package LinkedList;

public class CircularLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node last;

    // Add to empty list
    public void addToEmpty(int data) {
        if (last != null) return;
        Node newNode = new Node(data);
        last = newNode;
        last.next = last;
    }

    // Add at beginning
    public void addFirst(int data) {
        if (last == null) {
            addToEmpty(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
    }

    // Add at end
    public void addLast(int data) {
        if (last == null) {
            addToEmpty(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }

    // Add after a node
    public void addAfter(int data, int key) {
        if (last == null) return;

        Node current = last.next;
        do {
            if (current.data == key) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                if (current == last) last = newNode;
                return;
            }
            current = current.next;
        } while (current != last.next);

        System.out.println("Key " + key + " not found.");
    }

    // Delete a node
    public void delete(int key) {
        if (last == null) return;

        Node curr = last.next, prev = last;

        // If only one node
        if (last == last.next && last.data == key) {
            last = null;
            return;
        }

        // Search the node
        do {
            if (curr.data == key) {
                prev.next = curr.next;
                if (curr == last) last = prev;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != last.next);

        System.out.println("Key " + key + " not found.");
    }

    // Traverse list
    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        CircularLL cll = new CircularLL();

        cll.addToEmpty(10);
        cll.addLast(20);
        cll.addFirst(5);
        cll.addAfter(15, 10);

        System.out.println("List after additions:");
        cll.display();

        cll.delete(20);
        System.out.println("List after deleting 20:");
        cll.display();

        cll.delete(100); // Not found
    }
}
