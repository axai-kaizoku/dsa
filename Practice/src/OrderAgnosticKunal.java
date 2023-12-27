public class OrderAgnosticKunal {
    public static void main(String[] args) {
        int[] arr = {89,45,45,23,22,12,0,-2};
        int[] arr2 = {-2,0,2,4,6,9,9,12,20,32,33,56};
        int target = 45;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[end] > arr[start];

        while(start <= end){
            int middle = start + (end - start) / 2;

            if(arr[middle] == target) {
                return middle;
            }
            if (isAsc){
                if (target < arr[middle]){
                    end = middle - 1;
                } else  {
                    start = middle +1;
                }
            } else {
                if (target < arr[middle]){
                    start = middle + 1;
                } else {
                    end = middle -1;
                }
            }
        }


        return -1;
    }
}
