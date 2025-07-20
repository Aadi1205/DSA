public class ArrayReverse {
    public static void Reverse(int arr[]) {
        int start = 0, end = arr.length - 1; // this is variable end / no less than condition that's why n-1;
        int temp;
        while (start < end) { //strictly less than if not , it will go into infinite loop because we have to swap start and end!!
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // print array
        System.out.println("Reverse of an Array");
        for (int i=0; i<arr.length; i++) { //   this is another variable  // less than condition
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Reverse(arr);
    }
}
