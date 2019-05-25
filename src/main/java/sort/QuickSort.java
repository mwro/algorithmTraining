package sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String... args) {
        int[] array = new int[]{23, -1, 43, 0, 55, 1000, -3456, 122, 12, 87, -762, 45312, 87};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = divide(array, start, end);

            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex, end);
        }
    }

    private static int divide(int[] array, int start, int end) {
        int pivot = array[end];
        int lowerIndex = start - 1;

        for (int upperIndex = start; upperIndex < end; upperIndex++) {
            int current = array[upperIndex];
            if (current > pivot) {
                continue;
            }
            lowerIndex++;
            swap(array, lowerIndex, upperIndex);
        }

        lowerIndex++;
        swap(array, lowerIndex, end);

        return lowerIndex;
    }

    private static void swap(int[] array, int lowerIndex, int upperIndex) {
        if (lowerIndex == upperIndex) {
            return;
        }

        int temp = array[lowerIndex];
        array[lowerIndex] = array[upperIndex];
        array[upperIndex] = temp;
    }
}
