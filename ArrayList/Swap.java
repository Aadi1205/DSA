import java.util.ArrayList;

public class Swap {
    //optimized
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    // Function to swap two elements using XOR
    public static void swap2(ArrayList<Integer> list, int i, int j) {
        if (i == j) return; // avoid swapping same index
        if (list == null || i < 0 || j < 0 || i >= list.size() || j >= list.size()) {
            System.out.println("Invalid indices");
            return;
        }

        list.set(i, list.get(i) ^ list.get(j));
        list.set(j, list.get(i) ^ list.get(j));
        list.set(i, list.get(i) ^ list.get(j));
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Add operation
        list.add(1); // O(1) time require
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        swap(list, 1, 3);
        System.out.println("After swaping");
        System.out.println(list);

    }
}
