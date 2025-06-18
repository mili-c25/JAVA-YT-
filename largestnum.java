//Take 2 numbers as input and print the largest number.

import java.util.*;
public class largestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.println("Enter a number from the user:");
        a = sc.nextInt();
        System.out.println("Enter another number from the user:");
        b = sc.nextInt();
        if(a > b) {
        System.out.println("The largest number between two numbers is" + a);
        } else {
        System.out.println("The largest number between two numbers is" +  b);
        }
    }
    
}
