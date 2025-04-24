public class MedianMergeSort {
    public static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    private static void merge(int[] a, int l, int m, int r) {
        int[] L = new int[m - l + 1];
        int[] R = new int[r - m];
        for (int i = 0; i < L.length; i++)
            L[i] = a[l + i];
        for (int i = 0; i < R.length; i++)
            R[i] = a[m + 1 + i];
        int i = 0, j = 0, k = l;
        while (i < L.length && j < R.length)
            a[k++] = (L[i] < R[j]) ? L[i++] : R[j++];
        while (i < L.length)
            a[k++] = L[i++];
        while (j < R.length)
            a[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] data = { 30, 20, 40, 10, 50 };
        mergeSort(data, 0, data.length - 1);
        int median = data[data.length / 2];
        System.out.println("Median: " + median);
    }
}
// This code demonstrates the Merge Sort algorithm to sort an array of integers
// (data) in ascending order and find the median value.
// The mergeSort method recursively divides the array into halves, and the merge
// method combines the sorted halves back together.