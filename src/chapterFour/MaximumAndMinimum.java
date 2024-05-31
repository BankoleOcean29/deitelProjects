package chapterFour;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] numbers = {8, 5, 9};
        int max = findMaximum(numbers);
        int min = findMinimum(numbers);

        System.out.println("Maximum number in this array is: " + max);

        System.out.println("Minimum number in this array is: " + min);

    }
    public static int findMaximum(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array is null or empty.");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                    max = arr[i];
                }
            }
        return max;
    }

    public static int findMinimum(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array is null or empty.");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        return min;

    }
}
