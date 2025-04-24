public class SelectionSortAges {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] ages = { 28, 21, 35, 18 };
        selectionSort(ages);
        for (int age : ages)
            System.out.print(age + " ");
    }
}
// // This code demonstrates the Selection Sort algorithm to sort an array of
// integers (ages) in ascending order.
// // The outer loop iterates through the array, while the inner loop finds the
// minimum element in the unsorted part and swaps it with the first unsorted
// element.