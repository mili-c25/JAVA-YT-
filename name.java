//Take name as input and print a greeting message for that particular name.

import java.util.*;
public class name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Enter a greeting with a name of your choice");
        name= input.nextLine();
        System.out.println(name);
    }
}
