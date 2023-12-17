public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12, 3, 12,-2, 56, 98, 20};
        int ans = findMin(arr);
        System.out.println(ans);
    }

    static int findMin(int[] arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
