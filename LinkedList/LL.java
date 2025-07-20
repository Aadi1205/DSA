package LinkedList;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);

    }
}
