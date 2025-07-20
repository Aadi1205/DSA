package BackTracking;

public class PrintSubset {
    public static void findSubset(String str, String ans, int i) {
        //base case
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }
        //recursion
        //Yes Choice
        findSubset(str, ans+str.charAt(i), i+1);
        //No Choice
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        findSubset("abc", "", 0);
    }
}
