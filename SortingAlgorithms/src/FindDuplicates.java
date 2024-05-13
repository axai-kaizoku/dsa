import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        findDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int current = arr[i] - 1;
            if (arr[i] != arr[current]){
                swap(arr,i,current);
            } else {
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index+1){
                ans.add(arr[index]);
            }
        }

        System.out.println(ans);
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
