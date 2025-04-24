public class BubbleSortScores {
    public static void sort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] scores = { 85, 75, 90, 60 };
        sort(scores);
        for (int s : scores)
            System.out.print(s + " ");
    }
}
// This code demonstrates the Bubble Sort algorithm to sort an array of integers
// (scores) in ascending order.
// The outer loop iterates through the array, while the inner loop compares
// adjacent elements and swaps them if they are in the wrong order.