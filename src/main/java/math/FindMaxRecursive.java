package math;

import java.util.Arrays;

public class FindMaxRecursive {
    public static void main(String... args) {
        int[] input = new int[]{-1, -220, -1, -34, -60};
        System.out.println("Max number in array: " + Arrays.toString(input) + " is " + findMaxRecursive(input));
    }

    public static int findMaxRecursive(int[] array) {
        return findMaxRecursive(array, 0);
    }

    private static int findMaxRecursive(int[] array, int index) {
        if  (index == array.length - 1) {
            return array[index];
        }

        int current = array[index];
        int nextMax = findMaxRecursive(array, ++index);

        return current > nextMax ? current : nextMax;
    }
}
