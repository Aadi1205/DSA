package BitManipulation;

public class OddEven {
    public static void oddEven(int n) {
        if((n & 1) == 1) { // 1001 & 1 = 0001 that's how the code works   
            System.out.println("Odd");
        }
        else { // 1001 & 0 = 0000 
            System.out.println("Even");
        }
    }
    public static void main(String[] args) {
        oddEven(2);
        oddEven(11);
    } 
}
