import java.util.*;

public class swap {
    public static void main(String[] args) {
        swap();
    }

    static void swap() {
     Scanner sc = new Scanner(System.in);
     int a , b , temp;
     System.out.print("Enter a number:");
      a = sc.nextInt();
      System.out.println("Enter another number:");
      b = sc.nextInt();
       temp = a;
       a = b;
       b = temp;
       System.out.println(a + " " + b);
        }
}
