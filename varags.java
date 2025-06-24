import java.util.*;

public class varags {
    public static void main(String[] args) {
        fun();
    }
   static void multiple(int a , int b , String...v){
        System.out.println(a + " "+ b);
        System.out.println(Arrays.toString(v));
    }
    
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
