package Strings.HomeWork;

public class Main {
    public static void countFrequency(String str) {
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            freq[ch - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (freq[ch - 'a'] != 0) {
                System.out.println(ch + ": " + freq[ch - 'a']);
                freq[ch - 'a'] = 0; // to avoid duplicate printing
            }
        }
    }

    public static void main(String[] args) {
        countFrequency("programming");
    }
}
