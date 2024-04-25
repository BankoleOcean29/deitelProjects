package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome customer");
        System.out.println("Please type in your account number");
        int accountNumber = userInput.nextInt();

        System.out.println("Please type in your balance for this month");
        int balanceAtTheBeginningOfTheMonth = userInput.nextInt();

        System.out.println("Please type in the total of items charged");
        int totalItemsCharged = userInput.nextInt();

        System.out.println("Please type in your total credits used");
        int totalCreditsUsed = userInput.nextInt();

        System.out.println("Please type in your allowed credit limit");
        int allowedCreditLimit = userInput.nextInt();

        DepartmentStoreCustomer customer = new DepartmentStoreCustomer(accountNumber, balanceAtTheBeginningOfTheMonth,
                totalItemsCharged, totalCreditsUsed, allowedCreditLimit);

        int newCustomerBalance = customer.calculateNewBalance(balanceAtTheBeginningOfTheMonth, totalItemsCharged,
                totalCreditsUsed);

        System.out.println("Your new balance is: " + newCustomerBalance);

        if (totalCreditsUsed > customer.allowedCreditLimit) {
            System.out.println("Credit limit exceeded");
        }



    }
}
