import java.util.*;
public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = {12,32,34,54,43};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
      static void change(int [] arr) {
        arr[0]= 99;// Arrays can change objects,i.e, 12 is changed to 99, but strings cannot change.
      }
}
