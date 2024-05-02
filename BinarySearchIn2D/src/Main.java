
//write a java program to find the second-highest number in the array using for loop
//{233,423,567,789,547, 899,921,272,455}
public class Main {
    public static void main(String[] args) {
        int[] arr = {0,3,4,5,2,-3,56,90,-90};
        System.out.println(secHigh(arr));
        int t = 30;
//        System.out.println(binarySearch(arr,t));
//        System.out.println(findNearest(arr,t));
//        System.out.println(orderAgnostic(arr,t));
    }


    static int orderAgnostic(int[] arr,int t) {
        int s = 0;
        int e = arr.length - 1;

        boolean isAsc = arr[s] < arr[e];

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (t == arr[m]){
                return m;
            }

            if (isAsc) {
                if (t > arr[m]){
                    s = m+1;
                } else if (t < arr[m]){
                    e = m-1;
                }
            } else {
                if (t > arr[m]){
                    e = m-1;
                } else if (t < arr[m]) {
                    s = m +1;
                }
            }
        }

        return -1;
    }

    static int findNearest(int[] arr, int t) {
        int s = 0;
        int e = arr.length - 1;
        int temp = 0;
        while(s <= e) {
            int m = s + (e - s) /2;
            if (t < arr[m]){
                e = m-1;
            } else if (t > arr[m]){
                s = m+1;
            } else{
                return m;
            }
        }
        return s;
    }

    static int binarySearch(int[] arr, int t) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int m = s + (e - s) / 2;
            if (t > arr[m]){
                s = m+1;
            } else if (t < arr[m]){
                e = m-1;
            } else {
                return m;
            }
        }

        return -1;
    }

    static int secHigh(int[] arr) {
        int highest = 0;
        int secHighest = 0;
            for (int i:arr){
                if (i > highest){
                    secHighest = highest;
                    highest = i;
                } else if (i > secHighest && i != secHighest) {
                    secHighest = i;
                }
            }
        return secHighest;
    }
}