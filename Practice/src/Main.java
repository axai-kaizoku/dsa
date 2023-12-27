public class Main {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};
        int target = 14;
        int ans = find(arr, target);
        System.out.println(ans);
    }

    static int find(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) return i;
        }
        return -1;
    }
}