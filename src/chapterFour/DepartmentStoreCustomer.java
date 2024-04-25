package chapterFour;

public class DepartmentStoreCustomer {

    int accountNumber;
    int balanceAtTheBeginningOfTheMonth;
    int totalItemsCharged;
    int totalCreditsUsed;
    int allowedCreditLimit;

    public DepartmentStoreCustomer(int accountNumber, int balanceAtTheBeginningOfTheMonth, int totalItemsCharged, int totalCreditsUsed, int allowedCreditLimit) {
        this.accountNumber = accountNumber;
        this.balanceAtTheBeginningOfTheMonth = balanceAtTheBeginningOfTheMonth;
        this.totalItemsCharged = totalItemsCharged;
        this.totalCreditsUsed = totalCreditsUsed;
        this.allowedCreditLimit = allowedCreditLimit;
    }

    int calculateNewBalance(int beginningBalance, int charges, int credit) {
        int newBalance = beginningBalance + charges - credit;
        return  newBalance;

    }
}
