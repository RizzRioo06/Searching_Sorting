public class MergeSortTotal {
    static int total = 0;

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] L = new int[m - l + 1];
        int[] R = new int[r - m];
        for (int i = 0; i < L.length; i++)
            L[i] = arr[l + i];
        for (int i = 0; i < R.length; i++)
            R[i] = arr[m + 1 + i];
        int i = 0, j = 0, k = l;
        while (i < L.length && j < R.length) {
            total += L[i] + R[j];
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }
        while (i < L.length)
            total += L[i];
        arr[k++] = L[i++];
        while (j < R.length)
            total += R[j];
        arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 6, 1 };
        mergeSort(nums, 0, nums.length - 1);
        System.out.println("Sorted + Total: " + total);
    }
}
// This code demonstrates the Merge Sort algorithm to sort an array of integers
// (nums) in ascending order and calculate the total of all elements during the
// merge process.