public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {3,2,0,1};
        System.out.println(findMissing(arr));
    }

    static int findMissing(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int current = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[current]){
                swap(arr,i,current);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
