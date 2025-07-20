import java.util.ArrayList;
import java.util.Collections; 
//Collection -> Interface       //Collections -> class
public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Add operation
        list.add(5); // O(1) time require
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);

        Collections.sort(list); // sort in ascending order
        System.out.println(list);

        //Collection.reverseOrder() is a comparator which Define/ Modify logic of sort
        Collections.sort(list, Collections.reverseOrder()); // sort in descending order
        System.out.println(list);
    }
}
