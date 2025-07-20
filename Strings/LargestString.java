// For a give set of strings, print the largest string --> we follow lexicographic order
// ex: aaabcd is smaller than aaabce because 'd' is smaller than 'e';
package Strings;

public class LargestString { 
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        
        for(int i=0; i<fruits.length; i++) {
            // output < 0 => string largest is smaller than fruits[i];
            // output > 0 => string largest is larger than fruits[i];
            // output == 0 => string largest is equal to fruits[i];
            if(largest.compareToIgnoreCase(fruits[i]) < 0) {  // Time complexity: O(x*N) x: max length of letter; N: number of strings
                largest = fruits[i];
            }
        }
        System.out.println(largest); // prints "mango"
    }
    
}
