package chapterFour;

import java.util.Scanner;

public class AverageClassScore {

    public static void main(String[] args) {
        Scanner inputFromKeyboard = new Scanner(System.in);

        int total = 0;
        int counter = 1;

        while (counter <= 10 ) {
            System.out.println("Enter student " + counter + " score");
            int gradeInputted = inputFromKeyboard.nextInt();
            if (gradeInputted < 0 || gradeInputted > 100){
                System.out.println("Invalid score, please enter a score between 0 and 100");
            }
            else {
                total += gradeInputted;
                counter++;
            }
        }

        double average = (double) total / 10;

        System.out.println("The class average is " + average);
    }
}
