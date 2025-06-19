public class PatternsATZ {
    public static void main(String[] args) {
        // greedy algorithm, jump game - II
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int ans = jumps(arr);
        System.out.println(ans);
    }

    static int jumps(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int l = 0, r = 0, jumps = 0, farthest = 0;
        while (r <= n - 1) {
            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + nums[i]);
                if (farthest >= n - 1) {
                    return jumps + 1;
                }
            }
            l = r + 1;
            r = farthest;
            jumps++;
        }
        return jumps;
    }

    static int resursiveApproach(int[] arr, int pos) {
        int n = arr.length;
        if (pos == n - 1) return 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr[i]; i++) {
            if (i + pos < n) {
                min = Math.min(min, resursiveApproach(arr, i + pos));
            }
        }

        return min;
    }
}
