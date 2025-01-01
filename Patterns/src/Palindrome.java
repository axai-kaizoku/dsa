import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palindrome Program");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int og = num;
        int reversed = 0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if (og == reversed){
            System.out.println(og + " is a palindrome");
        }else {
            System.out.println(og + " is not a palindrome");
        }
    }
}
