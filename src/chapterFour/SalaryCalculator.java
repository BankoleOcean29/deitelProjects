package chapterFour;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double hourlyWage;
        int hoursWorked;
        int overTime;
        double overTimeAmount;
        double straightTimeAmount;
        double grossPay;
        int counter = 1;

        while (counter <= 3) {
            System.out.println("Enter Employee's hourly wage");
            hourlyWage = userInput.nextInt();
            System.out.println("Enter Employee's hours worked for the week");
            hoursWorked = userInput.nextInt();
            if (hoursWorked > 40) {
                overTime = hoursWorked - 40;
                overTimeAmount = overTime * hourlyWage/2;
                straightTimeAmount = 40 * hourlyWage;
                grossPay = overTimeAmount + straightTimeAmount;


            }
        }
    }
}
