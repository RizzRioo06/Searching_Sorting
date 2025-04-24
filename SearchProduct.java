//Linear Search for a product in an array of strings
// This code demonstrates both iterative and recursive approaches to search for a product in an array of strings.
public class SearchProduct {
    // Iterative
    public static int searchIter(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key))
                return i;
        }
        return -1;
    }

    // Recursive
    public static int searchRec(String[] arr, String key, int i) {
        if (i >= arr.length)
            return -1;
        if (arr[i].equals(key))
            return i;
        return searchRec(arr, key, i + 1);
    }

    public static void main(String[] args) {
        String[] products = { "Phone", "Laptop", "Mouse", "Keyboard" };
        String target = "Mouse";
        System.out.println("Iterative: " + searchIter(products, target));
        System.out.println("Recursive: " + searchRec(products, target, 0));
    }
}
