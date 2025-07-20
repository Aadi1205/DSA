package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class FindLonely {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> num) {
        Collections.sort(num);

        ArrayList<Integer> list = new ArrayList<>();

        int n = num.size();

        // Edge case: only one element
        if (n == 1) {
            list.add(num.get(0));
            return list;
        }

        for (int i = 0; i < n; i++) {
            int curr = num.get(i);

            // Check if current number appears more than once
            boolean isDuplicate = (i > 0 && num.get(i - 1) == curr) || (i < n - 1 && num.get(i + 1) == curr);

            // Check if adjacent numbers exist
            boolean hasPrevAdjacent = (i > 0 && num.get(i - 1) == curr - 1);
            boolean hasNextAdjacent = (i < n - 1 && num.get(i + 1) == curr + 1);

            if (!isDuplicate && !hasPrevAdjacent && !hasNextAdjacent) {
                list.add(curr);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 3));
        System.out.println(findLonely(list)); // Output: [1, 5, 7]
    }
}

