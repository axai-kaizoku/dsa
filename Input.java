import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // System.out.print("Please enter your roll no: ");
    // int rollno = input.nextInt();
    // System.out.println("Your roll no is : " + rollno);

    // int a = 10;
    // System.out.println("Hey are you number " + a);

    // String name = input.nextLine();
    // String name = input.next();

    float marks = input.nextFloat();
    Integer score = 90;
    System.out.println(marks);
    input.hasNext("Hey");
  }
}