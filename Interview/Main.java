//Given the arrival and departure times of all trains that reach a railway station, the task is to find the minimum number of platforms required
// for the railway station so that no train waits. We are given two arrays that represent the arrival and departure times of trains that stop.
//Examples:
//Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}, dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int target = 9;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
