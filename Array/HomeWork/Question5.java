
package HomeWork;

import java.util.Arrays;

public class Question5 {
    public static void Triplet(int arr[]) {
        Arrays.sort(arr); // Sort the array to avoid duplicates easily
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicate i

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println("[" + arr[i] + ", " + arr[left] + ", " + arr[right] + "]");
                    left++;
                    right--;

                    // Skip duplicates
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        Triplet(arr);
    }
}


        
        // for(int i=0; i<n; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         for(int k=j+1; k<n; k++) {
        //             if(arr[i] + arr[j] + arr[k] == 0) {
        //                 System.out.println("[" + arr[i] + ", " + arr[j] + ", " + arr[k] + "]");
        //             }
        //         }
        //     }
