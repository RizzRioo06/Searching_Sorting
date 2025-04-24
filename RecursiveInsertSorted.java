public class RecursiveInsertSorted {
    public static int[] insert(int[] arr, int n) {
        int[] newArr = new int[arr.length + 1];
        int i = 0;
        while (i < arr.length && arr[i] < n) {
            newArr[i] = arr[i];
            i++;
        }
        newArr[i] = n;
        while (i < arr.length) {
            newArr[i + 1] = arr[i];
            i++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int[] updated = insert(arr, 25);
        for (int x : updated)
            System.out.print(x + " ");
    }
}
// This code demonstrates how to insert an element into a sorted array while
// maintaining the sorted order.
// The insert method creates a new array with one extra space, copies elements
// from the original array until it finds the right position for the new
// element, and then inserts it.