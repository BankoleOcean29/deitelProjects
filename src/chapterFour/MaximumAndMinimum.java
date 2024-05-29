package chapterFour;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] numbers = {};
        int max = findMaximum(numbers);
        int min = findMinimum(numbers);

        System.out.println("Maximum number in this array is: " + max);

        System.out.println("Minimum number in this array is: " + min);

    }
    public static int findMaximum(int[] arr) {

        try{
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        catch (ArrayIndexOutOfBoundsException e) {
            throw new NullPointerException("The array is empty.");
        }

    }

    public static int findMinimum(int[] arr) {

        try{
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new NullPointerException("The array is empty.");

        }
    }


}
