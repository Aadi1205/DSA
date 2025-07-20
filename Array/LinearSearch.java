public class LinearSearch {

    // linear search 
    public static int linearSearch(int numbers[], int key) {

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7};
        int key = 5;
        int result = linearSearch(numbers, key);

        if(result == -1) {
            System.out.println("Element isn't found in an array!");

        }
        else {
            System.out.println("Element is present at index: " + result);
        }

    }
}
