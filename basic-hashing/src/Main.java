import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 2};
        int[] elements = {10, 2, 1, 3, 5};
        int[] res = countOfNums(array, array.length, elements);
        System.out.println(Arrays.toString(res));
    }



    // for characters, I've written in js

    //    class Main{
    //        main() {
    //        const s = "abcacsdba";
    //        const target = "abcde";
    //            return this.count(s,target)
    //        }
    //
    //        count(string,target){
    //        const arr = [];
    //            for (let i = 0; i < 26;i++){
    //                arr[i] = 0;
    //            }
    //            for (let s = 0; s < string.length; s++){
    //                //   console.log(this.charToInt(s[string]))
    //                arr[this.charToInt(string[s])] += 1;
    //            }
    //        const ans = [];
    //            for (let t = 0; t < target.length; t++){
    //                ans[t] = arr[this.charToInt(target[t])];
    //            }
    //            return ans;
    //        }
    //
    //        charToInt(char){
    //        const code = 'a'.charCodeAt(0)
    //            return char.charCodeAt(0) - code;
    //        }
    //    }
    //
    //const run = new Main();
    //console.log(run.main());


    // given an array of size n, count the number of times an element appears in array
    public static int[] countOfNums(int[] arr, int n, int[] elements) {
        int[] res = new int[12];
        for (int i = 0; i < n; i++) {
            res[arr[i]] += 1;
        }
        int[] ans = new int[n];
        for (int i = 0; i < elements.length; i++) {
            ans[i] = res[elements[i]];
        }
        return ans;
    }
}