//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.*;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float p,t,r,SI;
        System.out.println("Enter the principle amount:");
        p = input.nextFloat();
         System.out.println("Enter the rate value:");
        r = input.nextFloat();
         System.out.println("Enter the time:");
        t = input.nextFloat();
        SI = (p*r*t) / 100;
        System.out.println("The simple interest is:" + SI);

    }
}
