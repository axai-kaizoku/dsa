public class Highest {
    public static void main(String[] args){
        int[] arr = {7,2,645,9000,5000,98};
        System.out.println(high(arr));
    }


    // To find the highest and second highest number;
    static int high (int[] arr){
        int max = arr[0];
        int secMax = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        return secMax;
    }
}
