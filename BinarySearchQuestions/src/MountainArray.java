public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,5,4,3};
        System.out.println(peakIndex(arr));
    }

    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] > arr[middle+1]){
                // you are in dec part of array
                // this may be the answer, but look at left
                // this is why end != mid - 1;
                end = middle;
            } else {
                // you are in ascending part of array
                start = middle + 1; // because we know that mid + 1 > mid
            }
        }

        // in the end start == end and pointing to the largest number because of the above 2 checks
        // start and end are always trying to find max element in above 2 steps
        // hence, when they are pointing to just one element, that is the max one. becoz thats what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer, till that time.
        // and if we are saying that only one item is remaining, hence cuz of the above line is the best possible ans.

        return start; // at this point start and end are same.
    }
}
