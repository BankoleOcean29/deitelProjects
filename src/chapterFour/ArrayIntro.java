package chapterFour;

public class ArrayIntro {
    public static void main(String[] args) {

        int[] numbers = {11, 25, 7, 49, 19};
        int target = 7;
        boolean trueOrFalse = containsNumber(numbers, target);
        System.out.println("Does the array contain " + target + "? " + trueOrFalse);

    }
    public static boolean containsNumber(int[] arr, int num) {
        for (int value : arr) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }
}
