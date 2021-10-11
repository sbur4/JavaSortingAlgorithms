import java.util.Arrays;

/**
 * Quick Sort
 * <p>
 * Quick sort is the most optimized sort algorithms which performs sorting in O(n log n) comparisons.
 * Like Merge sort, quick sort also work by using divide and conquer approach.
 */
public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        int[] x = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        System.out.println("Before");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("After sort");
        System.out.println(Arrays.toString(x));
    }
}
