public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,32, 33, 4, 45};
        int target = 4;
        int ans = linearSearch(arr, target);
        int ans2 = linearSearch2(arr, target);
        Boolean ans3 = linearSearch3(arr, target);

        System.out.println(ans3);
    }


    // search the target and return true or false
    static Boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        //run a for loop
        for (int element : arr) {
            // check for element at every index
            if (element == target) {
                return true;
            }
        }

        // this line will be executed if no value match in array
        return false;
    }

    // search the target and return target else -1
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int element : arr) {
            // check for element at every index
            if (element == target) {
                return element;
            }
        }

        // this line will be executed if no value match in array
        return -1;
    }



    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index
            int element = arr[index];
            if (element == target){
                return index;
            }
        }

        // this line will be executed if no value match in array
        return -1;
    }

}