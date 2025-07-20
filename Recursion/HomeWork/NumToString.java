package Recursion.HomeWork;

public class NumToString
{
    static String[] numArr = {
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"
        };
    public static void printNum(int num, String[] numArr) {
        if (num <= 0) {
            return;
        }

        printNum(num / 10, numArr);

        int digit = num % 10;
        System.out.print(numArr[digit] + " ");
    }

    public static void main(String[] args) {
        int num = 1980; // You can test with 1947 or any number

        // Check if last digit is 0
        if (num % 10 == 0) {
            System.out.println("Invalid Input: Number can't end with 0.");
            return;
        }

        

        printNum(num, numArr);
    }
}


// public static void numToString(int num,StringBuilder sb) {
    //     //base case 
    //     if(num <= 0) {
    //         return;
    //     }
        
    //     //job
    //     int rem = num % 10;
    //     num /= 10;

    //     //recursion
    //     numToString(num, sb);

    //     if(rem == 0) {
    //         System.out.print("Zero ");
    //     }
    //     else if(rem == 1) {
    //         System.out.print("One ");
    //     }
    //     else if(rem == 2) {
    //         System.out.print("Two ");
    //     }
    //     else if(rem == 3) {
    //         System.out.print("Three ");
    //     }
    //     else if(rem == 4) {
    //         System.out.print("Four ");
    //     }
    //     else if(rem == 5) {
    //         System.out.print("Five ");
    //     }
    //     else if(rem == 6) {
    //         System.out.print("Six ");
    //     }
    //     else if(rem == 7) {
    //         System.out.print("Seven ");
    //     }
    //     else if(rem == 8) {
    //         System.out.print("Eight ");
    //     }
    //     else if(rem == 9) {
    //         System.out.print("Nine ");
    //     }       
    // }