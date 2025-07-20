import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Add operation
        list.add(1); // O(1) time require
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(list);

        //Get operation
        int element = list.get(2);
        System.out.println(element);

        //Remove operation
        list.remove(2);
        System.out.println(list);

        // set operation 
        list.set(2,90);
        System.out.println(list);
        
        //Contains operation -> boolean result
        System.out.println(list.contains(90)); //output: True
        System.out.println(list.contains(5)); //output: False

        //list.add(idx, val) 
        list.add(3, 100); // elements after 3 will be shifted to right

        //size of an arrayList
        list.size();

        //print arrayList like array
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

        
