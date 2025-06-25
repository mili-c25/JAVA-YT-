import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isArm(n);
        System.out.println(ans);
    }

    static boolean isArm(int n) {
        int sum = 0, og =n; 
        while(n > 0) {
        int rem = n % 10;
         n = n/10;
        sum = sum + (rem*rem*rem);
        }

        if (sum == og) {
            return true;
        } else {
            return false;
        }
    }
    
}
