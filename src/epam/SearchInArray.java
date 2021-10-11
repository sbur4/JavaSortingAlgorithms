package epam;

public class SearchInArray {

    public static void main(String[] args) {
        int[] arr = { 77, 555, 8, 5433, 01 };
        printMax(arr);
        printMin(arr);
    }

    static void printMax(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        int comparisons = 0;
        int replacments = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
                replacments++;
            }
            comparisons++;
        }

        System.out.println("Max element: " + max);
        System.out.println("Max element index : " + maxIndex);
        System.out.println("Comparison : " + comparisons);
        System.out.println("Replacments : " + replacments);
    }

    static void printMin(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        int comparisons = 0;
        int replacments = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
                replacments++;
            }
            comparisons++;
        }

        System.out.println("Min element: " + min);
        System.out.println("Min element index : " + minIndex);
        System.out.println("Comparison : " + comparisons);
        System.out.println("Replacments : " + replacments);
    }
}