package chapterFour;

import java.util.Scanner;

public class AverageScoreTwo {
    public static void main(String[] args) {
        Scanner inputFromKeyboard = new Scanner(System.in);

        int total = 0;
        int counter = 0;

        System.out.println("Enter student grade (Enter -1 to terminate process");
        int gradeInputted = inputFromKeyboard.nextInt();

        if (gradeInputted == -1){
            System.out.println("Process terminated");
        }
        else {
            if (gradeInputted < 0 || gradeInputted > 100){
                System.out.println("Invalid score, please enter a score between 0 and 100");
            }
            else {
                while (gradeInputted != -1){
                    total += gradeInputted;
                    counter++;
                    System.out.println("Enter score");
                    gradeInputted = inputFromKeyboard.nextInt();

                }
            }

            double average = (double)total / counter;
            System.out.println("The class average is " + average);
        }
    }
}
