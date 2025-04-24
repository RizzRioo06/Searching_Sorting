import java.util.Arrays;

public class BinarySearchISBN {
    public static int binarySearchRec(String[] arr, String key, int low, int high) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        int cmp = arr[mid].compareTo(key);
        if (cmp == 0)
            return mid;
        else if (cmp > 0)
            return binarySearchRec(arr, key, low, mid - 1);
        else
            return binarySearchRec(arr, key, mid + 1, high);
    }

    public static void main(String[] args) {
        String[] isbns = { "001", "005", "010", "020", "025" };
        Arrays.sort(isbns);
        String find = "010";
        int result = binarySearchRec(isbns, find, 0, isbns.length - 1);
        System.out.println("Binary Search Recursive: " + result);
    }
}
// This code demonstrates a binary search algorithm implemented recursively to
// find an ISBN in a sorted array of strings.
// The binary search algorithm divides the search space in half each time,
// making it more efficient than linear search for large datasets.