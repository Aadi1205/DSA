import java.util.Scanner;

public class ArrayInput {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];
        System.out.println("Enter marks");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);
        System.out.println("English: " + marks[3]);
        System.out.println("Computer Science: " + marks[4]);

        // marks[2] = 100;
        // System.out.println("Math: " + marks[2]);

        // to find percentage: 
        int percentage = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
        System.out.println("Percentage: " + percentage);

        //To find array length:
        System.out.println("length of Array: " + marks.length);

        

        sc.close();
    }
}
