public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,23, 43, 556, 34, 33, 23};
        int ans = searchRange(arr, 43, 7,5 );
        System.out.println(ans);

    }
    static int searchRange(int[] arr,int target,  int start, int end){
        if (arr.length == 0){
            return -1;
        }
        if (start < end) {
            return -1;
        }

        for (int i = start;i <= end; i++){
            if (target == arr[i]){
                return i;
            }
        }

        return -1;
    }
}
