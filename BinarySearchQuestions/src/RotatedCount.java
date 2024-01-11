public class RotatedCount {
    public static void main(String[] args) {
        int[] arr = {9,12,15,19,20,30,45};
        int[] arr1 = {30,45,9,12,15,19,20};
        int[] arr2 = {19,20,30,45,9,12,15};
        System.out.println(search(arr));
    }

    static int search(int[] nums){
        int pivot = findPivot(nums);
        // if pivot is found, return it.
        return pivot+1;

    }


    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid-1 ;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
