public class SearchCustomer {
    public static int searchIter(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name))
                return i;
        }
        return -1;
    }

    public static int searchRec(String[] names, String name, int i) {
        if (i >= names.length)
            return -1;
        return names[i].equals(name) ? i : searchRec(names, name, i + 1);
    }

    public static void main(String[] args) {
        String[] customers = { "Alice", "Bob", "Charlie", "David" };
        String target = "Charlie";
        System.out.println("Iterative: " + searchIter(customers, target));
        System.out.println("Recursive: " + searchRec(customers, target, 0));
    }
}
// This code demonstrates both iterative and recursive approaches to search for
// a customer name in an array of strings.
// The iterative method uses a for loop to check each element, while the
// recursive method checks the current index and calls itself for the next
// index.