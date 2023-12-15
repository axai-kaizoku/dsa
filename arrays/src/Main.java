import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 19;
        // Q: store a persons name
        String name = "Akshay";
        // Q: store five roll numbers
//        int[] rnos = new int[5];
//        int[] rollnos = {12,3,4,5,5};
//        System.out.println(name);
        int[] ros;
        ros = new int[5];
        ros[2] = 27;

//        System.out.println(ros[2]);

        String[] arr = new String[2];
        arr[1] = name;
        String[] names = {"Akshay", "Thanay"};
//        System.out.println(names.length);
//        System.out.println(arr[1]);

        for(String str: names) {
            System.out.println(str);
        }

        }
    }
