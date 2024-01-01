import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nattu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time in (HH:mm): ");
        String inTimeStr = scanner.next();

        System.out.print("Enter the time out (HH:mm): ");
        String outTimeStr = scanner.next();



        try {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");

            Date inTime = format.parse(inTimeStr);
            Date outTime = format.parse(outTimeStr);

            long diff = outTime.getTime() - inTime.getTime();
            long hours = diff / (60 * 60 * 1000) % 24;
            long minutes = diff / (60 * 1000) % 60;

            System.out.println("Total hours worked: " + hours + " hours and " + minutes + " minutes.");
        } catch (ParseException e) {
            System.out.println("Invalid time format. Please enter time in HH:mm format.");
        } finally {
            scanner.close();
        }
    }
}