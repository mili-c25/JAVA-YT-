//Input currency in rupees and output in USD.

import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i,USD;
        System.out.println("Enter the currency in rupees");
        i= sc.nextDouble();
        USD= i*0.012;
        System.out.println("The rupees in USD is:" + USD);
    }
}
