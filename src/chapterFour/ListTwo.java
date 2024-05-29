package chapterFour;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ListTwo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = userInput.nextInt();

        if (isEven(number)) {
            System.out.println("The number is an Even number");
        } else {
            System.out.println("The number is odd");
        }

        



    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static boolean isOdd(int num){
        return num % 2 != 0;
    }

    public static boolean isAPrimeNumber(int num){
        if (num <=1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
