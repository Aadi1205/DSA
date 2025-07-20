package Strings.HomeWork;

public class CountWords {
    // my logic wrong output for "  Hello world" String  it gives output 3 not 2
    public static int countWords(String str) {
        int count = 1;
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i-1) == ' ' ){
                count++;
            }
        }
        return count;
    }

    // Approach 2: 
    // str.trim(): Removes spaces from beginning and end of the string.
    //split("\\s+") breaks the sentence into words wherever it finds spaces, tabs, or newlines.
    // It removes those spaces and stores only the words in a string array.
    
    public static int countWords2(String str) {
    if (str == null || str.trim().isEmpty()) return 0; // if string is empty then wordCount=0 -> return 0;
    String[] words = str.trim().split("\\s+"); // this line stored every word in an array
    return words.length; // return length of an array
}


    // Another approach Optimized   
    public static int countWords3(String str) {
    int count = 0;
    boolean inWord = false;

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch != ' ' && !inWord) {
            count++;       // word started
            inWord = true;
        } else if (ch == ' ') {
            inWord = false; // word ended
        }
    }
    return count;
}

    public static void main(String[] args) {
        System.out.println(countWords2("    Avengers: Infinity War    "));
    }
}
