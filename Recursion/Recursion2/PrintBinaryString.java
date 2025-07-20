package Recursion.Recursion2;

public class PrintBinaryString {
    public static void printBinStrings(int n, int lastPlace, String str) {
        // base case
        if(n == 0) {
            System.out.println(str);
            return;
        }

        // always put '0'
        printBinStrings(n - 1, 0, str + "0");
        // put '1' only if lastPlace was 0
        if(lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        printBinStrings(n, 0, "");
    }
}


// job
// if(lastPlace == 0) {
        //     // sit 0 on chair n
        //     printBinStrings(n-1, 0, str.append(0));
        //     printBinStrings(n-1, 1, str.append(1));
        // }
        // else {
        //     printBinStrings(n-1, 0, str.append(0));
        // }