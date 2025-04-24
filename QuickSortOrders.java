public class QuickSortOrders {
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        double[] orders = { 75.0, 20.5, 99.9, 30.0 };
        quickSort(orders, 0, orders.length - 1);
        for (double o : orders)
            System.out.print(o + " ");
    }
}
// This code demonstrates the Quick Sort algorithm to sort an array of doubles
// (orders) in ascending order.
// The quickSort method recursively partitions the array around a pivot element,
// and the partition method rearranges the elements based on their comparison
// with the pivot.