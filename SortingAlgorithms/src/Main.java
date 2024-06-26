import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,3,3,7};
//        bubble(arr);
//        selection(arr);
//        insertion(arr);
//        cycle(arr);
//        System.out.println(missingNumber(arr));
        findAllMissing(arr);
        System.out.println(Arrays.toString(arr));
    }



    static void findAllMissing(int[] arr){
        int i = 1;
        while(i < arr.length){
            int current = arr[i] - 1;
            if (arr[i] != arr[current]){
                swap(arr,i,current);
            } else{
                i++;
            }
        }



        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                System.out.println(index+1);
            }
        }


    }

    static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int current = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[current]){
                swap(arr,i,current);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }

        return arr.length;
    }

    static void cycle(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            } else{
                i++;
            }
        }
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }

        }
    }

    static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped){
                break;
            }
        }
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }




    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr,int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}