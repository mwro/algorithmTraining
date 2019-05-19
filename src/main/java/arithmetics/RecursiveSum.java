package arithmetics;

import java.util.Arrays;

public class RecursiveSum {

    public static void main(String... args) {
        int[] input = new int[]{1, 22, -1, 34, 60};
        System.out.println("Sum of array: " + Arrays.toString(input) + " is " + recursiveSum(input));
    }

    public static int recursiveSum(int[] array) {
        return recursiveSum(array, array.length - 1);
    }

    private static int recursiveSum(int[] array, int lastIndexOfArray) {
        if  (lastIndexOfArray == 0) {
            return array[lastIndexOfArray];
        }
        return array[lastIndexOfArray] + recursiveSum(array, --lastIndexOfArray);
    }
}
