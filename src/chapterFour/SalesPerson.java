package chapterFour;

public class SalesPerson {

    final int WEEKLY_WAGE = 200;

    double calculateGrossPay(double totalMerchandiseSold) {
        double grossPay = totalMerchandiseSold * 0.09;
        return grossPay;
    }
}
