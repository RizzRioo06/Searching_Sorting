public class SearchStudentID {
    public static int linearIter(int[] ids, int key) {
        for (int i = 0; i < ids.length; i++)
            if (ids[i] == key)
                return i;
        return -1;
    }

    public static int linearRec(int[] ids, int key, int i) {
        if (i >= ids.length)
            return -1;
        if (ids[i] == key)
            return i;
        return linearRec(ids, key, i + 1);
    }

    public static void main(String[] args) {
        int[] ids = { 101, 203, 305, 407 };
        int key = 305;
        System.out.println("Iterative: " + linearIter(ids, key));
        System.out.println("Recursive: " + linearRec(ids, key, 0));
    }
}
// This code demonstrates both iterative and recursive approaches to search for
// a student ID in an array of integers.
// The iterative method uses a for loop to check each element, while the
// recursive method checks the current index and calls itself for the next
// index.