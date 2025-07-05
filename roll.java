import java.util.*;
public class roll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int [] roll = new int[5];
        for( i = 0 ; i < roll.length - 1 ; i++) {
            roll[i] = sc.nextInt();
           // System.out.print(Arrays.toString(roll));
        }
        System.out.print(Arrays.toString(roll));;
    }
}
