public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-3,0,2,3,5,7,8,9,12,16,20};
        int target = 0;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            int middle = start + (end - start) /2 ;

            if (target < arr[middle]) {
                end = middle -1;
            } else if (target > arr[middle]) {
                start = middle +1;

            } else {
                return middle;
            }
        }
        return -1;
    }

}
