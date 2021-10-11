/**
 * BubbleSort
 * 
 * It is the simplest sort method which performs sorting by repeatedly moving
 * the largest element to the highest index of the array. It comprises of
 * comparing each element to its adjacent element and replace them accordingly.
 * 
 * In Pass 1, A[0] is compared with A[1], A[1] is compared with A[2], A[2] is
 * compared with A[3] and so on. At the end of pass 1, the largest element of
 * the list is placed at the highest index of the list. In Pass 2, A[0] is
 * compared with A[1], A[1] is compared with A[2] and so on. At the end of Pass
 * 2 the second largest element of the list is placed at the second highest
 * index of the list. In pass n-1, A[0] is compared with A[1], A[1] is compared
 * with A[2] and so on. At the end of this pass. The smallest element of the
 * list is placed at the first index of the list.
 * 
 * 
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23 };
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Printing Sorted List ...");
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}