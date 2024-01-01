import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;


public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter gender: ");
        char gender = in.next().charAt(1);
        int[] days = new int[36];
        int[] OTMoney = new int[36];
        int totalSalary  =  0;
        int totalOTMoney = 0;
        switch (gender){
            case 'M':
//                getOTAmt2();

                System.out.print("Enter the salary: ");
                int salary =  in.nextInt();


                for (int i = 1; i < days.length+1; i++) {
                    System.out.print("Enter the time in (HH:mm) of day " +i+ ": ");
                    String inTimeStr =  in.next();

                    System.out.print("Enter the time out (HH:mm) of day " +i+ ": ");
                    String outTimeStr = in.next();


                    System.out.println("only OT money "+getOTMoney(11,salary,inTimeStr,outTimeStr));
                    System.out.println("earned per day " +getMoneyPerDay(11, salary, inTimeStr,outTimeStr));
                    days[i] = (int) getMoneyPerDay(11,salary,inTimeStr,outTimeStr);
                    OTMoney[i] = (int) getOTMoney(11,salary,inTimeStr,outTimeStr);
//                    System.out.println("Total Days"+ Arrays.toString(days));
                    totalSalary += days[i];
                    totalOTMoney += OTMoney[i];
                }
                System.out.println("Total Days"+ Arrays.toString(days));
                System.out.println("Total salary of the bro: "+totalSalary);
                System.out.println("Total OT amount earned: "+totalOTMoney);
                break;
            case 'F':

                System.out.print("Enter the salary: ");
                int salary1 =  in.nextInt();


                for (int i = 0; i < days.length; i++) {
                    System.out.print("Enter the time in (HH:mm) of day " +i+ ": ");
                    String inTimeStr =  in.next();

                    System.out.print("Enter the time out (HH:mm) of day " +i+ ": ");
                    String outTimeStr = in.next();


                    System.out.println("only OT money "+getOTMoney(10,salary1,inTimeStr,outTimeStr));
                    System.out.println("earned per day " +getMoneyPerDay(10, salary1, inTimeStr,outTimeStr));
                    days[i] = (int) getMoneyPerDay(10,salary1,inTimeStr,outTimeStr);
                    OTMoney[i] = (int) getOTMoney(10,salary1,inTimeStr,outTimeStr);
//                    System.out.println("Total Days"+ Arrays.toString(days));
                    totalSalary += days[i];
                    totalOTMoney += OTMoney[i];
                }
                System.out.println("Total Days"+ Arrays.toString(days));
                System.out.println("Total salary of the bro: "+totalSalary);
                System.out.println("Total OT amount earned: "+totalOTMoney);
                break;
            default:
                System.out.println("Only male and female");
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

    static float getMoneyPerDay(int workingHours,int salary, String inTimeStr, String outTimeStr){
//        Scanner in = new Scanner(System.in);

//        int salary = in.nextInt();
        long day1;
        float earnedAmt = 0;
        int constDay = salary / 30;
//        System.out.println(constDay);
        if (Objects.equals(inTimeStr, "0:0")){
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

                long ot = totalMinutes - workingHours * 60;

                day1 = ot;
//            System.out.println("Day1 OT: "+ day1);

                float daySalary = (float) salary / 30;
                float hrSalary = daySalary / workingHours;
                float minuteSalary = hrSalary / 60;

                earnedAmt = ot * minuteSalary + constDay;
//            System.out.println("Extra amount earned per day: "+ earnedAmt);

            } catch (ParseException e) {
                System.out.println("Invalid time format. Please enter time in HH:mm format.");
            }
        }
//        System.out.print("Enter the time in (HH:mm): ");
//        String inTimeStr = in.next();

//        System.out.print("Enter the time out (HH:mm): ");
//        String outTimeStr = in.next();

        return earnedAmt;
    }



    static float getOTMoney(int workingHours,int salary, String inTimeStr, String outTimeStr){

        long day1;
        float earnedAmt = 0;
        if (Objects.equals(inTimeStr, "0:0")){
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
                long ot = totalMinutes - workingHours * 60;

                day1 = ot;
//            System.out.println("Day1 OT: "+ day1);

                float daySalary = (float) salary / 30;
                float hrSalary = daySalary / workingHours;
                float minuteSalary = hrSalary / 60;

                earnedAmt = ot * minuteSalary;
//            System.out.println("Extra amount earned per day: "+ earnedAmt);

            } catch (ParseException e) {
                System.out.println("Invalid time format. Please enter time in HH:mm format.");
            }
        }
//        System.out.print("Enter the time in (HH:mm): ");
//        String inTimeStr = in.next();

//        System.out.print("Enter the time out (HH:mm): ");
//        String outTimeStr = in.next();

        return earnedAmt;
    }
}
