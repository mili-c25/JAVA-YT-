//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.*;
public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int choice;
        System.out.println("Enter a number:");
        a = sc.nextInt();
        System.out.println("Enter another number:");
        b = sc.nextInt();
         System.out.println("Enter your choice");
         choice = sc.nextInt();
         if (choice== 1) {
            System.out.println(a+b);
         } else if(choice == 2) {
            System.out.println(a-b);
         } else if(choice == 3) {
            System.out.println(a*b);
         } else {
            System.out.println(a/b);
         }
    }
}
