package Strings.HomeWork;

public class StringReplace { 
    public static void main(String[] args) {
        // replace(char, char)
        String str = "banana";
        System.out.println(str.replace('a', 'o')); 

        // replace(CharSequence, CharSequence)
        String str2 = "hello world";
        System.out.println(str2.replace("hello", "hi")); // Output: hi world

        // replaceAll(String, String)
        String str3 = "a1b2c3";
        System.out.println(str3.replaceAll("\\d", "*")); // Output: a*b*c*

        String str4 = "cat dog cat";
        System.out.println(str4.replaceFirst("cat", "fox")); // Output: fox dog cat

        // \d  → Matches any digit (0–9)

        // \D  → Matches any non-digit character

        // \w  → Matches any word character (a-z, A-Z, 0–9, _)

        // \W  → Matches any non-word character (anything except a-z, A-Z, 0–9, _)

        // \s  → Matches any whitespace character (space, tab, newline, etc.)

        // \S  → Matches any non-whitespace character



    }
    
}
