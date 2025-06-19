import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        change(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
