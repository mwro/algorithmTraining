package search;

public class BinarySearch {

    public static void main(String... args) {
        int[] input = new int[]{1, 2, 16, 17, 70, 110, 207, 306, 400};
        System.out.println(binarySearch(input, 306));
    }

    public static int binarySearch(int[] array, int item) {
        int iterationCount = 0;

        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            iterationCount++;

            int midIndex = (lowIndex + highIndex)/2;
            int midValue = array[midIndex];
            if (midValue == item) {
                System.out.println("Completed search of array of size " + array.length + " in " + iterationCount + " steps.");
                return midIndex;
            } else if (midValue > item) {
                highIndex = midIndex - 1;
            } else {
                lowIndex = midIndex + 1;
            }
        }
        System.out.println("Completed search of array of size " + array.length + " in " + iterationCount + " steps, no result found.");
        return -1;
    }
}
