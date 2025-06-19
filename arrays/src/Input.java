import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 45;
        arr[3] = 67;

//        System.out.println(arr[4]);
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++){
////            arr[i] = in.nextInt();
//        }

//        for (int i = 0; i < arr.length; i++){
////            System.out.print(arr[i] + " ");
//        }

//        for (int i: arr){
//            System.out.print(i + " ");
//        }


        String[] str = new String[3];
        for(int i = 0; i < str.length; i++){
//            System.out.print(str[i]);
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

    }
}
