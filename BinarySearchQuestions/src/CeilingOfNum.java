public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,14,16,18};
        int target = 10;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]){
            return -1;
        }

        while(start <= end){
            int middle = start + (end - start) /2;
            if (target == arr[middle]){
                return middle;
            }
            if (target < arr[middle]){
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle +1;
            }
        }

        return start;

    }
}
