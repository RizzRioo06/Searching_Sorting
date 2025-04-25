public class BinarySearch_BubbleSort {
    public static void main(String[] args) {
        int[] ids = { 102, 305, 210, 450, 123 };
        bubbleSort(ids);
        int target = 210;
        int result = binarySearch(ids, target);
        System.out.println(result != -1 ? "Found: " + target : "Not found");
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
