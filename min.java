public class min {
    
    public static void main(String[] args) {
        int [] arr = {32,12,34,65,43,12};
        System.out.println(min(arr));
    }

    static int min(int [] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
