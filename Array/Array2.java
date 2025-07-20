// arrays in Java are passed by reference. When you pass an array to a method, 
// changes made to its elements inside the method affect the original array.

//primitive types like int, float, double are not passed by reference.
// means changes made to its elements inside the method may not affect the original array

public class Array2 {
    public static void update(int marks[], int changeNumber) {
        changeNumber = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        int changeNumber = 5;
        update(marks, changeNumber);

        // print our marks
        System.out.println("Updated Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        System.out.println("Integer value remains same: " + changeNumber);
    }
}
