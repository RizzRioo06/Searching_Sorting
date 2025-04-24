public class ProductBinarySearch {
    public static int binarySearch(String[] products, String target, int low, int high) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        int cmp = products[mid].compareTo(target);
        return (cmp == 0) ? mid
                : (cmp > 0)
                        ? binarySearch(products, target, low, mid - 1)
                        : binarySearch(products, target, mid + 1, high);
    }

    public static void main(String[] args) {
        String[] items = { "Bag", "Laptop", "Phone", "Tablet" };
        String search = "Phone";
        int result = binarySearch(items, search, 0, items.length - 1);
        System.out.println((result != -1) ? "Product Found" : "Not Found");
    }
}
// This code demonstrates a binary search algorithm implemented recursively to
// find a product in a sorted array of strings.
// The binary search algorithm divides the search space in half each time,
// making it more efficient than linear search for large datasets.