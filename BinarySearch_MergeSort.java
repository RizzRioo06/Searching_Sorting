public class BinarySearch_MergeSort {
    public static void main(String[] args) {
        int[] products = { 55, 22, 77, 33, 99 };
        mergeSort(products, 0, products.length - 1);
        int target = 33;
        int result = binarySearch(products, target);
        System.out.println(result != -1 ? "Found: " + target : "Not found");
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        for (int i = left; i <= right; i++)
            temp[i] = arr[i];
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right)
            arr[k++] = temp[i] <= temp[j] ? temp[i++] : temp[j++];
        while (i <= mid)
            arr[k++] = temp[i++];
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
