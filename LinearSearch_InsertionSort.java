public class LinearSearch_InsertionSort {
    public static void main(String[] args) {
        String[] names = { "Emma", "Alex", "Brian", "Charlie" };
        insertionSort(names);
        String target = "Alex";
        boolean found = linearSearch(names, target);
        System.out.println(found ? "Found Alex" : "Alex not found");
    }

    static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0)
                arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
    }

    static boolean linearSearch(String[] arr, String key) {
        for (String value : arr)
            if (value.equals(key))
                return true;
        return false;
    }
}
