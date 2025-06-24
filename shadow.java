import java.util.*;

public class shadow {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); // it will print 90
        int x = 40;
        System.out.println(x); // this will print 40
        fun();
    }
    static void fun() {
        System.out.println(x); // again this will print 90
    }
}
