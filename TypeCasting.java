import java.util.Scanner;

public class TypeCasting {

  public static void main(String[] args) {
    System.out.println("Hello");
    Scanner input = new Scanner(System.in);
    // float num = input.nextFloat();
    // int num = input.nextFloat();
    // System.out.println(num);

    // TypeCasting

    // int num = (int) (67.65f);
    // System.out.println(num);

    // automatic type promotion in expressions

    // int a = 257;
    // byte b = (byte) (a); // 257 % 256 = 1

    // byte a = 40;
    // byte b = 50;
    // byte c = 100;
    // int d = a * b / c;
    // System.out.println(d);

    // int number = 'A';
    // System.out.println(number);

    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 3.34f;
    double d = 0.2343;
    double result = (f * b) + (i / c) - (d * s);
    System.out.println((f * b) + "+" + (i / c) + "-" + (d * s));
    System.out.println(result);
  }
}