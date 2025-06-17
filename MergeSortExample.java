import java.util.Arrays;
public class MergeSortExample {
    // Main method to test merge sort
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
    // Recursive merge sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            // Sort left half
            mergeSort(arr, left, mid);
            // Sort right half
            mergeSort(arr, mid + 1, right);
            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }
    // Merge two sorted halves of the array
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two subarrays to merge
        int n1 = mid - left + 1;
        int n2 = right - mid;
        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        // Copy data to temp arrays L[] and R[]
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];
        // Initial indexes of the two subarrays and merged array
        int i = 0, j = 0, k = left;
        // Merge the temp arrays back into arr[left..right]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k++] = L[i++];
        }
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
