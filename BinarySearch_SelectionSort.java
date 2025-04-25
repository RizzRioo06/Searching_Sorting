public class BinarySearch_SelectionSort {
    public static void main(String[] args) {
        int[] isbns = { 9781, 9783, 9780, 9782 };
        selectionSort(isbns);
        int target = 9782;
        int result = binarySearch(isbns, target);
        System.out.println(result != -1 ? "Found: " + target : "Not found");
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
