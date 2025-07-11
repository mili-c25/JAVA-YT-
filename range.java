public class range {

public static void main(String[] args) {
    int [] array = {23,76,54,89,05,54};
     int target = 23;
     System.out.println(linearSearch(array, 1, 4, target));
}
    static int linearSearch(int [] arr , int start , int end, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
           
        for(int index = start ; index < end; index++ ) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }
}
