package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account ob = new Account("Kona", 99);
        Account ob2 = new Account("kai", 98);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit for your account");
        double deposit = input.nextDouble();
        ob.deposit(deposit);
        System.out.println(ob.getBalance());

        System.out.println("Enter withdrawal amount for your account");
        double withdrawal = input.nextDouble();
        ob.withdraw(withdrawal);
        System.out.println(ob.getBalance());

    }
}
