public class string1 {

    public static void main(String[] args) {
        String str = "SOUMILI";
        char target = 'M';
        System.out.println(linearSearch(str, target));
    }

    static boolean linearSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}