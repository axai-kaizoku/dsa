public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c','f','i'};
        char target = 'h';
        char ans = smallestLetter(arr, target);
        System.out.println(ans);
    }

    static char smallestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) /2;
            if (target < arr[middle]){
                end = middle -1;
            } else {
                start = middle + 1;
            }
        }
        return arr[start % arr.length];
    }
}
