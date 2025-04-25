public class BinarySearch_InsertionSort {
    public static void main(String[] args) {
        int[] calls = { 120, 134, 110, 140, 125 };
        insertionSort(calls);
        int target = 140;
        int result = binarySearch(calls, target);
        System.out.println(result != -1 ? "Found: " + target : "Not found");
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key)
                arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
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
