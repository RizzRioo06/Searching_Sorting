public class TopScorerSearch {
    public static int searchIter(String[] names, String name) {
        for (int i = 0; i < names.length; i++)
            if (names[i].equals(name))
                return i;
        return -1;
    }

    public static int searchRec(String[] names, String name, int i) {
        return (i >= names.length) ? -1 : (names[i].equals(name) ? i : searchRec(names, name, i + 1));
    }

    public static void main(String[] args) {
        String[] names = { "Aung", "Htet", "Myat", "Zin" };
        String topScorer = "Myat";
        System.out.println("Iterative: " + searchIter(names, topScorer));
        System.out.println("Recursive: " + searchRec(names, topScorer, 0));
    }
}
// This code demonstrates both iterative and recursive approaches to search for
// a top scorer's name in an array of strings.
// The iterative method uses a for loop to check each element, while the
// recursive method checks the current index and calls itself for the next
// index.