public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
//        System.out.println(peaKIndex(arr));
//        System.out.println(OrderAgnosticBS(arr, 4, 0, arr.length - 1));

        System.out.println(search(arr, 5));
    }
        // find in mountain array - leetcode;

    static int search(int[] arr, int target){
        int peak = peaKIndex(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        while( start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }

            boolean isAsc = arr[start] < arr[end];


            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int peaKIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }

        }
        return start;
    }


}
