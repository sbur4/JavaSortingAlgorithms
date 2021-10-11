import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Bucket Sort
 * 
 * Bucket sort is also known as bin sort. It works by distributing the element
 * into the array also called buckets. Buckets are sorted individually by using
 * different sorting algorithm.
 * 
 * Let B[0….n-1] be a new array n=length[A] for i=0 to n-1 make B[i] an empty
 * list for i=1 to n do insert A[i] into list B[n a[i]] for i=0 to n-1 do sort
 * list B[i] with insertion-sort Concatenate lists B[0], B[1],..……, B[n-1]
 * together in order
 * 
 */

public class BucketSort {

    public static void main(String[] args) {
        int[] arr = { 80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50 };

        System.out.println("Original Array: " + Arrays.toString(arr));
        bucketSort(arr);
        for (int i = 0, limit = arr.length - 1; i < limit; ++i) {
            assert arr[i] <= arr[i + 1];
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }

    /**
     * BucketSort algorithms implements
     *
     * @param arr the array contains elements
     */
    private static void bucketSort(int[] arr) {
        /* get max value of arr */
        int max = max(arr);
        /* get min value of arr */
        int min = min(arr);
        /* number of buckets */
        int numberOfBuckets = max - min + 1;
        List<List<Integer>> buckets = new ArrayList<>(numberOfBuckets);
        /* init buckets */
        for (int i = 0; i < numberOfBuckets; ++i) {
            buckets.add(new ArrayList<>());
        }
        /* store elements to buckets */
        for (int value : arr) {
            int hash = hash(value, min, numberOfBuckets);
            buckets.get(hash).add(value);
        }
        /* sort individual bucket */
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        /* concatenate buckets to origin array */
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index++] = value;
            }
        }
    }

    /**
     * Get index of bucket which of our elements gets placed into it.
     *
     * @param elem           the element of array to be sorted
     * @param min            min value of array
     * @param numberOfBucket the number of bucket
     * @return index of bucket
     */
    private static int hash(int elem, int min, int numberOfBucket) {
        return (elem - min) / numberOfBucket;
    }

    /**
     * Calculate max value of array
     *
     * @param arr the array contains elements
     * @return max value of given array
     */
    public static int max(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Calculate min value of array
     *
     * @param arr the array contains elements
     * @return min value of given array
     */
    public static int min(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

}