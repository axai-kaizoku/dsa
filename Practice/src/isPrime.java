import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int n = 19;
        boolean ans = isPrime2(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        int c = 2;
        while(c <= n) {
            if (n %c == 0) {
                return false;
            }
            c++;
        }
        if(c*c >n){
            return true;
        }
        return false;

    }


    static boolean isPrime2(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;  // 2 is the only even prime number
        }

        // If n is even, it cannot be prime
        if (n % 2 == 0) {
            return false;
        }

        // Check odd divisors from 3 up to half of n
        for (int i = 3; i <= n / 2; i += 2) {
            if (n % i == 0) {
                return false;  // Found a divisor, hence not prime
            }
        }

        return true;  // No divisors found, hence prime
    }

}
