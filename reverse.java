import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num = sc.nextInt();
        int ans = 0;
        int rem;

        while (num > 0) {
            rem = num % 10;
            num = num % 10;

             ans = ans * 10 + rem;
        }
       System.out.println(ans);
    }
}
