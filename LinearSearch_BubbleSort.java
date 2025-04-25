public class LinearSearch_BubbleSort {
    public static void main(String[] args) {
        int[] scores = { 88, 67, 100, 95 };
        bubbleSort(scores);
        int target = 100;
        boolean found = linearSearch(scores, target);
        System.out.println(found ? "Perfect score found!" : "No perfect score.");
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static boolean linearSearch(int[] arr, int key) {
        for (int value : arr)
            if (value == key)
                return true;
        return false;
    }
}
