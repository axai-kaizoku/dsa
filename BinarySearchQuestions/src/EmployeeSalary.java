import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter gender: ");
        char gender = in.next().charAt(1);

        switch (gender){
            case 'M':
//                getOTAmt2();

                System.out.println("Enter the salary: ");
                int salary = in.nextInt();

                System.out.print("Enter the time in (HH:mm): ");
                String inTimeStr = in.next();

                System.out.print("Enter the time out (HH:mm): ");
                String outTimeStr = in.next();


                System.out.println(getOTMoney(salary,inTimeStr,outTimeStr));
                int x = salary / 30;
                System.out.println("Total amount earned per day: "+((float) x + getOTMoney(salary,inTimeStr,outTimeStr)));

                break;
            case 'F':

                System.out.println("Enter the salary: ");
                int salary1 = in.nextInt();

                System.out.print("Enter the time in (HH:mm): ");
                String inTimeStr1 = in.next();

                System.out.print("Enter the time out (HH:mm): ");
                String outTimeStr1 = in.next();

//                System.out.println(getOTMoney(salary1,inTimeStr1,outTimeStr1));
                System.out.println(getMoneyPerDay(salary1,inTimeStr1,outTimeStr1));


                break;
            default:
                break;
        }
    }


//    static float getOTAmt2(){
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter the salary: ");
//        int salary1 = in.nextInt();
//
//        System.out.print("Enter the time in (HH:mm): ");
//        String inTimeStr1 = in.next();
//
//        System.out.print("Enter the time out (HH:mm): ");
//        String outTimeStr1 = in.next();
//        return getOTMoney(salary1,inTimeStr1,outTimeStr1);
//
//    }

    static float getMoneyPerDay(int salary, String inTimeStr, String outTimeStr){
        Scanner in = new Scanner(System.in);

//        int salary = in.nextInt();
        long day1;
        float earnedAmt = 0;
        int constDay = salary / 30;
        if (inTimeStr == "0:0"){
            earnedAmt = 0;
        } else {
            try {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm");

                Date inTime = format.parse(inTimeStr);
                Date outTime = format.parse(outTimeStr);

                long diff = outTime.getTime() - inTime.getTime();
                long hours = diff / (60 * 60 * 1000) % 24;
                long minutes = diff / (60 * 1000) % 60;
                long totalMinutes = hours * 60 + minutes;
//            System.out.println("Total minutes worked: " + totalMinutes);
                long ot = totalMinutes - 660;

                day1 = ot;
//            System.out.println("Day1 OT: "+ day1);

                float daySalary = (float) salary / 30;
                float hrSalary = daySalary / 11;
                float minSalary = hrSalary / 60;

                earnedAmt = ot * minSalary + constDay;
//            System.out.println("Extra amount earned per day: "+ earnedAmt);

            } catch (ParseException e) {
                System.out.println("Invalid time format. Please enter time in HH:mm format.");
            } finally {
                in.close();
            }
        }
//        System.out.print("Enter the time in (HH:mm): ");
//        String inTimeStr = in.next();

//        System.out.print("Enter the time out (HH:mm): ");
//        String outTimeStr = in.next();

        return earnedAmt;
    }



    static float getOTMoney(int salary, String inTimeStr, String outTimeStr){
        Scanner in = new Scanner(System.in);

//        int salary = in.nextInt();
        long day1;
        float earnedAmt = 0;

            try {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm");

                Date inTime = format.parse(inTimeStr);
                Date outTime = format.parse(outTimeStr);

                long diff = outTime.getTime() - inTime.getTime();
                long hours = diff / (60 * 60 * 1000) % 24;
                long minutes = diff / (60 * 1000) % 60;
                long totalMinutes = hours * 60 + minutes;
//            System.out.println("Total minutes worked: " + totalMinutes);
                long ot = totalMinutes - 660;

                day1 = ot;
//            System.out.println("Day1 OT: "+ day1);

                float daySalary = (float) salary / 30;
                float hrSalary = daySalary / 11;
                float minSalary = hrSalary / 60;

                earnedAmt = ot * minSalary;
//            System.out.println("Extra amount earned per day: "+ earnedAmt);

            } catch (ParseException e) {
                System.out.println("Invalid time format. Please enter time in HH:mm format.");
            } finally {
                in.close();
            }

//        System.out.print("Enter the time in (HH:mm): ");
//        String inTimeStr = in.next();

//        System.out.print("Enter the time out (HH:mm): ");
//        String outTimeStr = in.next();

        return earnedAmt;
    }
}
