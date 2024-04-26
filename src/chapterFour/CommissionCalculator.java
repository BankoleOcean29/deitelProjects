package chapterFour;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Items items = new Items();
        SalesPerson salesPerson = new SalesPerson();

        int counter = 0;
        double numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        int numberFour = 0;


        while (counter < 4) {
            counter++;
            System.out.println("Enter the number of products sold for Product " + counter);
            int numberOfProductsSold = userInput.nextInt();
            if (counter == 1){
                numberOne = numberOfProductsSold;
            } else if (counter == 2) {
                numberTwo = numberOfProductsSold;
            } else if (counter == 3) {
                numberThree = numberOfProductsSold;
            } else if (counter == 4) {
                numberFour = numberOfProductsSold;
            }
        }

        double valueOfItemsOne = numberOne * items.itemOne;
        double valueOfTwo = numberTwo * items.itemTwo;
        double valueThree = numberThree * items.itemThree;
        double valueFour = numberFour * items.itemFour;

        double totalValeOfItemsSold = valueOfItemsOne + valueOfTwo + valueThree + valueFour;

        double grossPay = salesPerson.calculateGrossPay(totalValeOfItemsSold);
        double totalEarnings = grossPay + salesPerson.WEEKLY_WAGE;

        System.out.println("Gross pay for this week is :" + grossPay);
        System.out.println("Total earnings for the week is: " + totalEarnings);

    }
}
