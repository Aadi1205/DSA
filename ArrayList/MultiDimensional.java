import java.util.ArrayList;
public class MultiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // to Print multi-dimension ArrayList
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " " );
            }
            System.out.println();
        }
        System.out.println();

        //or we can directly print mainList
        System.out.println("without using loops");
        System.out.println(mainList);
        
    }
}
