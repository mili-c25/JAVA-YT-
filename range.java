public class range {
    public static void main(String[] args) {
        int [] arr = {1,6,54,32,65};
        System.out.println(range(arr,1,3 ));
    }

    static int range(int [] arr , int start , int end) {
        int maxVal = start;
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        return maxVal;
    }
}
