public class search {

    public static void main(String[] args) {
        int [] arr = {23,76,54,34,65,-9};
        int target = 65;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
      
    static int linearSearch(int [] arr, int target) {

        // if there are no elements in the array then it will return -1

        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index]; //the elements inside the array
            if (element == target) {  // to check if the element is found or not
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }
}