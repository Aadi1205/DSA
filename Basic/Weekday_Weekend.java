import java.util.Scanner;

public class Weekday_Weekend{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of the week: ");
        String day = sc.nextLine().trim().toLowerCase();

        switch(day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
        sc.close();
    }
}
