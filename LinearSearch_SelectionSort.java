public class LinearSearch_SelectionSort {
    public static void main(String[] args) {
        String[] patients = { "Chan", "David", "John Doe", "Alice" };
        selectionSort(patients);
        String target = "John Doe";
        boolean found = linearSearch(patients, target);
        System.out.println(found ? "Patient found" : "Patient not found");
    }

    static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j].compareTo(arr[min]) < 0)
                    min = j;
            String temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    static boolean linearSearch(String[] arr, String key) {
        for (String value : arr)
            if (value.equals(key))
                return true;
        return false;
    }
}
