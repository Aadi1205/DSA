package HomeWork;

import java.util.ArrayList;

public class BeautifulArrayList {

    // ✅ Approach 1: Iterative
    public ArrayList<Integer> beautifulArrayIterative(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int e : ans) {
                if (e * 2 <= n) temp.add(e * 2);
            }

            for (int e : ans) {
                if (e * 2 - 1 <= n) temp.add(e * 2 - 1);
            }

            ans = temp;
        }

        return ans;
    }

    // ✅ Approach 2: Divide and Conquer (Recursive)
    public ArrayList<Integer> beautifulArrayRecursive(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConquer(1, 1, res, n);
        return res;
    }

    private void divideConquer(int start, int increment, ArrayList<Integer> res, int n) {
        if (start > n) return;

        // Recurse on odds (left)
        divideConquer(start, 2 * increment, res, n);

        // Recurse on evens (right)
        divideConquer(start + increment, 2 * increment, res, n);

        res.add(start);
    }

    public static void main(String[] args) {
        BeautifulArrayList obj = new BeautifulArrayList();

        int n = 5;

        // Choose either version
        ArrayList<Integer> result1 = obj.beautifulArrayIterative(n);
        ArrayList<Integer> result2 = obj.beautifulArrayRecursive(n);

        System.out.println("Iterative approach: " + result1);
        System.out.println("Recursive approach: " + result2);
    }
}
