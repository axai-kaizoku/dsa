public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4},
                {2,1,2},
        };
        System.out.println(richest(arr));
    }

    static int richest(int[][] accounts){
        int rich = 0;
        //person row
        //acount col
        for (int[] ints : accounts) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            //check with overall answers
            if (sum > rich) {
                rich = sum;
            }
        }


        return rich;
    }
}
