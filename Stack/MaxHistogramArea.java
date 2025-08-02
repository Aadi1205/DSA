package Stack;
import java.util.*;
public class MaxHistogramArea {
    public static int largestHistogramArea2(int[] heights) { //TC: O(n^2)
        int maxArea = 0;

        for(int i=0; i<heights.length; i++) {
            int currArea = heights[i];
            for(int j=i; j<heights.length; j++) {
                currArea = Math.min(currArea, heights[j]);
                int area = currArea * (j-i+1);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static int largestHistogramArea(int[] arr) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        
        //Next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                //-1;
                nsr[i] = arr.length;
            }
            else {
                //top
                nsr[i] = s.peek();
            }
        }
        //Next smaller left
        s = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                //-1;
                nsl[i] = arr.length;
            }
            else {
                //top
                nsl[i] = s.peek();
            }
        }
        //curr Area: width: j-i-1 = nsr[i] - nsl[i] - 1;
        for(int i=0; i<arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;

    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestHistogramArea2(heights));
    }
}
