public class LinearSearch_MergeSort {
    public static void main(String[] args) {
        String[] names = { "May", "Chanida", "Kim", "Liam" };
        mergeSort(names, 0, names.length - 1);
        boolean found = linearSearch(names, "Chanida");
        System.out.println(found ? "Found Chanida" : "Not found");
    }

    static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(String[] arr, int left, int mid, int right) {
        String[] temp = new String[arr.length];
        for (int i = left; i <= right; i++)
            temp[i] = arr[i];
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right)
            arr[k++] = temp[i].compareTo(temp[j]) <= 0 ? temp[i++] : temp[j++];
        while (i <= mid)
            arr[k++] = temp[i++];
    }

    static boolean linearSearch(String[] arr, String key) {
        for (String s : arr)
            if (s.equals(key))
                return true;
        return false;
    }
}
