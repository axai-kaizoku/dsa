import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Armstrong Program");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int og = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum = sum + digit*digit*digit;
            num = num / 10;
        }
        if (og == sum){
            System.out.println(og + " is a armstrong number");
        }else {
            System.out.println(og + " is not a armstrong number");
        }
        sc.close();
    }
}
