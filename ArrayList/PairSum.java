import java.util.ArrayList;
import java.util.Arrays;
public class PairSum {
    public static boolean hasPairWithSumK(ArrayList<Integer> list, int k) {

        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i) + list.get(j) == k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean optimized(ArrayList<Integer> list, int target) {
        int lp = 0; // left pointer
        int rp = list.size() - 1; //right pointer

        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            else {
                rp--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // O(1) time require
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

       
        System.out.println(hasPairWithSumK(list, 7));
        System.out.println(optimized(list, 5));
    }
}
