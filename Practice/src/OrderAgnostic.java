public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {48,36,20,18,10,4,0,-2};
        int target = 0;
        int ans = OrderAgnostic(arr, target);
        System.out.println(ans);
    }
    static int OrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        if (start > end) {

            while(start > end) {
                int middle = start + (end - start) / 2;
                if (target < arr[middle]) {
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle +1;
                }else {
                    return middle;
                }
            }
        } else {
            while(end > start) {
                int middle = start + (end - start) / 2;
                if (target > arr[middle]) {
                    end = middle - 1;
                } else if (target < arr[middle]) {
                    start = middle + 1;
                } else {
                    return middle;
                }
            }
        }

        return -1;
    }
}
