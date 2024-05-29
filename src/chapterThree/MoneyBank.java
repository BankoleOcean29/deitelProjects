package chapterThree;

import java.util.Scanner;

public class MoneyBank {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        System.out.println("Welcome customer, please fill in your details");
        System.out.println("Enter your name");
        String name = userInput.next();
        System.out.println("Enter your account number");
        int accountNumber = userInput.nextInt();
        System.out.println("Enter your ID");
        int id = userInput.nextInt();
        System.out.println("Enter your account balance");
        double accountBalance = userInput.nextDouble();



        Customer c1 = new Customer(name, accountNumber, id, accountBalance);

        Customer c3 = new Customer("jerry", 78, 8900);

        System.out.println("Your accouoknt details are: ");
        System.out.println(c1.getName());
        System.out.println(c1.getAccountNumber());
        System.out.println(c1.getId());
        System.out.println(c1.getAccountBalance());
    }
}
