import java.util.*;

public class varags {
    public static void main(String[] args) {
        fun(2,8,9,77,86,9,4,7);
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
