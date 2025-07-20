package Strings.Hard;

import java.util.Arrays;

public class GroupAnagram {
    public static void groupAnagram(String[] words) {
        boolean[] used = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            if (used[i]) continue;

            char[] base = words[i].toCharArray();
            Arrays.sort(base);

            System.out.print(words[i]);

            for (int j = i + 1; j < words.length; j++) {
                char[] compare = words[j].toCharArray();
                Arrays.sort(compare);

                if (Arrays.equals(base, compare)) {
                    System.out.print(" " + words[j]);
                    used[j] = true;
                }
            }

            System.out.println(); // Move to next group
        }
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagram(input);
    }
}
