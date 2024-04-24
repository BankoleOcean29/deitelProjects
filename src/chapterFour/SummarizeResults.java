package chapterFour;

import java.util.Scanner;

public class SummarizeResults {

    public static void main(String[] args) {
        Scanner inputFromKeyboard = new Scanner(System.in);

        int counter = 1;
        int counterForOne = 0;
        int counterForTwo = 0;

        while (counter <= 10){
            System.out.println("Enter results");
            int result = inputFromKeyboard.nextInt();
            if (result < 1 || result > 2) {
                System.out.println("Invalid result, please enter numbers 1 or 2");
            }
            if (result == 1){
                counterForOne++;
            }
            else {
                counterForTwo++;
            }
            counter++;
        }

        System.out.println("Number of students that passed are: " + counterForOne);

        System.out.println("Number of students that passed are: " + counterForTwo);


    }
}
