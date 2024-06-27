package chapterSix;

import java.security.SecureRandom;

public class GameOfChance {

    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        int dieOne;
        int dieTwo;

        int[][][] b = new int[3][3][5];

        int[][] c = {{1, 2}, {4, 8}};

        System.out.println("The random game");

        dieOne = 1 + randomNumbers.nextInt(6);
        dieTwo = 1 + randomNumbers.nextInt(6);

        int sumOfDiceValues = dieOne + dieTwo;




    }
}