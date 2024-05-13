import java.util.Arrays;

public class DuplicateNum {
    public static void main(String[] args){
        int[] arr = {3,3,3,3,3};
        duplicate(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void duplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            int current = arr[i] - 1;
            if (arr[i] != arr[current]){
                swap(arr,i,current);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                System.out.println(arr[index]);
            }
        }
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
