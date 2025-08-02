package Stack.Advance;

import java.util.*;

public class TrappingRainwater {
    public static int trap(int[] height) {
        int n = height.length;
        Stack<Integer> s = new Stack<>();
        int trappedWater = 0;

        for(int i = 0; i < n; i++) {
            while(!s.isEmpty() && height[i] > height[s.peek()]) {
                int bottom = s.pop();
                if(s.isEmpty()) break;

                int width = i - s.peek() - 1;
                int hgt = Math.min(height[i], height[s.peek()]) - height[bottom];
                trappedWater += width * hgt; 
            }
            s.push(i);
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1}; // Expected output: 1
        System.out.println(trap(height));
    }
}
