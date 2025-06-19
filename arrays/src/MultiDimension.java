import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            123
            456
            789
         */
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
//                System.out.println(col);
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
