public class InsertionSortExample{
    public static void insertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int key=arr[i];        // Current element
            int j=i-1;
            // Move elements greater than key one position ahead
            while(j>=0&&arr[j]>key){
                arr[j + 1]=arr[j];
                j--;
            }
            arr[j + 1]=key;        // Insert key at correct position
        }
    }
    public static void main(String[] args){
        int[] arr={9, 5, 1, 4, 3};
        System.out.println("Before sorting:");
        for (int num:arr)
            System.out.print(num + " ");
        insertionSort(arr);  // Call sorting method
        System.out.println("\nAfter sorting:");
        for (int num:arr)
            System.out.print(num + " ");
    }
}
