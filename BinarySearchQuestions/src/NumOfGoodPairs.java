public class NumOfGoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,1,1,0,1};
        System.out.println(numIdenticalPairs(arr));
    }
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
