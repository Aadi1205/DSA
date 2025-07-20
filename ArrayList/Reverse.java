import java.util.ArrayList;        // for ArrayList
import java.util.Collections;      // for Collections.reverse() and Collections.reverseOrder()
import java.util.List;             // for using List interface
import java.util.ListIterator;     // for iterating in reverse
import java.util.Arrays;           // for Arrays.asList()
import java.util.stream.Collectors; // for Streams (if collecting to list)


public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Add operation
        list.add(1); // O(1) time require
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //reverse
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
    // Method 1: Using Collections.reverse() - modifies original list
    public static void reverseUsingCollections(List<Integer> list) {
        Collections.reverse(list);
        System.out.println("Reversed using Collections.reverse(): " + list);
    }

    // Method 2: Using ListIterator from the end
    public static void reverseUsingListIterator(List<Integer> list) {
        ListIterator<Integer> it = list.listIterator(list.size());
        System.out.print("Reversed using ListIterator: ");
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
        System.out.println();
    }

    // Method 3: Using Java 8 Streams (does not modify original)
    public static void reverseUsingStreams(List<Integer> list) {
        List<Integer> reversedList = list.stream()
                .sorted(Collections.reverseOrder())
                .toList();
        System.out.println("Reversed using Streams: " + reversedList);
    }

    // Method 4: Copy + Collections.reverse() + forEach
    public static void reverseUsingCopyAndForEach(List<Integer> list) {
        List<Integer> copy = new ArrayList<>(list); // copy of original
        Collections.reverse(copy);
        System.out.print("Reversed using copy and forEach: ");
        copy.forEach(item -> System.out.print(item + " "));
        System.out.println();
    }

}

