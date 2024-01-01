import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Created by DMC-Nero, axai-kaizoku
        System.out.println("Enter the first number: ");
        int number1 = in.nextInt();
        System.out.println("Enter the Second number: ");
        int number2 = in.nextInt();

        int a, b, c, d, e;
        int whilelp = 1;
        while (whilelp != 6) {
            System.out.println("To perform addition enter 1, ");
            System.out.println("To perform subtraction enter 2, ");
            System.out.println("To perform multiplication enter 3, ");
            System.out.println("To perform division enter 4,  ");
            System.out.println("To perform remainder enter 5,  ");
            System.out.println("To exit press 6, ");
            int algo = in.nextInt();

            switch (algo) {
                case 1:
                    a = number1 + number2;
                    System.out.println("Addition of the given numbers: " + a);
                    break;
                case 2:
                    b = number1 - number2;
                    System.out.println("Subtraction of the given numbers: " + b);
                    break;
                case 3:
                    c = number1 * number2;
                    System.out.println("Multiplication of the given numbers: " + c);
                    break;
                case 4:
                    d = number1 / number2;
                    System.out.println("Division of the given numbers: " + d);
                    break;
                case 5:
                    e = number1 % number2;
                    System.out.println("Remainder of the given numbers: " + e);
                    break;
                case 6:
                    System.out.println("Exiting the calculator. Goodbye!");
                    whilelp = 6;
                    break;
                default:
                    System.out.println("No such operation found!!");
                    break;
            }

//            if (whilelp == 6) break;
        }
    }
}
