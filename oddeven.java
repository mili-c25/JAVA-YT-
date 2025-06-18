
//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number of user's choice:");
        num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("The number given by the user is even");
        } else {
            System.out.println("The number given by the user is odd");
        }
    }
}
