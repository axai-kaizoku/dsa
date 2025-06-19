import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr)+  " Input Array");

//        swap(arr, 0, arr.length - 1);

//        System.out.println(Arrays.toString(arr) + " Only Swaped two numbers");
        reverse(arr);
        System.out.println(Arrays.toString(arr) + " The is reversed one");

    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
