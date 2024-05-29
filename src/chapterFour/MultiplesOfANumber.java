package chapterFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplesOfANumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        List<Integer> multiples = findMultiples(number);

        System.out.println("Multiples of " + number + ": " + multiples);

    }

    public static List<Integer> findMultiples(int number) {
        List<Integer> multiples = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                multiples.add(i);
            }
        }
        return multiples;
    }
}
