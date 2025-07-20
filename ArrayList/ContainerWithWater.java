import java.util.ArrayList;

public class ContainerWithWater { 
    public static int optimized(ArrayList<Integer> height) { //TC: O(n)
        int max = 0;
        int left = 0, right = height.size() - 1;

        while(left < right) {
            int area = 0;
            int width = Math.abs(left - right);
            int length = Math.min(height.get(left), height.get(right));
            area = width * length;
            max = Math.max(max, area);

            if(height.get(left) < height.get(right)) {
                left++;
            }
            else {
                right--;
            }
        }

        return max;
    }

    public static int container(ArrayList<Integer> height) {  // TC: O(n^2)
        int max = 0;
        int sum = 0;

        for(int i=0; i<height.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                int length = Math.min(height.get(i), height.get(j));
                int width = Math.abs(i - j);

                sum = length * width;
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // Create a container with water
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(container(height));
        System.out.println(optimized(height));
    }
}
