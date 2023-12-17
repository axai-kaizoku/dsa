import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4},
                {32, 52, 1, 24},
                {3, -2, 50, 0, 9},
                {18, 54},
        };
        int target = -2;
//        int[] ans = search2(arr, target);
//        System.out.println(Arrays.toString(ans));
        max(arr);
//        System.out.println(ans);
    }

    //return max in 2d array
    static void max(int[][] arr){
        int num = arr[0][0];
        for (int row = 1; row <arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if(arr[row][col] > num){
                    num = arr[row][col];
                }
            }

        }

        System.out.println("The max number is "+num+" and it's location is [");
    }



    // int[] arr function
    static int[] search2(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }



    // void function
    static void search(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    System.out.println("Found at row "+row+" col "+col);
                }
            }
        }

        System.out.println("Not Found");
    }
}
