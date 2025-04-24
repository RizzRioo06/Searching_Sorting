public class QuickSortWithCount {
    static int swapCount = 0;

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        if (i != j)
            swapCount++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] orders = { 40, 10, 50, 20 };
        quickSort(orders, 0, orders.length - 1);
        for (int o : orders)
            System.out.print(o + " ");
        System.out.println("\\nSwaps: " + swapCount);
    }
}
// This code demonstrates the Quick Sort algorithm to sort an array of integers
// (orders) in ascending order and counts the number of swaps made during the
// sorting process.