import java.util.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {181, 1214, 91, 164, 98, 1};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num: nums){
            if (even(num)){
                count++;
            }
        }

        return count;
    }


    // function to check whether number is even or odd;
    static boolean even(int num) {
        int numberOfDigits = digits(num);
//        if (numberOfDigits % 2 == 0) {
//            return true;
//        }
//        return false;
        return numberOfDigits % 2 == 0;
    }


    static int digits2(int num){

        if(num < 0) {
            num = num * -1;
        }

        return (int)(Math.log10(num)) + 1;
    }


    // count the number of digits in a number
    static int digits(int num) {
        int count = 0;
        while(num > 0){
            count++;
            num = num/10; // num /= 10
        }
        return count;
    }
}
