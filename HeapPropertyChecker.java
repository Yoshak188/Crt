public class HeapPropertyChecker {
    // Function to check if array satisfies Min Heap property
    public static boolean isMinHeap(int[] heap) {
        int n = heap.length;
        // Only need to check internal (non-leaf) nodes
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            // Check if left child is smaller
            if (left < n && heap[i] > heap[left]) {
                return false;
            }
            // Check if right child is smaller
            if (right < n && heap[i] > heap[right]) {
                return false;
            }
        }
        return true; // Heap property is maintained
    }
    public static void main(String[] args) {
        // Test heap arrays
        int[] validHeap = {5, 10, 15, 20, 25};     // This is a valid min heap
        int[] invalidHeap = {10, 5, 20, 15};       // This violates min heap property
        // Check and print results
        System.out.println("Is validHeap a Min Heap? " + isMinHeap(validHeap));
        System.out.println("Is invalidHeap a Min Heap? " + isMinHeap(invalidHeap));
    }
}
