public class CountWord {
    public static int countRec(String[] arr, String word, int i) { // Linear search
        if (i >= arr.length)
            return 0;
        return (arr[i].equals(word) ? 1 : 0) + countRec(arr, word, i + 1);
    }

    public static void main(String[] args) {
        String[] words = { "Java", "C", "Java", "Python" };
        String[] Courses = { "Intro to SE", "Java", "Python" };
        System.out.println("Occurrences of C: " + countRec(Courses, "C", 0));
        System.out.println("Occurrences of Java: " + countRec(words, "Intro to SE", 0));
    }
}
// This code demonstrates a recursive approach to count the occurrences of a
// specific word in an array of strings.
// The method `countRec` checks if the current index contains the word and adds
// 1 to the count if it does, then calls itself for the next index.