import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,4,56,7,6};
        System.out.println(Arrays.toString(arr));
        max(arr);
        maxInRange(arr,0,2);
    }

    static void maxInRange(int[] arr,int start,int end){
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    static void max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
