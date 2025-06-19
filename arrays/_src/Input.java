import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 34;
        arr[2] = 2;
        arr[3] = 87;
        arr[4] = 12;
        System.out.println(Arrays.toString(arr));
        // input using for loops

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] +  " ");
//        }

//        for (int num: arr) {
//            System.out.print(num + " ");
//        }


        //Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        str[0] = "axai";
        System.out.println(Arrays.toString(str));
    }
}
