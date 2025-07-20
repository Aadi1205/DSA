package BitManipulation.HomeWork;

public class UpperToLowercase {
    public static char upperToLower(char ch) {
        return (char) (ch | (1 << 5));
        //return (char) (ch | 32);
        //return (char) (ch | ' ');
    }

    public static char lowerToUpper(char ch) {
        return (char) (ch & ~(1 << 5));
        //return (char) (ch & '_');
    }
    public static void main(String[] args) {
        System.out.println(upperToLower('A'));
        System.out.println(lowerToUpper('a'));
    }
}
