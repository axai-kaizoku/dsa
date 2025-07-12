import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int mini = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            swap(arr,mini, i);
        }
    }

    public static void swap(int[] arr,int start, int target) {
        int temp = arr[start];
        arr[start] = arr[target];
        arr[target] = temp;
    }
}