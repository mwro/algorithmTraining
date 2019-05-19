package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String... args) {
        int[] array = new int[]{23, -1, 43, 0, 55, 1000, -3456, 122, 12, 87, -762, 45312};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int arrayLength = array.length;

        int iterationCount = 0;
        for (int i = 0; i < arrayLength; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
                iterationCount++;
            }

            swap(array, i, minIndex);
            iterationCount++;
        }
        System.out.println("Completed selection sort of array of size " + array.length + " in " + iterationCount + " iterations.");
    }

    private static void swap(int[] array, int index1, int index2) {
        int value1 = array[index1];
        array[index1] = array[index2];
        array[index2] = value1;
    }
}
