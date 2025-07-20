// search in rotated sorted array
package DANDC;

public class Search {
    public static int search(int arr[], int tar, int si, int ei) {
        // base case
        if(si > ei) {
            return -1;
        }
        //job
        int mid = si + (ei - si) / 2; // (si+ei)/2;

        //Found
        if(arr[mid] == tar) {
            return mid;
        }

        // mid on line 1
        if(arr[si] <= arr[mid]) {
            //case a: left
            if(arr[si] <= tar && tar <=arr[mid]) {
                return search(arr, tar, si, mid-1);
            }
            else {
                //case b : right
                return search(arr, tar, mid+1, ei);
            }

        }
        // mid of line 2
        else {
            //case c: right
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            }
            else {
                //case d: left
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tarIdx = search(arr, 0, 0, arr.length-1);
        System.out.println(tarIdx);

    }
    
}

