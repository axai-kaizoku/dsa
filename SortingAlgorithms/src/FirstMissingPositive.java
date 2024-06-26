import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args){
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissing(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int firstMissing(int[] arr){
        int i = 0;
        while (i < arr.length){
            int current = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[current]){
                swap(arr,i,current);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                return index+1;
            }
        }

        return arr.length+1;
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
