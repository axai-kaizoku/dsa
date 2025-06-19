public class MaximumItem {
    public static void main(String[] args) {
        int[] arr = {33, 4, 554, 898, 0};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 2));
    }

    // Imagine that array is not empty
    static int max(int[] arr) {
        int maxVal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // work on edge cases here, like array is being null
    static int maxRange(int[] arr, int start, int end) {
        if (end > start) {
            return -1;
        }

        if (arr==null) {
            return -1;
        }

        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
