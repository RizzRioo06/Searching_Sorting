public class ReverseSelectionSort {
    public static void sortDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[maxIdx])
                    maxIdx = j;
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] sales = { 120, 300, 90, 200 };
        sortDesc(sales);
        for (int s : sales)
            System.out.print(s + " ");
    }
}
// This code demonstrates the Selection Sort algorithm to sort an array of
// integers (sales) in descending order.
// The outer loop iterates through the array, while the inner loop finds the
// maximum element in the unsorted part and swaps it with the first unsorted
// element.