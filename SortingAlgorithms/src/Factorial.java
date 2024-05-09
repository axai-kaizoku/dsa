public class Factorial {
    public static void main(String[] args){
//        System.out.println(fact(5));
//        System.out.println(fib(5));
        fib(10);
    }

    static int fact(int n){
        if (n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

    static void fib(int n){
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a+", ");
            int temp = a;
            a = b;
            b = temp+a;
        }
    }
}
