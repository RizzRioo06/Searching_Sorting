public class InsertionSortPrices {
    public static void insertionIter(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void insertionRec(int[] arr, int n) {
        if (n <= 1)
            return;
        insertionRec(arr, n - 1);
        int last = arr[n - 1], j = n - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        int[] prices = { 20, 5, 15, 30 };
        insertionIter(prices);
        for (int i : prices)
            System.out.print(i + " ");
    }
}
// This code demonstrates the Insertion Sort algorithm to sort an array of
// integers (prices) in ascending order.
// The iterative method uses a for loop to insert each element into its correct
// position, while the recursive method sorts the first n-1 elements and then
// inserts the nth element.