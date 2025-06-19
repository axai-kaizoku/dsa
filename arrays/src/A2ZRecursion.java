import java.util.ArrayList;
import java.util.Arrays;

public class A2ZRecursion {
    public static void main(String[] args) {
//        printing(5);
//        System.out.println(factorialNumberEn(6L));
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
//        printN(1,3);
//        sumN(3,0);
    }

    static void reverse(int[] arr){
        int n = arr.length;
        reverseFn(arr,0,n);
    }

    static void reverseFn(int[] arr,int i,int n){
        if (i >= n/2){
            return;
        }
        swap(arr,i,n-i-1);
        reverseFn(arr,i+1,n);
    }

    static void swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }



    static void sumN(int i, int sum){
        if (i < 1){
            System.out.println(sum);
            return;
        }
        sumN(i-1,sum+i);
    }

    static void printN(int i , int n){
//        if (i>n){
//            return;
//        }
//        printN(i+1,n);
//        System.out.println(i);
        if (i > n){
            return;
        }
        System.out.println(i);
        printN(i+1,n);
    }

    static void reverseAnArray(int[] arr, int n) {
        n = n - 1;
        for (int i = 0; i <= n; i++) {
            if (i <= n / 2) {
                int temp = arr[i];
                arr[i] = arr[n - i];
                arr[n - i] = temp;
            }
        }
    }


    static ArrayList<Long> factorialNumberEn(long n) {
        ArrayList<Long> res = new ArrayList<>();
        generateFactorials(1, 1L, n, res);
        return res;
    }

    static void generateFactorials(long i, long fact, long n, ArrayList<Long> res) {
        if (fact > n) return;
        res.add(fact);
        generateFactorials(i + 1, fact * (i + 1), n, res);
    }

    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int fact = factorial((int) i);
            if (fact <= n) {
                res.add((long) fact);
            }
        }
        return res;
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int sumOfSeries(int n) {
        // code here
        if (n == 1) {
            return 1;
        }
        return n * n * n + sumOfSeries(n - 1);
    }

    static void printing(int count) {
        if (count == 0) {
            return;
        }
        printing(count - 1);
        System.out.print(count);
    }


    // this is printing in reverse order, (understand this by drawing a recursive tree);
    public static void printNos(int n) {
        // Code here
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNos(n - 1);
        System.out.print(n + " ");
        return;
    }
}
