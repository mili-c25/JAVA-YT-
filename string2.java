import java.util.Arrays;

public class string2 {
    
    public static void main(String[] args) {
       String str = "Soumili";
       // char target = 'h';
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean linearSearch(String str , char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (target == c) {
                return true;
            }
        }

        return false;
    }
}
