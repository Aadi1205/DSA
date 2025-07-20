
package Strings;

public class ShortestPath {
    public static float displacement(String str) { // Time Complexity: O(n)
        int x = 0, y = 0;
        str = str.toUpperCase(); // Convert to uppercase for case-insensitive comparison.
        for(int i=0; i<str.length(); i++) { 
            char dir = str.charAt(i); 
            if(dir == 'N') { // Use single quotes 'N' for char comparison, not double quotes which denote a String.
                y++;
            }
            else if(dir == 'S') {
                y--;
            }
            else if(dir == 'E') {
                x++;
            }
            else {
                x--;
            }
        }
        double displace = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // Math.sqrt fun. returns double value only!
        return (float) displace;
    }
    public static void main(String[] args) {
        String str = "wneenesennn";
        System.out.println(displacement(str));
    }
    
}
