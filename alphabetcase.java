import java.util.*;

public class alphabetcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch == 'a' && ch == 'z') {
            System.out.println("The alphabet given by the user is lowercase" );
        } else {
            System.out.println("The alphabet given by the user is uppercase");
        }
    }
}
