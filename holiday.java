import java.util.*;

public class holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days;
        System.out.println("Enter a number:");
        days = sc.nextInt();

        switch(days) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Weekdays.");
            break;

            case 6:
            case 7:
            System.out.println("Weekends.");
            break;

            default:
            System.out.println("Enter a valid number.");
        }
    }
}
