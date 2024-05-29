package chapterThree;

import java.util.Scanner;

public class Cryptography {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Hi, enter your pin");


    }

    private static int encryptData(int userInput) {
        int firstNumber = userInput / 1000;
        int revFirstNumber = firstNumber + 7 % 10;



        return 8;



    }
}
