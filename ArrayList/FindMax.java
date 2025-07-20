import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Add operation
        list.add(14); // O(1) time require
        list.add(26);
        list.add(33);
        list.add(14);
        list.add(5);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
            // if(max < list.get(i)) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }

        //int max = Collections.max(list);
        System.out.println("Max value is: " + max);
    }
}
