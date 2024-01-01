public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,10,14,20};
        int target = 8;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int middle = start + (end - start) /2;
            if (target == arr[middle]){
                return middle;
            }
            if (target < arr[middle]){
                end = middle - 1;
            } else {
                start = middle + 1;
            }

        }

        return end;
    }
}
