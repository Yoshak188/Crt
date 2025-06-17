public class HeapCheck{
    // Check Min Heap
    public static boolean isMinHeap(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (2 * i + 1 < arr.length && arr[i] > arr[2 * i + 1]) return false;
            if (2 * i + 2 < arr.length && arr[i] > arr[2 * i + 2]) return false;
        }
        return true;
    }
    // Check Max Heap
    public static boolean isMaxHeap(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (2 * i + 1 < arr.length && arr[i] < arr[2 * i + 1]) return false;
            if (2 * i + 2 < arr.length && arr[i] < arr[2 * i + 2]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        if (isMinHeap(arr) && isMaxHeap(arr)) {
            System.out.println("Array is both Min Heap and Max Heap (all equal elements).");
        } else if (isMinHeap(arr)) {
            System.out.println("Array satisfies Min Heap property.");
        } else if (isMaxHeap(arr)) {
            System.out.println("Array satisfies Max Heap property.");
        } else {
            System.out.println("Array does NOT satisfy Min or Max Heap property.");
        }
    }
}
