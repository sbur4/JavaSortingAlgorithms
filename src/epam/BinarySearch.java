package epam;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arrSorted = { 1, 4, 7, 10, 13 };
        int key = 4;
        int position = binarySearch(arrSorted, key);
        System.out.println(key + " position is " + position);
    }

    static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                System.out.println("Key found");
                return middle;
            }

            if (arr[middle] < key) {
                System.out.println("Cut left half");
                left = middle + 1;
            }

            if (arr[middle] > key) {
                System.out.println("Cut right half");
                right = middle - 1;
            }

        }

        return -1;
    }

}