public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
        for (int i = n - 1; i > 0; i--) {
            // Move current root (maximum) to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
    void heapify(int arr[], int n, int i) {
        int largest = i;       // Initialize largest as root
        int left = 2 * i + 1;  // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2
        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    static void printArray(int arr[]) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        HeapSort ob = new HeapSort();
        System.out.println("Original array:");
        printArray(arr);

        ob.sort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
