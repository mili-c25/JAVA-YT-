public class max {
    
    public static void main(String[] args) {
        int [] arr = {12,87,65,12,90,62};
        System.out.println(max(arr));

    }

    static int max(int [] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }

        return ans;
    }
}
