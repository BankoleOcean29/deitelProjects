package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner inputFromKeyboard = new Scanner(System.in);

        int combinedMiles = 0;
        int combinedGallons = 0;
        int counter = 0;

        System.out.println("Congratulations on a completed trip");


        int userInput = 0;

        while (userInput != -1) {
            System.out.println("Enter Miles driven");
            userInput = inputFromKeyboard.nextInt();
            int miles = userInput;
            combinedMiles += userInput;

            System.out.println("Enter gallons used");
            userInput = inputFromKeyboard.nextInt();
            int gallons = userInput;
            combinedGallons += userInput;

            double mileage = (double) gallons / miles;
            System.out.println("The mileage of this trip is "+ mileage);

            counter++;

        }

        double combinedMileage = (double) combinedGallons / combinedMiles;
        System.out.println("The combined mileage of " + counter + "  number of trips is " + combinedMileage);
    }
}
