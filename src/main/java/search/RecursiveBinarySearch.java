package search;

public class RecursiveBinarySearch {

    private static int iterationCount = 0;

    public static void main(String... args) {
        int[] input = new int[]{1, 2, 16, 17, 70, 110, 207, 306, 400};
        System.out.println(recursiveBinarySearch(input, 3060));
    }

    public static int recursiveBinarySearch(int[] array, int item) {
        int lowIndex = 0;
        int highIndex = array.length - 1;

        return recursiveBinarySearch(array, item, lowIndex, highIndex);
    }

    private static int recursiveBinarySearch(int[] array, int item, int lowIndex, int highIndex) {
        iterationCount++;
        int midIndex = (lowIndex + highIndex)/2;
        int midValue = array[midIndex];
        if (midValue == item) {
            System.out.println("Completed search of array of size " + array.length + " in " + iterationCount + " steps.");
            return midIndex;
        }

        if (lowIndex == midIndex) {
            System.out.println("Completed search of array of size " + array.length + " in " + iterationCount + " steps, no result found.");
            return -1;
        }

        if (midValue > item) {
            highIndex = midIndex - 1;
        } else {
            lowIndex = midIndex + 1;
        }
        return recursiveBinarySearch(array, item, lowIndex, highIndex);
    }
}
