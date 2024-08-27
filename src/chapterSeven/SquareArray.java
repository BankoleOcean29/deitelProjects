package chapterSeven;

public class SquareArray {
    public static int[][] squareArray() {
        int size = 10; // Since 10x10 = 100
        int[][] array = new int[size][size];
        int number = 1;

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                array[i][k] = number++;
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.printf("%3d ", num);
            }
            System.out.println();
        }
    }
}
