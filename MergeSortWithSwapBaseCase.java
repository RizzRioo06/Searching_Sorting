import java.util.Arrays;

public class MergeSortWithSwapBaseCase {

    public static void mergeSort(int[] data) {
        mSort(data, 0, data.length - 1);
    }

    public static void mSort(int[] data, int low, int high) {
        if ((low < high)) { // recursive case
            int mid = (low + high) / 2; // split into two subarrays
            mSort(data, low, mid); // sort first half
            mSort(data, mid + 1, high); // sort second half
            merge(data, low, mid, high); // merge sorted halves
        } else { // base case
            if (low < high) { // only 2 elements
                if (data[low] > data[high]) {
                    // swap
                    int temp = data[low];
                    data[low] = data[high];
                    data[high] = temp;
                }
            }
            // if one element, do nothing
        }
    }

    public static void merge(int[] data, int low, int mid, int high) {
        int[] temp = Arrays.copyOf(data, data.length);

        int i = low; // left half
        int j = mid + 1; // right half
        int k = low; // merged array index

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                data[k++] = temp[i++];
            } else {
                data[k++] = temp[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            data[k++] = temp[i++];
        }
        // No need to copy the right half; already in place
    }

    // Demo
    public static void main(String[] args) {
        int[] data = { 5, 2, 4, 7, 1, 3, 2, 6 };
        mergeSort(data);

        System.out.println("Sorted Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
