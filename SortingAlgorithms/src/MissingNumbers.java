import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        missing(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void missing(int[] arr){
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

//        System.out.println(arr.length);

//        System.out.println(arr);
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
