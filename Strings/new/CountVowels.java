package Strings.HomeWork;

public class CountVowels {
    public static int vowels(String str) {
        Integer count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void vowelCons(String str) {
        Integer vowel = 0, cons = 0;
        

        for(int i=0; i<str.length(); i++) {

            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowel ++;
            }
            else {
                cons++;
            }
        }
            }
            
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + cons);
    }

    public static int countWords(String str) {
        int count = 1;
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i-1) == ' ' ){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String str = "Aditya Suresh Bhavsar";
        System.out.println("Number of vowels: " + vowels(str));
        vowelCons(str);
    }
    
}
