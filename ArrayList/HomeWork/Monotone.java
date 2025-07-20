package HomeWork;
import java.util.Arrays;
import java.util.ArrayList;
public class Monotone
{

    public static boolean monotone(ArrayList<Integer> list) {
    boolean increasing = true;
    boolean decreasing = true;

    for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i) < list.get(i + 1)) {
            decreasing = false;
        }
        if (list.get(i) > list.get(i + 1)) {
            increasing = false;
        }
    }

    return increasing || decreasing;
}

    public static boolean monotone1(ArrayList<Integer> list) {
        if (list.size() <= 1) return true; // if only one element is given

        if(list.get(0) <= list.get(1)) { // if first element is less than or equal to second element
            for(int i=1; i<list.size()-1; i++) {
                if(list.get(i) > list.get(i+1)) {
                    return false;
                }
            }
        }
        else if(list.get(0) >= list.get(1)) { // if first element is greater than or equal to second element
            for(int i=1; i<list.size()-1; i++) {
                if(list.get(i) < list.get(i+1)) {
                    return false;
                }
            }
        }
        
        return true;
    }
	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,5,5,5,5));
	   
	    System.out.println(monotone1(list));
	}
}